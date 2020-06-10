/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometricshapes;

/**
 *
 * @author Duane Munro
 * 
 * This is Assignment #2, Exercise #1.
 */
public class GeometricShapes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        final char ANGLE_CHECK = 'A';
        final char SIDE_CHECK = 'S';

        // Create my rectangle
        
        Rectangle myRectangle = new Rectangle ();
        
        myRectangle.length = 5.0;
        myRectangle.width = 10.0;
        
        // Calculate the Area of my rectangle.
        
        if (myRectangle.getArea()) {
            System.out.println("The Area of the Rectange with Lengh of " + myRectangle.length + " and Width of " + myRectangle.width + " is " + myRectangle.area);
        }
        else {
            System.out.println("There was a problem with the Rectangle Area calculation. Neither Length '" + myRectangle.length + "' or Width '" + myRectangle.width + "' can be 0.");
        }
        
        // Calculate the Perimeter of my rectangle.
        
        if (myRectangle.getPerimeter()) {
            System.out.println("The Perimeter of the Rectange with Lengh of " + myRectangle.length + " and Width of " + myRectangle.width + " is " + myRectangle.perimeter);
        }
        else {
            System.out.println("There was a problem with the Rectangle Perimeter calculation. Neither Length '" + myRectangle.length + "' or Width '" + myRectangle.width + "' can be 0.");
        }

        // Create my square
        
        Square mySquare = new Square ();
        
        mySquare.side = 10.0;
                
        // Calculate the Area of my square.
        
        if (mySquare.getArea()) {
            System.out.println("The Area of the Square with each Side of " + mySquare.side + " is " + mySquare.area);
        }
        else {
            System.out.println("There was a problem with the Square Area calculation. The Sides '" + mySquare.side + "' can NOT be 0.");
        }
        
        // Calculate the Perimeter of my square.
        
        if (mySquare.getPerimeter()) {
            System.out.println("The Perimeter of the Rectange with Lengh of " + mySquare.side + " is " + mySquare.perimeter);
        }
        else {
            System.out.println("There was a problem with the Square Perimeter calculation. The Sides '" + mySquare.side + "' can NOT be 0.");
        }

        // Create my circle
        
        Circle myCircle = new Circle ();
        
        myCircle.diameter = 10.0;
        //myCircle.radius = 5.0;
                
        // Calculate the Area of my circle.
        
        if (myCircle.getArea()) {
            System.out.println("The Area of the Circle with Diameter of " + myCircle.diameter + " and Radius of " + myCircle.radius + " is " + myCircle.area);
        }
        else {
            System.out.println("There was a problem with the Circle Area calculation. Diameter '" + myCircle.diameter + "' and Radius '" + myCircle.radius + "' can NOT both be 0.");
        }
        
        // Calculate the Perimeter of my circle.
        
        if (myCircle.getPerimeter()) {
             System.out.println("The Perimeter of the Circle with Diameter of " + myCircle.diameter + " and Raidus of " + myCircle.radius + " is " + myCircle.perimeter);
        }
        else {
            System.out.println("There was a problem with the Circle Perimeter calculation. Diameter '" + myCircle.diameter + "' and Radius '" + myCircle.radius + "' can NOT both be 0.");
        }
        // Create my rhombus
        
        Rhombus myRhombus = new Rhombus ();
        
        myRhombus.side = 5.0;
        myRhombus.pDiagonal = 10.0;
        myRhombus.qDiagonal = 10.0;
        
        // Calculate the Area of my rhombus.
        
        if (myRhombus.getArea()) {
            System.out.println("The Area of the Rhombus with pDiagonal of " + myRhombus.pDiagonal + " and qDiagonal of " + myRhombus.qDiagonal + " is " + myRhombus.area);
        }
        else {
            System.out.println("There was a problem with the Rhombus Area calculation. Neither pDiagonal '" + myRhombus.pDiagonal + "' or qDiagonal '" + myRhombus.qDiagonal + "' can be 0.");
        }
        
        // Calculate the Perimeter of my rhombus.
        
        if (myRhombus.getPerimeter()) {
            System.out.println("The Perimeter of the Rhombus with each Side of " + myRhombus.side + " is " + myRhombus.perimeter);
        }
        else {
            System.out.println("There was a problem with the Rhombus Perimeter calculation. The Sides '" + myRhombus.side + "' can NOT be 0.");
        }

        // Create my triangle
        // Note to Ali: I think the way I wrote this types are NOT a concern. I've used float to handle the largest possible values.
        // If a lesser type is used, even with the casting, it still calculates okay.
        
        Triangle myTriangle = new Triangle ();
        
        //myTriangle.sideA = 0.0;
        myTriangle.sideA = 4.0;
        myTriangle.sideB = 8.0;
        myTriangle.sideC = 5.0;
        //myTriangle.angleA = 0.0;
        myTriangle.angleA = 80.0;
        myTriangle.angleB = 50.0;
        myTriangle.angleC = 50.0;
        //myTriangle.base = 0.0;
        myTriangle.base = 10.0;
        myTriangle.height = 10.0;
        
        // First validate the triangle by checking the Triangle Side and Angle Properties
        // Note to Ali. I am a bit confused about the relationship of triangles sides to angles to base/height. So my test data
        // might be a bit suspect. Howver, research was able to discover a check on sides and angles. Nothing found yet on base/height.

        if (!myTriangle.checkSides()) {
            System.out.println("Side lengths are invalid. The sum of the lengths of any two sides of a triangle must be greater than the length of the third side.");
        }    
        else if (!myTriangle.checkAngles()) {
            System.out.println("Area angles are invalid. The sum of the angles in a triangle must be 180 degrees.");
        }
        else {         
            // Calculate the Area of my triangle.
        
            if (myTriangle.getArea()) {
                System.out.println("The Area of the Triangle with Base of " + myTriangle.base + " and Height of " + myTriangle.height + " is " + myTriangle.area);
            }
            else {
                System.out.println("There was a problem with the Triangle Area calculation. Neither Base " + myTriangle.base + " or Height " + myTriangle.height + " can NOT be 0.");
            }
        
            // Calculate the Perimeter of my triangle.
        
            if (myTriangle.getPerimeter()) {
                System.out.println("The Perimeter of the Triangle with Sides of " + myTriangle.sideA + ", " + myTriangle.sideB + " and " + myTriangle.sideC 
                        + " is " + myTriangle.perimeter);
            }
            else {
                System.out.println("There was a problem with the Triangle Perimeter calculation. The Sides of " 
                        + myTriangle.sideA + ", " + myTriangle.sideB + " and " + myTriangle.sideC + " can NOT be 0.");
            }
        
            // Display the type of my triangle using both Angle & Side Check Methods. Passing type double.
            myTriangle.printTriangleType(myTriangle.angleA, myTriangle.angleB, myTriangle.angleC, ANGLE_CHECK);        
            myTriangle.printTriangleType(myTriangle.sideA, myTriangle.sideB, myTriangle.sideC, SIDE_CHECK);        
        
            // Display the type of my triangle using both Angle & Side Check Methods. Passing type float.
            myTriangle.printTriangleType((float)myTriangle.angleA, (float)myTriangle.angleB, (float)myTriangle.angleC, ANGLE_CHECK);        

            // Display the type of my triangle using both Angle & Side Check Methods. Passing type int.
            myTriangle.printTriangleType((int)myTriangle.sideA, (int)myTriangle.sideB, (int)myTriangle.sideC, SIDE_CHECK);        
        }
    }
}
