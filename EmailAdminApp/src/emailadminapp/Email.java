/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emailadminapp;


import java.util.Scanner;

/**
 *
 * @author Shane.Cosgrove
 */
public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity;
    private int defaultPasswordLength =8;
    private String alternateEmail;
    private String companySuffix = "testCompany.com";

    //Constructor to receive firstname and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email Created:" +this.firstName +" "+this.lastName);
        
        //Call method asking for Department -return the entered department
        this.department = setDepartment();
        System.out.println("Department is:" +this.department);
        
         //Call method to generate Password -return the Password
        this.password = generatePassword(defaultPasswordLength);
        System.out.println("Password is:" +this.password);
        
        //Combine firstName and lastName with department to make email firstname.lastname@department.company.com
        email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department.toLowerCase()+"."+companySuffix;
        System.out.println("Email:" +this.email);
    }
    
    //ask for department
    private String setDepartment(){
        System.out.print("DEPARTMENT CODES\n1 for Sales\n2 for Deveoplment\n3 for Accounting\n0 for none\nEnter Department Code:");
        Scanner sc = new Scanner(System.in);
       int department = sc.nextInt();
       
       if(department == 1){
           return "Sales";
       }
       else if(department == 2){
           return "Development";
       }
       else if(department == 3){
           return "Accounting";
       }
       else{
           return "";
       }
        
    }
    
    
    //generate random password
    private String generatePassword(int length){
        String passwordSet ="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@$%";
        char[] password = new char[length];
        for(int i = 0; i< length;i++){
            int rand = (int) (Math.random()* passwordSet.length());
            password[i]=passwordSet.charAt(rand);
        }
        return new String(password);
        
    }
    
    //set mailbox capacity
    //set alternate email
    //change pasword

}
