/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex08_1_exercise;

/**
 *
 * @author Duane
 */
public class ShoppingCart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Item item1 = new Item();
        
        // Call the setColor method on item1. Print the new color value from
        //   item1 if the method returns true.  Otherwise print an "invalid color"
	//   message.
        // Test the class, using both valid and invalid colors.

        // Test invalid color
       
        System.out.println("Testing Invalid Color Code:");
        
        if (item1.setColor(' ')) {
            System.out.println("Color set to " + item1.color);
        }
        else {
            System.out.println("Invalid Color Code");
        }

        // Test valid color 'R'
       
        System.out.println();
        System.out.println("Testing Valid Color Code 'R':");

        if (item1.setColor('R')) {
            System.out.println("Color set to " + item1.color);
        }
        else {
            System.out.println("Invalid Color Code");
        }
      
    }
}
