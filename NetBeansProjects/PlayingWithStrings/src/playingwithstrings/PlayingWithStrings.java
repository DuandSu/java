/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playingwithstrings;

/**
 *
 * @author Duane Munro
 * 
 * This is Assignment #2, Exercise #2.
 * My understanding of what is requested here is to research a number of String methods. Chosse some of these methods. Name them, give a brief explanation of my understanding of the
 * method and show some examples of how it is used. It doesn't really say how many examples. Hopefully this is enough. If you need more I would gladly come up with more examples.
 */

public class PlayingWithStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create some constants
        final String DOCTOR = "Dr.";
        final String MISTER = "Mr.";
        
        // Create Variables for Names
        String titleName = "";
        String firstName = "Duane";
        String middleName = "William";
        String lastName = "Munro";
        String fullName = "";
        
        // Create First and Middle Name using standard concatonation. Standard concatenation simply
        // uses a "+" symbol as syntax to append Sting variables or String literals together. The result
        // ends up in the variable being assigned to.
        
        fullName = firstName + " " + middleName;
        System.out.println ("Name without title and last name: " + fullName);
        
        // Add the last name using concat method. This method works very similar to the standard concatonation symbol.
        // The paramater passed can be a single String variables or String literal, or you can use the concatenation symbol "+"
        // for any combination of those.
        
        fullName = fullName.concat(" ");
        fullName = fullName.concat(lastName);
        System.out.println ("Name without title: " + fullName);

        // Add Title with standard concatonation. The only addition to this is showing that you can also concatonate a String Constant in same
        // way.
        
        titleName = MISTER;
        fullName = titleName + " " + fullName;
        System.out.println ("Full Name: " + fullName);
        
        // Change Middle Name to Middle Initial using standard concatonation, substring and indexOf. The substring will pick out a piece of string, or a substring of the original string.
        // This example shows 2 scenarios. The first scenario passes the starting string index and the number of characters after the index. The last scenario simply takes the staring index
        // and pulls out everything to the end of the string. The indexOf method returns the index of where the search string is found and starts in the string. In this example it is
        // looking for the middle name, where the first character starts, or index of the first character of that middle name in the string.
        
        fullName = fullName.substring(0,fullName.indexOf(middleName)) + middleName.substring(0,1) + ". " + fullName.substring(fullName.indexOf(lastName));
        System.out.println ("Full Name with only Middle Initial: " + fullName);
        
        // Title Change becoming a Doctor, using the replaceFirst method. The first parameter is the string to be searched for. The second parameter is the replacement string that will
        // replace the string in the first parameter, but for this method it will only replace the first instance of that. This is convenient for replacing the title which is always at
        // the start.
        
        fullName = fullName.replaceFirst(titleName, DOCTOR);        
        System.out.println ("Full Name after becoming a Doctor: " + fullName);
        
        // Change everything to uppercase, using the toUpperCase method. This is pretty simple method that converts all the character text in a string to capitals or upper case
        // characters.

        fullName = fullName.toUpperCase();        
        System.out.println ("Full Name in Upper Case: " + fullName);
}
    
}
