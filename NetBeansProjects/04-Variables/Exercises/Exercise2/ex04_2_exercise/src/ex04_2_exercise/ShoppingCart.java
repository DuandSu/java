
package ex04_2_exercise;

public class ShoppingCart {
    /*
    *   Author: Duane Munro
    *   Exercise 4-2
    */
    
    public static void main(String[] args) {
        String custName = "Duane Munro";
        String itemDesc = "ASUS Laptop";
        String message = custName+" wants to purchase an "+itemDesc;
        
        // Declare and initialize numeric fields: price, tax, quantity, and total.   
        
        double price = 20.00, tax = 2.0;
        int quantity = 10;
        double total;
        
        // Modify message to include quantity 
        
        message = custName + " wants to purchase " + quantity + " " + itemDesc;
        
        System.out.println(message);
        
        // Calculate total and then print the total cost
        
        total = quantity * (price + tax);
        System.out.println("Total cost with tax of $" + total);
        
    }    
}
