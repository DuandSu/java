/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex09_1_exercise;

/**
 *
 * @author Duane
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Customer theCustomer = new Customer("Duane", "9999", 123);
        //theCustomer.setRequestNumber(5);
          System.out.println("The Customer Request Number is " + theCustomer.getRequestNumber());
          System.out.println("The Customer SSN is " + theCustomer.getSSN("Duane"));
        //Customer theCustomer = new Customer("Duane Munro");
        //Customer theCustomer = new Customer("Bob Bunny");
        int theRequestNumber;
        
        System.out.println("The Customer Name is " + theCustomer.getName());
        
        theCustomer.setRequestNumber(123456);
        theRequestNumber = theCustomer.getRequestNumber();
        System.out.println("The Customer Request Number is " + theRequestNumber);
        System.out.println("The Customer Request Number is " + theCustomer.getRequestNumber());
        
        theCustomer.setRequestNumber(123456+1);
        System.out.println("The Customer Request Number is " + theCustomer.getRequestNumber());
        
        System.out.println("The Customer SSN is " + theCustomer.getSSN("Duane Munro"));
        System.out.println("The Customer SSN is " + theCustomer.getSSN("Bob Bunny"));
        
        // Testing Warning about using "==" for strings when using "new"
        
        String name1 = "Duane Munro";
        String name2 = "Duane Munro";
        String name3 = new String ("Duane Munro");
        String name4 = new String ("Duane Munro");
        
        System.out.println ("String 1 = " + name1);
        System.out.println ("String 2 = " + name2);
        System.out.println ("String 3 = " + name3);
        System.out.println ("String 4 = " + name4);

        if (name1==name2) {
            System.out.println ("String 1 & 2 are Equal");
        }
        if (name3==name4) {
            System.out.println ("String 3 & 4 are Equal");
        }
    }
}
