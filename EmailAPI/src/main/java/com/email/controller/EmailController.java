package com.email.controller;

import com.email.model.*;
import com.email.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
// if we change the origins value to * it will work for all port numbers.
@RestController
public class EmailController {

    @Autowired
    private EmailService emailService;

    @RequestMapping("/welcome")
    // RequestMapping is used to define the url by which we can call this.(By default its a GET method).
    public String welcome() {
        return "Welcome to my Email Api. Thanks for using our service...";
    }

    //api to send email
    @RequestMapping(value = "/sendemail", method = RequestMethod.POST)
    public ResponseEntity<?> sendEmail(@RequestBody EmailRequest request) {

        System.out.println(request);
        boolean result = this.emailService.sendEmail(request.getSubject(), request.getMessage(), request.getTo());

        if (result) {
            return ResponseEntity.ok("Email is sent successfully...");
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Email not sent...");
        }
    }
}
