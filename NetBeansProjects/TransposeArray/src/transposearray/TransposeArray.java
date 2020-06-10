/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transposearray;

/**
 *
 * @author Duane Munro
 * This is the solution for Assignment 4 Exercise 2.
 */
public class TransposeArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Define and Instantiate Original Array
        
        int [][] originalArray = new int[2][3];
        
        // Use for loop to Initialize by 10 increments 
        
        int valueByTen = 10;
        
        for (int i = 0; i < originalArray.length; i++) {
            for (int j = 0; j < originalArray[i].length; j++) {
                originalArray[i][j] += valueByTen;
                valueByTen += 10;
            }
        }
    
        // Use method to print the array
        System.out.println("Original Array: ");
        printArray(originalArray);
    
        int [][] transposedArray = new int[3][2];
        transposedArray = transpose(originalArray);
        
        System.out.println("Transposed Array: ");
        printArray(transposedArray,1);
    
    }
    
    /*
    ** Receive 2-Dimensional Array as Arg1. Reverse the row and column to transpose
    ** the array and return this new transposed 2-Dimensional array.
    */
    public static int[][] transpose(int[][] originalArray) {
        
        int [][] transposedArray = new int[originalArray[0].length][originalArray.length];

        for (int i = 0; i < originalArray.length; i++) {
            for (int j = 0; j < originalArray[i].length; j++) {
                transposedArray[j][i] = originalArray[i][j] ;
            }
        }
        
        return transposedArray;
    }
    
    /*
    ** Print a 2-Dimensional array that is passed as arg1.
    ** By default use the for loop if only one argument.
    */
    public static void printArray(int[][] originalArray) {
        
        System.out.println("Printing with for loop: ");

        for (int i = 0; i < originalArray.length; i++) {
            for (int j = 0; j < originalArray[i].length; j++) {
                System.out.print(originalArray[i][j] + " ");
            }
            System.out.print("\n");
        }
     }
    /*
    ** Print a 2-Dimensional array that is passed as arg1.
    ** If Arg2 exists then use while loop. Value doesn't matter so no check.
    */
    public static void printArray(int[][] originalArray, int useWhileLoop) {
        
        System.out.println("Printing with while loop: ");

        int i = 0; int j = 0;
        while (i < originalArray.length) {
            while (j < originalArray[i].length) {
                System.out.print(originalArray[i][j] + " ");
                j++;
            }
            i++;
            j=0;
            System.out.print("\n");
        }
     }
}
