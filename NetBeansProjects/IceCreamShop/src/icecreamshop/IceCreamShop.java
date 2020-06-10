/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icecreamshop;

/**
 *
 * @author Duane Munro
 */
public class IceCreamShop {

    /**
     * This program is Assignment 1.1. It calculates the price for 1-3 scoops of an ice cream cone.
     * It also detects and calculates a Sunday discount and accepts a donation.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Define Store Variables, related to Ice Cream Scoops, Prices, Discounts & Donation Variables.
        
        double firstScoopPrice = 5.00, secondScoopPrice = 3.00, thirdScoopPrice = 2.00;
        String sunday = "Sunday", scoopsDesc = "scoop";
        double sundaySaleDiscountPercent = 0.10;
        double defaultDonationAmount = 0.75;
        
        // Define Customer and Day Variables
        
        int numberOfIceCreamScoops = 0;
        String dayOfWeek = "Sunday";
        double finalPrice = 0.0;
        boolean donateIndicator = false;
                
        // Set Test Case
        
        numberOfIceCreamScoops = 3;
        dayOfWeek = "Sunday";
        donateIndicator = true;
        
        // Adjust scoops description if plural.
        
        if (numberOfIceCreamScoops > 1) {
            scoopsDesc = scoopsDesc + "s";
        }
        
        // Calculate final price from number of ice cream scoops.

        if (numberOfIceCreamScoops == 1) {
            finalPrice = firstScoopPrice;
        }
        
        if (numberOfIceCreamScoops == 2) {
            finalPrice = firstScoopPrice + secondScoopPrice;
        }
        
        if (numberOfIceCreamScoops == 3) {
            finalPrice = firstScoopPrice + secondScoopPrice + thirdScoopPrice;
        }

        // Handle order of more than 3 scoops. Display warning and pick 3 scoops.
        
        if (numberOfIceCreamScoops > 3) {
            System.out.println("Sorry. We serve a maximum of 3 scoops per ice cream at this store.");
            numberOfIceCreamScoops = 3;
            finalPrice = firstScoopPrice + secondScoopPrice + thirdScoopPrice;
        }
        
        // Display Ice Cream Scoop order and final price.
        
        if (finalPrice != 0) {
            System.out.println("You ordered an ice-cream with " + numberOfIceCreamScoops + " " + scoopsDesc + ". It's price is $" + finalPrice + ".");
        }
        else {    
            System.out.println("You have picked nothing right now. Please come again. We appreciate your business!");
        }
        
        // Detect Sunday discount, then calculate and display final price if appropriate. If no ice cream scoops ordered, then don't bother.

        if (dayOfWeek == sunday & finalPrice !=0) {
            finalPrice = finalPrice * (1-sundaySaleDiscountPercent);
            System.out.println("It’s Sunday so you got " + sundaySaleDiscountPercent*100 + "% off, just pay $" + finalPrice + ".");
        }
        
        // Detect donation, then calcualte and display final price. Customer can donate without purchasing ice cream.
        
        if (donateIndicator) {
            finalPrice = finalPrice + defaultDonationAmount;
            System.out.println("Thank you for the donation of $" + defaultDonationAmount + "! Please pay $ " + finalPrice + ".");
        }

    }
}
