/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentDatabaseApp;

import java.util.Scanner;

/**
 *
 * @author Shane.Cosgrove
 */
public class Student {
    
   private int numberOfStudents;
   private String firstName,lastName;
   private int gradeYear,balance;
   private String studentID,courses;
   private static int coursePrice = 600;
   private static int id = 1000;
    
    //constructor: prompts for student name and year
    public Student (){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student's first name: ");
        this.firstName = sc.nextLine();
        System.out.print("Enter Student's lastt name: ");
        this.lastName = sc.nextLine();
        System.out.print("Enter Student's grade year: ");
        this.gradeYear = sc.nextInt();
        System.out.println(firstName +" "+lastName+" "+gradeYear);
        
    
    }
    //generate an ID
    private void generateStudentID(){
        //Grade level + ID
        id++;
        this.studentID =gradeYear +""+id;
        
    }
    //enrol in courses
    
    //view balance and pay tutition
    
    //print student status
    
  
   
   
    
}
