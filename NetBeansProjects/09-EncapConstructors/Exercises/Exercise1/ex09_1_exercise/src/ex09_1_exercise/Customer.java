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
   
    public String setName() {
        return name;        
    }
    
    public void getName(String n) {
        ssn = n;
    }
    
    public String getSSN() {
        return ssn;
    }
}
