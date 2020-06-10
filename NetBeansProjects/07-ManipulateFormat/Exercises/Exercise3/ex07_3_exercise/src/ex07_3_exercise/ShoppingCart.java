/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex07_3_exercise;

/**
 *
 * @author Duane
 */
public class ShoppingCart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int int1;

        //long veryLargeLong = 1_222_333_444L;
        long veryLargeLong = 1_222_333_444_555L;
        int veryLargeInt = 0;
        
        //float veryLargeFloat = 1_222_333_444F;
        float veryLargeFloat = 1_222_333_444_555F;
        char colorCode = 'R';
        
	//  Declare and initialize variables of type long, float, and char.
        
        
        // Print the long variable.
        
        System.out.println("Very Large Long is " + veryLargeLong);
        System.out.println("Color Code Char is (" + colorCode + ")");
        System.out.println("Very Large Float is " + veryLargeFloat);

	// Assign the long to the int and print the int variable.
        
        veryLargeInt = (int) veryLargeLong; 
        System.out.println("Very Large Int is " + veryLargeInt);

    }
    
}
