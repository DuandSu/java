/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animals;

/**
 *
 * @author Duane
 */
public class Duck extends Animal {
    
    private String color;
    
    public Duck (String color) {

        this.color = color;

    }
    
    public Duck (String name, String[] food, String color) {
        
        super(name, food); 
        this.color = color;
        
    }
    
    public Duck () {
        
        super();
        color = "Color NOT Set";

    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
    
    public void printAnimal(String title) {

        super.printAnimal(title);
        System.out.println("\tColor: " + this.getColor());
        
    }
}
