
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
public class EX2_Grade_Program_Mine {

    public static void main(String[] args) {

        Scanner numscan = new Scanner(System.in);
        Scanner wordscan = new Scanner(System.in);

        String name;
        String course;
        int percentage;
        String letter;
        String againQuery;
        boolean stillChecking = true;

        while (stillChecking) {

            //
            // print without the ln does not seem to work correctly with the Scanner class
            // or at least it's methods NextLine or NextInt.
            // It prioritizes the scan over the print to out, so you must answer
            // the question before you see the question.
            //
            System.out.println("What is your name? ");
            name = wordscan.nextLine();

            System.out.println("What course are you taking? ");
            course = wordscan.nextLine();

            System.out.println("What percentage did you get? ");
            percentage = numscan.nextInt();

            if (percentage < 50) {
                letter = "an F";
            } else if (percentage < 80) {
                letter = "a C";
            } else {
                letter = "an A";
            }
            System.out.print(name + ", your mark of " + percentage + "% in " + course);
            System.out.println(" is " + letter + ".");
            
            System.out.println("Would you like to check another student? ");
            againQuery = wordscan.nextLine().toLowerCase();

            System.out.println("You answered " + againQuery);
            
            if (againQuery.substring(0,1).equalsIgnoreCase("n"))
                System.out.println("Time to Go!");

            if (againQuery.startsWith("n")) {
                stillChecking = false;
                System.out.print("On a scale from 1 to 10, how good of a computer");
                System.out.println(" am I, 10 being the best");
                double rating = numscan.nextDouble();
                
                System.out.println("You answered: " + rating);
                if (rating < 5) {
                    System.out.println("I am NOT very Good!");
                } else if (rating < 8) {
                    System.out.println("I am OK I guess.");
                } else {
                    System.out.println("I am Pretty Damn good!.");
                }
            }
            
        }
    }
}
