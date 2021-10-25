/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chris1;

/**
 *
 * @author Duane
 */
import java.util.Scanner;

public class Chris1 {

    
    /**
     * @param args the command line arguments
     */
    public static void main (String[] args) {
       Scanner wordscan = new Scanner( System.in );
       Scanner numscan = new Scanner ( System.in );
        
       String name;
       String division;
       int age;
       
       System.out.println("What is your name?");
       name = wordscan.nextLine();
       System.out.println("Welcome to So You Think You Can Haiku. how old are you " + name);
       age = numscan.nextInt();
       System.out.println(name + " you are " + age);
       
       division = "Not Assigned";
       if(age < 18){
           System.out.println("Age is less than 18");
           division = "Junior Division";
       } else if (age > 18){
           System.out.println("Age is greater than 18");
           division = "Senior Division";
       }
       System.out.println("You will be in " + division);  
    }
    
}
