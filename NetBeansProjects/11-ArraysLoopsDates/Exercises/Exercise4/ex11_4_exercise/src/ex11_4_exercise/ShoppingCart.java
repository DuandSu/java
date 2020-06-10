/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex11_4_exercise;

import java.util.ArrayList;

/**
 *
 * @author 533210
 */
public class ShoppingCart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){   
        // Declare, instantiate, and initialize an ArrayList of Strings.  Print and test your code.
    
        ArrayList<String> names = new ArrayList();   
        names.add("Duane");
        names.add("Shelesea");
        names.add("Joseph");
        names.add("Sasha");
        names.add("Christopher");
        names.add("Vicky");
        names.add("Diesel");
        
        System.out.println("Original List from adds: " + names);
        
        // add (insert) another element at a specific index

        names.add(1,"Suzanne");
        System.out.println("List after adding index 1: " + names);

        names.add(0,"Owen");
        names.add("Owen");
        System.out.println("List after adding index 0 and at end: " + names);
        
	// Check for the existence of a specific String element.  
        //   If it exists, remove it.

        names.remove("Owen");
        System.out.println("List after removing first Owen: " + names);

        if (names.indexOf("Owen") > 0) {
            names.remove("Owen");
        }
        System.out.println("List after searching for another Owen and removing it: " + names);
        
    }    
    
}
