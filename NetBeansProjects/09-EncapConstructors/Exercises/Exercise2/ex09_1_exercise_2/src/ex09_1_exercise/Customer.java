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
public class Customer {

    // Encapsulate this class.  Make ssn read only.

    private String name;
    private String ssn;
    private int requestNumber;
   
    //Add a custom constructor

    public Customer() {
        name = "";
        ssn = "999888";
        requestNumber = 0;
    }
    
    public Customer (String theName, String theSSN, int theNumber) {
        name = theName;
        ssn = theSSN;
        requestNumber = theNumber;
    }

    public void setName(String theName) {
        name = theName;
    }
    
    public String getName() {
        return name;
    }

    public void setRequestNumber(int theRequestNumber) {
        requestNumber = theRequestNumber;
    }
    
    public int getRequestNumber() {
        return requestNumber;
    }
    
    public String getSSN(String requesterName) {
        if (requesterName == name) {
            return ssn;
        }
        else {
            System.out.println ("You do not have access to request SSN!");
            return "";
        }
    }
}
