/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cleaningcompany;

/**
 *
 * @author Duane
 */
public abstract class Car implements Cleanable {
    
    static int NUMBER_OF_WHEELS = 4;

    private String manufacturerName;
    private String modelName;
    private int yearManufactured;
    private String color;

    /**
     * Constructors with overloading depending on signature used.
     */

    public Car(String manufacturerName, String modelName, int yearManufactured,
        String color) {
        
        this.manufacturerName = manufacturerName;
        this.modelName = modelName;
        this.yearManufactured = yearManufactured;
        this.color = color;
    
    }

    public Car() {
        
        manufacturerName = "Name NOT Set";
        modelName = "Name NOT Set";
        yearManufactured = 0;
        color = "Color NOT Set";
    
    }
    /**
     * @return the manufacturerName
     */
    public String getManufacturerName() {
        return manufacturerName;
    }

    /**
     * @param manufacturerName the manufacturerName to set
     */
    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    /**
     * @return the modelName
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * @param modelName the modelName to set
     */
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * @return the yearManufactured
     */
    public int getYearManufactured() {
        return yearManufactured;
    }

    /**
     * @param yearManufactured the yearManufactured to set
     */
    public void setYearManufactured(int yearManufactured) {
        this.yearManufactured = yearManufactured;
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

    public void clean() {

        System.out.println("Cleaning the Super Car:");
        
    }
    
}
