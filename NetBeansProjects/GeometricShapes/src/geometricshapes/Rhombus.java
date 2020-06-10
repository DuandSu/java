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
 * This Class represents the Rhombus Object.
 */
public class Rhombus {
    
    public double side;
    public double pDiagonal;
    public double qDiagonal;
    public double area;
    public double perimeter;
    
    //Constructor
    public Rhombus () {
        side = 0.0;
        pDiagonal = 0.0;
        qDiagonal = 0.0;
        area = 0.0;
        perimeter = 0.0;
    }
    
    //Methods
    
    
    // Calculate the area using the length and width
    // Note for Ali: My research found a different equation below: https://www.google.ca/search?sxsrf=ACYBGNTdfIFadiEg8ZleO7O0RVlBJi1eng%3A1569724145357&ei=8RaQXbu3FYST0PEPlqKCiAw&q=what+is+rhombus+area&oq=what+is+rhombus+area&gs_l=psy-ab.1.0.0j0i22i30l5.42524.43040..44663...0.2..0.77.369.5......0....1..gws-wiz.......0i71j0i22i10i30.wyZtRzj3MCk
    // Perhaps Length and Height translate into the pDiagonal and qDiagonal.
    
    public boolean getArea () {
        if (this.pDiagonal == 0.0 || this.qDiagonal == 0.0) {
            return false;
        }
        else {
            this.area = (this.pDiagonal * this.qDiagonal) / 2;
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
