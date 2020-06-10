/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VietnameseSudukoPuzzle;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;

/**
 *
 * @author Duane
 */
public class VietnameseSudukoPuzzle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int MINIMUM_ATTEMPT = 1;
        final int A_MAXIMUM_ATTEMPT = 9;
        final int B_MAXIMUM_ATTEMPT = 9;
        final int C_MAXIMUM_ATTEMPT = 9;
        final int D_MAXIMUM_ATTEMPT = 9;
        final int E_MAXIMUM_ATTEMPT = 9;
        final int F_MAXIMUM_ATTEMPT = 9;
        final int G_MAXIMUM_ATTEMPT = 9;
        final int H_MAXIMUM_ATTEMPT = 9;
        final int I_MAXIMUM_ATTEMPT = 9;
        long matchCount = 0;
        long puzzleCheck;
        
        String currentAnswer = "No Answer Yet";
        ArrayList <String> finalAnswers = new ArrayList();
        
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("START Date/Time = " 
            + currentDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));
        
        for (int a = MINIMUM_ATTEMPT; a <= A_MAXIMUM_ATTEMPT; a++) {
            for (int b = MINIMUM_ATTEMPT; b <= B_MAXIMUM_ATTEMPT; b++) {
                for (int c = MINIMUM_ATTEMPT; c <= C_MAXIMUM_ATTEMPT; c++) {
                    for (int d = MINIMUM_ATTEMPT; d <= D_MAXIMUM_ATTEMPT; d++) {
                        currentDateTime = LocalDateTime.now();
                        System.out.println(currentDateTime.format(
                            DateTimeFormatter.ofLocalizedDateTime(
                            FormatStyle.MEDIUM)) + ": a=" + a + "\tb=" + b 
                            + "\tc=" + c + "\td=" + d);
                        for (int e = MINIMUM_ATTEMPT; e <= E_MAXIMUM_ATTEMPT; e++) {
                            for (int f = MINIMUM_ATTEMPT; f <= F_MAXIMUM_ATTEMPT; f++) {
                                for (int g = MINIMUM_ATTEMPT; g <= G_MAXIMUM_ATTEMPT; g++) {
                                    for (int h = MINIMUM_ATTEMPT; h <= H_MAXIMUM_ATTEMPT; h++) {
                                        for (int i = MINIMUM_ATTEMPT; i <= I_MAXIMUM_ATTEMPT; i++) {
                                            /* Need to ensure that each number between 1 & 9 are only used once
                                            ** Also need to ensure that anything divided has a modulus of 0, so no
                                            ** fractions.
                                            */
                                            if ((a != b && a != c && a != d && 
                                                a != e && a != f && a != g &&
                                                a != h && a != i) &&
                                                (b != c && b != d && b != e && 
                                                b != f && b != g && b != h && 
                                                b != i) &&
                                                (c != d && c != e && c != f && 
                                                c != g && c != h && c != i) &&
                                                (d != e && d != f && 
                                                d != g && d != h && d != i) &&
                                                (e != f && e != g && e != h && 
                                                e != i) &&
                                                (f != g && f != h && f != i) &&    
                                                (g != h && g != i) &&    
                                                (h != i) &&
                                                ((13 * b) % c) == 0 &&
                                                ((g * h) % i) == 0) {
                                                puzzleCheck = a + ((13 
                                                    * b) / c) + d + (12 * e) - f 
                                                    - 11 + ((g * h) / i) - 10;
                                                if (puzzleCheck == 66) {
                                                    matchCount ++;
                                                    currentDateTime = LocalDateTime.now();
                                                    currentAnswer = 
                                                        currentDateTime.format(
                                                        DateTimeFormatter.ofLocalizedDateTime(
                                                        FormatStyle.MEDIUM))
                                                        + ": " + a 
                                                        + " + 13 * " + b + " % " 
                                                        + c + " + " + d + " + 12 * " 
                                                        + e + " - " + f + " - 11 + " 
                                                        + g + " * " + h + " % " + i 
                                                        + " - 10 = "
                                                        + puzzleCheck;
                                                    finalAnswers.add(currentAnswer);
                                                    //System.out.println(currentAnswer);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        /*
        ** Ensure there was at least 1 answer before trying to reference the ArrayList.
        ** Like arrays the index go from 0 to (size-1).
        */
        if (finalAnswers.size() !=0) {
            for (int i = 0; i < finalAnswers.size(); i++) {
                System.out.println("Answer # " + (i+1) + " = " + finalAnswers.get(i));
            }
        }
        
        currentDateTime = LocalDateTime.now();
        System.out.println("DONE: " + currentDateTime.format(
            DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)) 
            + ": Number of Matches = " + matchCount + ": ");
    }
}
