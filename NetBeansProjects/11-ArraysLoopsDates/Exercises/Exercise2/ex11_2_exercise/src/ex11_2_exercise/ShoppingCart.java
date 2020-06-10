/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex11_2_exercise;

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
        String name;
        int age;

        if (args.length < 2) {
            
            System.out.println("Two command line arguments expected. Received only "
            + args.length + ".");
            
        }
        else {

            // Parse the args array to populate name and age.
            
            name = args[0];
            age = Integer.parseInt(args[1]);
        
            // Print an error message if fewer than 2 args are passed in.
            System.out.println("First Argument (Name): " + name +
                ". Second Argument (Age): " + age + ".");
            
        }
    }
    
}
