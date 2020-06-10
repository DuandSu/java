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
public class Item {
    
    String desc;
    int quantity;
    double price;
    char colorCode = 'U';   //'U' = Undetermined

    public void displayItem(String theScenario) {
        System.out.println();
        System.out.println(theScenario);
        System.out.println("\tItem Description: " + this.desc);
        System.out.println("\tQuantity: " + this.quantity);
        System.out.println("\tPrice: " + this.price);
        System.out.println("\tColor Code: " + this.colorCode);
    }

    // Write a public 3-arg setItemFields method that returns void.
    
    public void setItemFields(String theDesc, int theQuantity, double thePrice) {
        this.desc = theDesc;
        this.quantity = theQuantity;
        this. price = thePrice;
    }

    // Write a public 4-arg setItemFields method that returns an int.
    
    public int setItemFields(String theDesc, int theQuantity, double thePrice, char theColorCode) {
        if (theColorCode == ' ')
            return -1;
        else {
            this.colorCode = theColorCode;
            this.setItemFields(theDesc, theQuantity, thePrice);
            return 0;
        }
    }
    
}
