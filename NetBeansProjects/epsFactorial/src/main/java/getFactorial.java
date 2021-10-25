
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
public class getFactorial {
    
    public static Scanner numscan = new Scanner(System.in);
    public static Scanner wordscan = new Scanner(System.in);

        
    public static void main(String[] args) {
        
        String name;
        int num = 5;
        
        System.out.println("What is your name? ");
        name = wordscan.nextLine();
        
        System.out.println("What number would you like to factorialize, " + name + "? ");
        num = numscan.nextInt();
        factorialize(num);
        
        String school;
        System.out.println("What school did you go to?");
        school = wordscan.nextLine();
        System.out.println(school + " is a very good school!");
    }
    
    public static void factorialize(int number) {
            
        int factorial = 1;
        if (number < 17) {
            for (int i = 1; i <= number; i++) {
                factorial = factorial * i;
            }                
            System.out.println ("Number " + number + " has factorial of " + factorial);
        }
        else {
            System.out.println ("Number " + number + " is too large to handle");
        }
    }
  
}
