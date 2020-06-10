/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex05_1_exercise;

/**
 *
 * @author Duane
 */
public class ShoppingCart {
    public static void main(String[] args) {
        String custName = "Duane Munro";
        String itemDesc = "ASUS Laptop";

	// numeric fields
        double price = 20.00;
        int quantity = 1;
        double tax = 2.00;
	double total;
	String message = custName+" wants to purchase "+quantity+" "+itemDesc;

	// Calculating total cost
        total = price*(quantity+tax);

        
        // Declare outOfStock variable and initialize it
        
        boolean outOfStock = false;
        
        // Test quantity and modify message if quantity > 1.  
        
        outOfStock = quantity < 1;
        if (quantity > 1 || quantity == 0) message = message + "s";
            
        System.out.print (message);
        System.out.println(".");


        // Test outOfStock and notify user in either case.  
        
        if (outOfStock) {
            System.out.println("We are out of stock.");
        }
        else {
            System.out.println("We have " + quantity + ". Total cost with tax $" + total + ".");
        }
    }
}
