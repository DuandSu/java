/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex07_2_exercise;

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
        
        System.out.println("Exercise 7-1:");
        System.out.println();
        
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
        
        System.out.println();
        System.out.println("Exercise 7-2:");
        System.out.println();

        //Instantiate and initialize sb to firstName.

        StringBuilder sb = new StringBuilder("Duane");

	// Put the full name back together, using StringBuilder append method.
	//   You can just enter the String literal for the last name.
	//   Print the full name.

        lastName = " Munro";

        sb.append(" Munro");
        System.out.println (sb);

        // Extra play. Test replace method with first name.
        
        sb.replace(0, sb.length(), "Duane");
        System.out.println (sb);

        // Test append again with last name without using a literal. Not sure why I did the "sb = " but it still worked. 
        // Probably not good practice. Just leaving to remember.
        
        sb = sb.append(lastName);
        System.out.println (sb);
        
        // Extra Play.
        
        int i = 16;
        System.out.println(++i + " " + i++ + " " + i);
        
    }
}
