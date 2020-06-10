/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex05_2_exercise;

/**
 *
 * @author Duane
 */
public class ShoppingCart {

    public static void main(String[] args) {
        // local variables
        String custName = "Mary Smith";
        String message = custName + " wants to purchase a several items.";

        //Declare and initialize the items String array
        
        String[] items = {"Shirt", "Trousers", "Socks", "Shoes"};

        // Change message to show the number of items purchased.
        
        message = custName + " wants to purchase " + items.length + " item";
        //System.out.print(message);

        if (items.length > 1) message = message + "s";
        
        System.out.print(message);
        System.out.println(".");
        
        // Print an element from the items array.  
        
        System.out.println("Item #1 is a " + items[0]);
        System.out.println("Item #2 is a " + items[1]);
        System.out.println("Item #3 is a " + items[2]);
        System.out.println("Item #4 is a " + items[3]);
        //System.out.println("Inex #4 is a " + items[4]);

    }
}
