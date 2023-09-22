package com.email.service;

import javax.mail.*;
import javax.mail.internet.*;

import org.springframework.stereotype.Service;

import java.util.Properties;

@Service
public class EmailService {

    public boolean sendEmail(String subject, String message, String to) {
        // code for sending email
        String from = "jaysinha343@gmail.com";
        boolean f = false;

        //Variable for gmail
        String host = "smtp.gmail.com";

        Properties properties = System.getProperties();
        System.out.println("PROPERTIES " + properties);

        //setting important information to properties object

        //host set
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");

        //Step 1: to get the session object.
        Session session = Session.getInstance(properties, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("jaysinha343@gmail.com", "**********");  //refer help.md file
            }
        });
        session.setDebug(true);

        //Step 2: Compose the message[text,multi media]
        MimeMessage m = new MimeMessage(session);

        try {

            //from email
            m.setFrom(from);

            //adding recipient to message
            m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            //adding subject to message
            m.setSubject(subject);
            //adding text to message
            m.setText(message);

            //send
            //Step 3: Send message using Transport class
            Transport.send(m);
            System.out.println("Email Sent Successfully..");
            f = true;

        } catch (Exception e) {
            e.printStackTrace();

        }
        return f;
    }
}
