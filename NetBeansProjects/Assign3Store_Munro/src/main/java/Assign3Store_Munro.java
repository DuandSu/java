
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Duane
 */
public class Assign3Store_Munro {
    
    public static void main(String[] args){
        
        Scanner numscan = new Scanner(System.in);
        Scanner wordscan = new Scanner(System.in);
        
        String[] productName = {"Guitar", "Piano", "Keyboard", "Trumpet", 
            "Saxaphone", "Drum", "Banjo", "Ukelele", "Flute", "Xylophone"};
        float[] productPrice = {750, 1400, 600, 550, 700, 1200, 500, 70, 325, 175};
        int[] numBought =  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int pickedID;
        int numberPicked = 0;
        String answerKeepShopping = "Yes";
        
        boolean keepShopping = true;
        while (keepShopping) {
            printProductList(productName, productPrice);
            System.out.println("Please enter the ID number of the product you would like to purchase: ");
            pickedID = numscan.nextInt();
            if (pickedID >= 0 && pickedID < productName.length) {
                System.out.println("You chose product " + pickedID + ". How many " + productName[pickedID] + " would you like to purchase?");
                numberPicked = numscan.nextInt();
                numBought[pickedID] = numberPicked;
                System.out.println();
                System.out.println(numberPicked + " " + productName[pickedID] + " comes to $" + (numberPicked * productPrice[pickedID]));
                    
            } else {
                System.out.println("You picked " + pickedID + " which is an invalid ID number. Please Try Again.");
            }
            
            System.out.println("Would you like to keep shopping? ");
            answerKeepShopping = wordscan.nextLine();
            if (answerKeepShopping.toLowerCase().startsWith("n")) {
                keepShopping = false;
                printPurchase(productName, productPrice, numBought);
            }
        }
    }
    
    public static void printProductList(String [] productName, float[] productPrice) {
        System.out.println();
        System.out.println("Products Available for Purchase:");
        System.out.println("Product #   Name    Cost");
        for (int i = 0; i < productName.length; i++) {
            System.out.println(i + "    " + productName[i] + "  $" + productPrice[i]);
        }
    }
    
    public static void printPurchase(String [] productName, float[] productPrice, int[] numBought) {
        
        float totalBill = 0;
        
        System.out.println();
        System.out.println("Final Bill:");
        System.out.println("Product Price   Num Bought    Total");
        for (int i = 0; i < numBought.length; i++) {
            if (numBought[i] > 0) {
                float totalLine = numBought[i] * productPrice[i];
                totalBill += totalLine;
                System.out.println(productName[i] + "   $" + productPrice[i] + "    x " + numBought[i] + "  $" + totalLine);
            }
        }
        System.out.println();
        System.out.println("Total               " + totalBill);
    }
}
