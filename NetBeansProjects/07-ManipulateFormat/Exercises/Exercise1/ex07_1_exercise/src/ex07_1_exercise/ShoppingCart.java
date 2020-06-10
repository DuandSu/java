/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex07_1_exercise;

/**
 *
 * @author Duane
 */
public class ShoppingCart {

    /**
     * @param args the command line arguments
     */

    public static void main (String[] args){
        String custName = "Duane Munro";
        String firstName, lastName;
        int spaceIndex;
        
        // Get the index of the space character (" ") in custName. 

        spaceIndex = custName.indexOf(" ");
        System.out.println (spaceIndex);

        // Use the substring method parse out the first name and print it.
        if (spaceIndex !=0) {
        
            firstName = custName.substring(0, spaceIndex);
            lastName = custName.substring(spaceIndex+1, custName.length());
            System.out.println("First Name is " + firstName + ".");
            System.out.println("Last name is " + lastName + ".");
            
        }
    }
}
