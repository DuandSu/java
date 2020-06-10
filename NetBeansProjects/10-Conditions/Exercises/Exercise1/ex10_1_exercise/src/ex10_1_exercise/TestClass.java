/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex10_1_exercise;

/**
 *
 * @author Duane Munro
 */
public class TestClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 4, y = 20;
        //int x = 4, y = 9;
        if (y / x < 3) {
            x += y;
        } else {
            x *= y;
        }
        System.out.println("After if stmt, x = " + x);
        
         // Use a ternary operator to perform the same logic as above.

        x = 4;
        x = ((y / x) < 3) ? (x += y) : (x *= y);
        System.out.println("After ternary stmt, x = " + x);
        
         // Use a ternary operator directly in print.

        x = 4;
        //x = ((y / x) < 3) ? (x += y) : (x *= y);
        System.out.println("Ternary in Print, x = " + (((y / x) < 3) ? (x += y) : (x *= y)));
}
    
}
