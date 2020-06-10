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
public class HondaOdyssey extends Car implements Cleanable {
    
    private String modelType;
    private String interiorType;
    private String hondaServiceCompany;
    private String hondaServiceWarranty;
    
    /**
     * Constructors with overloading depending on signature used.
     */
    
    public HondaOdyssey(String manufacturerName, String modelName, int yearManufactured,
        String color, String modelType, String interiorType, String hondaServiceCompany, 
        String hondaServiceWarranty) {
        
        super(manufacturerName, modelName, yearManufactured, color);
        this.modelType = modelType;
        this.interiorType = interiorType;
        this.hondaServiceCompany = hondaServiceCompany;
        this.hondaServiceWarranty = hondaServiceWarranty;
    
    }
    
    public HondaOdyssey () {
        
        super();
        modelType = "Model NOT Set";
        interiorType = "Interior NOT Set";
        hondaServiceCompany = "Service NOT Set";
        hondaServiceWarranty = "Warranty NOT Set";

    }

    /**
     * @return the modelType
     */
    public String getModelType() {
        return modelType;
    }

    /**
     * @param modelType the modelType to set
     */
    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    /**
     * @return the interiorType
     */
    public String getInteriorType() {
        return interiorType;
    }

    /**
     * @param interiorType the interiorType to set
     */
    public void setInteriorType(String interiorType) {
        this.interiorType = interiorType;
    }

    /**
     * @return the hondaServiceCompany
     */
    public String getHondaServiceCompany() {
        return hondaServiceCompany;
    }

    /**
     * @param hondaServiceCompany the hondaServiceCompany to set
     */
    public void setHondaServiceCompany(String hondaServiceCompany) {
        this.hondaServiceCompany = hondaServiceCompany;
    }

    /**
     * @return the hondaServiceWarranty
     */
    public String getHondaServiceWarranty() {
        return hondaServiceWarranty;
    }

    /**
     * @param hondaServiceWarranty the hondaServiceWarranty to set
     */
    public void setHondaServiceWarranty(String hondaServiceWarranty) {
        this.hondaServiceWarranty = hondaServiceWarranty;
    }

    /*
    ** This is the child class implementation of the Cleanable method clean
    ** which overides the super class method.
    */
    
    public void clean() {

        System.out.println("\n\tMake sure to clean the " + this.getColor() + " "
            + this.getYearManufactured() + " " + this.getManufacturerName() + " " 
            + this.getModelName() + " " + this.getModelType() + "!");
        System.out.println("\tThe interior is " + this.interiorType 
            + " so bring correct cleaner!");
        System.out.println("\tIf issues call " + this.hondaServiceCompany
            + " and mention the Warranty: (" + this.hondaServiceWarranty
            + ")!");
        
    }
    
}
