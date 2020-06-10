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
 * This Class represents the Triangle Object.
 */

public class Triangle {
    
    static final double ANGLE_180 = 180.0;
    static final double ANGLE_90 = 90.0;
    static final char ANGLE_CHECK = 'A';
    static final char SIDE_CHECK = 'S';

    public double sideA;
    public double sideB;
    public double sideC;
    public double angleA;
    public double angleB;
    public double angleC;
    public double base;
    public double height;
    public double area;
    public double perimeter;

    //Constructor
    public Triangle () {
        sideA = 0.0;
        sideB = 0.0;
        sideC = 0.0;
        base = 0.0;
        height = 0.0;
        area = 0.0;
        perimeter = 0.0;
    }
    
    //Methods
    
    // Check side properties are okay
    
    public boolean checkSides () {
        if ((this.sideA + this.sideB) > this.sideC) {
            return true;
        }
        else {
            return false;
        }
    }
    
    // Check angle properties are okay
    
    public boolean checkAngles () {
        if ((this.angleA + this.angleB + this.angleC) == ANGLE_180) {
            return true;
        }
        else {
            return false;
        }
    }
    
    // Calculate the area using the base and height
    
    public boolean getArea () {
        if (this.base == 0.0 || this.height == 0.0) {
            return false;
        }
        else {
            this.area = (this.base * this.height) / 2;
            return true;
        }
    }

    // Calculate the Perimeter using the 3 sides
    
    public boolean getPerimeter () {
        if (this.sideA == 0.0 || this.sideB == 0.0 || this.sideC == 0.0) {
            return false;
        }
        else {
            this.perimeter = this.sideA + this.sideB + this.sideC;
            return true;
        }
    }

    // Print Triangle Type
    // checkMethod will determine whether check is by Angle or Side Method. This main method uses double.
    
    public void printTriangleType (double param1, double param2, double param3, char checkMethod) {
        
        if (checkMethod == ANGLE_CHECK) {
            if (param1 == 0.0 || param2 == 0.0 || param3 == 0.0) {
                System.out.println("Can NOT determine Triangle Type - One or more of the angles is zero: " 
                        + param1 + ", " + param2 + " and " + param3 + ".");
            }
            else {
                if (param1 < ANGLE_90 && param2 < ANGLE_90 && param3 < ANGLE_90) {
                    System.out.println("This is an Acute Triangle since it has three angles less than 90 degress.");
                }
                else if (param1 > ANGLE_90 || param2 > ANGLE_90 || param3 > ANGLE_90) {
                    System.out.println("This is an Obtuse Triangle since it has one angle greater than 90 degress.");
                }
                else if (param1 == ANGLE_90 || param2 == ANGLE_90 || param3 == ANGLE_90) {
                    System.out.println("This is a Right Triangle since it has one angle equal to 90 degress.");
                }
                else {
                    System.out.println("Can NOT determine Triangle Type using Angle Method with angles "
                        + param1 + ", " + param2 + " and " + param3 + ".");
                }
            }
        }
        else if (checkMethod == SIDE_CHECK) {
            if (param1 == 0.0 || param2 == 0.0 || param3 == 0.0) {
                System.out.println("Can NOT determine Triangle Type - One or more of the sides is zero: " 
                        + param1 + ", " + param2 + " and " + param3 + ".");
            }
            else {
                if (param1 == param2 && param2 == param3) {
                    System.out.println("This is a Equilateral Triangle since it has three equal sides.");
                }
                else if (param1 != param2 && param2 != param3 && param1 != param3) {
                    System.out.println("This is an Scalene Triangle since it has no equal sides.");
                }
                else {
                    System.out.println("This is an Isoceles Triangle since it has two equal sides.");
                }
            }
        }
        else {
            System.out.println("Can NOT determine Triangle Type - Invalid Check Method specified: " + checkMethod + ".");
        }
    }

    // Print Triangle Type
    // This is overloading the method to receive float, then call as double.
    
    public void printTriangleType (float param1, float param2, float param3, char checkMethod) {
        this.printTriangleType((double)param1, (double)param2, (double)param3, checkMethod);        
    }

    // Print Triangle Type
    // This is overloading the method to receive int, then call as double.
    
    public void printTriangleType (int param1, int param2, int param3, char checkMethod) {
        this.printTriangleType((double)param1, (double)param2, (double)param3, checkMethod);        
    }
}
