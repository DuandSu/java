/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tryrecursive;

/**
 *
 * @author Duane
 */
public class TryRecursive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Let's try some recursion.
        final String MAIN_NAME = "TryRecursive";
        int recursionIndex = 1;
         
        System.out.println("Starting Recursion:");
        goRecursive(recursionIndex, 10);
        System.out.println("Recursion Completed:");
        
    }
    static void goRecursive(int recursionIndex, int maxRecursion) {

        int recursiveNumber;
        if (recursionIndex <= maxRecursion) {
            recursiveNumber = recursionIndex;
            System.out.println("This is Recursion #" + recursionIndex++);
            goRecursive(recursionIndex, 10);
            System.out.println("Recursive Local Number =" + recursiveNumber);
        }
        else System.out.println("Exceeded Maximum Recursion so Aborting: " + recursionIndex);
    }    
}
