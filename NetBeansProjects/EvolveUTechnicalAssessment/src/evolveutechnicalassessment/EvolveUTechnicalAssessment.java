/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evolveutechnicalassessment;

/**
 *
 * @author Duane
 */
public class EvolveUTechnicalAssessment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number1 = 10;
        int number2 = 30;
        int number3 = 20;
        int maxNumber;
        int minNumber;
        
        maxNumber = findMaxNumber(number1, number2);
        System.out.println("The Maximum Number from " + number1 + " and " +
            number2 + " is " + maxNumber + ".");
        minNumber = findMinNumber(number1, number2, number3);
        System.out.println("The Minimum Number from " + number1 + ", " + number2 
            + " and " + number3 + " is " + minNumber + ".");
        
    }

    public static int findMaxNumber(int n1, int n2) {
        if (n1 >= n2) return n1;
        else return n2;
    }

    public static int findMinNumber(int n1, int n2, int n3) {
        if (n1 <= n2 && n1 <= n3) return n1;
        // else if (n2 <= n1 && n2 <= n3) return n2;
        else if (n2 <= n3) return n2;
        else return n3;
    }
}
