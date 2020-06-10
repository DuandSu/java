/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometricshapes;

/**
 *
 * @author Duane
 * 
 * This Class represents the Square Object.
 */
public class Square {
    
    public double side;
    public double area;
    public double perimeter;
    
    //Constructor
    public Square () {
        side = 0.0;
        area = 0.0;
        perimeter = 0.0;
    }
    
    //Methods
    
    // Calculate the area using the sides
    
    public boolean getArea () {
        if (this.side == 0.0) {
            return false;
        }
        else {
            this.area = this.side * this.side;
            return true;
        }
    }
    
    // Calculate the Perimeter using the sides
    
    public boolean getPerimeter () {
        if (this.side == 0.0) {
            return false;
        }
        else {
            this.perimeter = 4 * this.side;
            return true;
        }
    }
    
}
