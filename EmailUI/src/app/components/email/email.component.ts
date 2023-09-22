import { Component, OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { EmailService } from 'src/app/service/email.service';

@Component({
  selector: 'app-email',
  templateUrl: './email.component.html',
  styleUrls: ['./email.component.css']
})
export class EmailComponent implements OnInit{

  //blank object to store these field values
  data={
    to:"",
    subject:"",
    message:""
  }
// for hinding unhiding the spinner
  flag=false;

  constructor(private email:EmailService,private snak:MatSnackBar) { }

  ngOnInit(): void {
    
  }

  doSubmitForm()
  {
    console.log("Form submitted successfully");
    console.log("DATA ", this.data);

    if(this.data.to=='' || this.data.message=='' || this.data.subject=='')
    {
      this.snak.open("Please enter the values.Fields cannot be empty!!","OK")
      return; 
    }

    this.flag=true;
    this.email.sendEmail(this.data).subscribe(
      response=>{
        console.log(response);
        this.flag=false;
        this.snak.open("Send Seccess ","OK");
      },
      error=>{
        console.log(error);
        this.snak.open("Error ","OK");
      }
      
    )
  }
  

}
