/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex05_3_exercise;

/**
 *
 * @author Duane
 */
public class ShoppingCart {

    public static void main(String[] args) {
        // local variables
        String custName = "Mary Smith";
        String message;
        double price = 21.99;
        int quantity = 2;
        double tax = 1.04;

        String[] items;
        items = new String[4];
        items[0] = "Shirt";
        items[1] = "Belt";
        items[2] = "Scarf";
        items[3] = "Skirt";
        
        message = custName + " wants to purchase "+items.length+" items.";
        System.out.println(message);
        
       // Iterate through and print out the items from the items array
       int indexCounter =0;
       System.out.println("Items purchased: ");
       
       for (String item : items) 
           System.out.println("Item #" + (++indexCounter) + " is: " + item);
       
        // Extra In-Class Exercise

        boolean foundSearchItem = false;
        String searchItem = "";
        String foundItem = "";
        int indexFound = -1;
    
        // Check for Belt.
        
        searchItem = "Belt";
        
        System.out.println ();
        System.out.println ("Purchased the Following and Searching for " + searchItem);
        System.out.println ();
        
        indexCounter = 0;
        foundSearchItem = false;

        for (String item : items) {
            System.out.println ("Item Purchased is " + item);
            if (item == searchItem) {
                foundSearchItem = true;
                foundItem = item;
                indexFound = indexCounter + 1;
            }
            indexCounter++;
        }
        
        System.out.println ();
        if (foundSearchItem) {
            System.out.println ("Found at least one " + foundItem + " as Item number " + indexFound);
        }
        else {
            System.out.println ("Did NOT find a " + searchItem + ".");
        }    
        
        // Check for T-Shirt
        
        searchItem = "T-Shirt";
        
        System.out.println ();
        System.out.println ("Searching for " + searchItem);
        System.out.println ();

        indexCounter = 0;
        foundSearchItem = false;
        
        for (String item : items) {
            System.out.println ("Item is " + item);
            if (item == searchItem) {
                foundSearchItem = true;
                foundItem = item;
                indexFound = indexCounter + 1;
                break;
            }
            indexCounter++;
        }
        
        System.out.println ();
        if (foundSearchItem) {
            System.out.println ("Found: " + foundItem + " as Item number " + indexFound);
        }
        else {
            System.out.println ("Did NOT find a " + searchItem + ".");
        }    
        
        // Check for T-Shirt
        
        searchItem = "Scarf";
        
        System.out.println ();
        System.out.println ("Searching for " + searchItem);
        System.out.println ();

        indexCounter = 0;
        foundSearchItem = false;
        
        for (String item : items) {
            System.out.println ("Item is " + item);
            if (item == searchItem) {
                foundSearchItem = true;
                foundItem = item;
                indexFound = indexCounter + 1;
                break;
            }
            indexCounter++;
        }
        
        System.out.println ();
        if (foundSearchItem) {
            System.out.println ("Found: " + foundItem + " as Item number " + indexFound);
        }
        else {
            System.out.println ("Did NOT find a " + searchItem + ".");
        }    
    }    
}
