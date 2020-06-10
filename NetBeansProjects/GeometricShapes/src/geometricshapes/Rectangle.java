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
 * This Class represents the Rectangle Object.
 */
public class Rectangle {
    // Fields
    public double length;
    public double width;
    public double area;
    public double perimeter;
    
    //Constructor
    public Rectangle () {
        length = 0.0;
        width = 0.0;
        area = 0.0;
        perimeter = 0.0;
    }
    
    //Methods
    
    // Calculate the area using the length and width
    
    public boolean getArea () {
        if (this.length == 0.0 || this.width == 0.0) {
            return false;
        }
        else {
            this.area = this.length * this.width;
            return true;
        }
    }
    
    // Calculate the Perimeter using the length and width
    // Note for Ali: Again I overdid Assignment #2 and leaving with my initial researched from
    // Internet equation of 2*l + 2*w, rather than 2*(l+w), which is essentially the same.
    
    public boolean getPerimeter () {
        if (this.length == 0.0 || this.width == 0.0) {
            return false;
        }
        else {
            this.perimeter = 2 * this.length + 2 * this.width;
            return true;
        }
    }
    
    
}
