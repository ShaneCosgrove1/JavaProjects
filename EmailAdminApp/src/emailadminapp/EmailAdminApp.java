/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emailadminapp;

/**
 *
 * @author Shane.Cosgrove
 */
public class EmailAdminApp {

    public static void main(String[] args) {
        Email em1 = new Email("Shane","Cosgrove");
        
        em1.setAlternateEmail("Shane.cosgrove@outlook.com");
        System.out.println(em1.showInfo());
        
    }
    
}
