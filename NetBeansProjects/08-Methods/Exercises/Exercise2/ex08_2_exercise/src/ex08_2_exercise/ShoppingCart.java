/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex08_2_exercise;

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
        item1.displayItem("Item1 Before setItemFields: ");

        // Call the 3-arg setItemFields method and then call displayItem.

        item1.setItemFields("Shirt", 1, 10.00);
        item1.displayItem("Item1 After 3-Param setItemFields: ");
        
        // Call the 4-arg setItemFields method, checking the return value.  

        if (item1.setItemFields("Shirt", 2, 20.00, 'R') == -1) {
            System.out.println("Item1 After 4-Param setItemFields. Valid ColorCode: ");
            System.out.println("\tInvalid Color Code. Item Values NOT set.");
        }
        else {
            item1.displayItem("Item1 After 4-Param setItemFields. Valid ColorCode: ");
        }

	// Test your code for both valid and invalid values


        if (item1.setItemFields("Shirt", 3, 30.00, ' ') == -1) {
            System.out.println();
            System.out.println("Item1 After 4-Param setItemFields. Invalid ColorCode: ");
            System.out.println("\tInvalid Color Code. Item Values NOT set.");
            item1.displayItem("Item1 After Invalid Color Code: ");
        }
        else {
            item1.displayItem("Item1 After 4-Param setItemFields. Valid ColorCode: ");
        }
 
    }
    
}
