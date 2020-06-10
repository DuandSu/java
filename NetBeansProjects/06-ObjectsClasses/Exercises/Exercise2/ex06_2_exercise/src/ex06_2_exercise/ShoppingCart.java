/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex06_2_exercise;

/**
 *
 * @author Duane
 */
public class ShoppingCart {

    /**
     * @param args the command line arguments
     */

     public static void main(String args[]) {
        // Declare and initialize 2 Item objects

	Item shirt = new Item();
        Item pants = new Item();
        

	// Print both item descriptions and run code.
        
        shirt.desc = "Shirt";
        pants.desc = "Pants";
        System.out.println("There are 2 Items: " + shirt.desc + " and " + pants.desc + ".");

	// Assign one item to another and run it again.

        pants = shirt;
        System.out.println("There are 2 Items: " + shirt.desc + " and " + pants.desc + ".");
     }
    
}
