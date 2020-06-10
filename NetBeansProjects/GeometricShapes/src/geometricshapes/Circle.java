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
 * This Class represents the Circle Object.
 */
public class Circle {
    
    static final double VALUE_OF_PI = 3.14159;
    
    public double radius;
    public double diameter;
    public double area;
    public double perimeter;

    
    //Constructor
    public Circle () {
        radius = 0.0;
        diameter = 0.0;
        area = 0.0;
        perimeter = 0.0;
    }
    
    //Methods
    
    // Calculate the area using the radius first, since that is in the standard equation, but if it is 0, then checking the diameter. 
    // The side effect benefit is that as long as either one of radius or diameter is set. It will
    // Calculate the other. Since radius is the priority it will overwrite the diameter if it already has a value.
    
    public boolean getArea () {
        if (this.radius == 0.0) {
            if (this.diameter == 0.0) {
                // If both radius and diameter are 0. Return error.
                return false;
            }
            else {
                this.radius = this.diameter / 2;
                this.area = VALUE_OF_PI * Math.pow(this.radius, 2);
                return true;
            }
        }
        else {
            this.diameter = this.radius * 2;
            this.area = VALUE_OF_PI * Math.pow(this.radius, 2);
            return true;
        }
    }
    
    // Calculate the perimeter using the diameter first, since that is in the standard equation, but if it is 0, then checking the radius. 
    // The side effect benefit is that as long as either one of radius or diameter is set. It will
    // Calculate the other. Since diameter is the priority it will overwrite the radius if it already has a value.
    // NOTE for Ali: As you remember I overdid Assignment #2 and had already done the perimeter for the circle. I just left the equation
    // as is from what I found on the internet. It is essentially the same, that is, times the diameter versus 2 time the radius.
    
    public boolean getPerimeter () {
        if (this.diameter == 0.0) {
            if (this.radius == 0.0) {
                // If both radius and diameter are 0. Return error.
                return false;
            }
            else {
                this.diameter = this.radius * 2;
                this.perimeter = VALUE_OF_PI * this.diameter;
                return true;
            }
        }
        else {
            this.radius = this.diameter / 2;
            this.perimeter = VALUE_OF_PI * this.diameter;
            return true;
        }
    }
    
}
