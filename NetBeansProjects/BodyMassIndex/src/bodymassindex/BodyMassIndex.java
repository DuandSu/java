/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodymassindex;

/**
 *
 * @author Duane
 */
public class BodyMassIndex {

    /**
     * @param args the command line arguments
     * 
     * This program is Assignment 1.2. It the Body Mass Index (BMI) and displays
     * results and message to client.
     * 
     */
    public static void main(String[] args) {
        
        // Define Customer Variables
        
        double clientBMI = 0, weightInKg = 0, heightInMetres = 0;
        
        // Set Test Case 
        
        // Set Test Case Overweight
        
        //heightInMetres = 1.72;
        //weightInKg = 75;
        
        // Set Test Case Underweight
        
        //heightInMetres = 1.85;
        //weightInKg = 60;
        
        // Set Test Case Optimum
        
        heightInMetres = 1.80;
        weightInKg = 80;

        // Display Height and Weight
        
        System.out.println("Height in cm: " + (heightInMetres*100));
        System.out.println("Weight in Kg: " + weightInKg);
        System.out.println();
        
        // Calcualte the BMI. But ensure no divide by height of 0.
        
        if (heightInMetres !=0) {

	    // Initially used easy calculation, but after research fould the "pow"er function.
            // clientBMI = weightInKg / (heightInMetres * heightInMetres); 

            clientBMI = weightInKg / Math.pow(heightInMetres,2);
            
            System.out.println ("BMI is " + clientBMI + ".");

        }
        else  {    

            System.out.println ("Height cannot be zero.");

        }
        
        // Display client information of fitness based on BMI.
        
        if (clientBMI < 18.5 & heightInMetres !=0) {
            
            System.out.println("You are underweight.");
            System.out.println("You are " + (18.5 - clientBMI) + " points under.");
            
        }

        if (clientBMI > 25 & heightInMetres !=0) {
            
            System.out.println("You are overweight.");
            System.out.println("You are " + (clientBMI - 25) + " points over.");
            
        }

        if (clientBMI >= 18.5 & clientBMI <= 25 & heightInMetres !=0) {
            
            System.out.println("Your BMI is optimal.");
            
        }
    }
    
}
