/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex08_1_exercise;

/**
 *
 * @author Duane
 */
public class Item {

    char color;
    
    // declare and code the setColor method
    
    public  boolean setColor(char theColorCode) {
        if (theColorCode == ' ')
            return false;
        else {
            this.color = theColorCode;
            return true;
        }
    }
}
