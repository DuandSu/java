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
public class LamborghiniAventador extends Car implements Cleanable {
    
    private String modelType;
    private String eliteServiceCompany;
    private String eliteServiceWarranty;
    private boolean isConvertable;
    private String handleWithCareService;
    
    /**
     * Constructors with overloading depending on signature used.
     */
    
    public LamborghiniAventador(String manufacturerName, String modelName, int yearManufactured,
        String color, String modelType, String eliteServiceCompany, String eliteServiceWarranty, 
        boolean isConvertable, String handleWithCareService) {
        
        super(manufacturerName, modelName, yearManufactured, color);
        this.modelType = modelType;
        this.eliteServiceCompany = eliteServiceCompany;
        this.eliteServiceWarranty = eliteServiceWarranty;
        this.isConvertable = isConvertable;
        this.handleWithCareService = handleWithCareService;
    
    }
    
    public LamborghiniAventador () {
        
        super();
        modelType = "Model NOT Set";
        eliteServiceCompany = "Service NOT Set";
        eliteServiceWarranty = "Warranty NOT Set";
        isConvertable = false;
        handleWithCareService = "Value NOT Set";

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
     * @return the eliteServiceCompany
     */
    public String getEliteServiceCompany() {
        return eliteServiceCompany;
    }

    /**
     * @param eliteServiceCompany the eliteServiceCompany to set
     */
    public void setEliteServiceCompany(String eliteServiceCompany) {
        this.eliteServiceCompany = eliteServiceCompany;
    }

    /**
     * @return the eliteServiceWarranty
     */
    public String getEliteServiceWarranty() {
        return eliteServiceWarranty;
    }

    /**
     * @param eliteServiceWarranty the eliteServiceWarranty to set
     */
    public void setEliteServiceWarranty(String eliteServiceWarranty) {
        this.eliteServiceWarranty = eliteServiceWarranty;
    }

    /**
     * @return the isConvertable
     */
    public boolean isIsConvertable() {
        return isConvertable;
    }

    /**
     * @param isConvertable the isConvertable to set
     */
    public void setIsConvertable(boolean isConvertable) {
        this.isConvertable = isConvertable;
    }

    /**
     * @return the handleWithCareService
     */
    public String getHandleWithCareService() {
        return handleWithCareService;
    }

    /**
     * @param handleWithCareService the handleWithCareService to set
     */
    public void setHandleWithCareService(String handleWithCareService) {
        this.handleWithCareService = handleWithCareService;
    }

    /*
    ** This is the child class implementation of the Cleanable method clean
    ** which overides the super class method.
    */
    
    public void clean() {

        System.out.println("\n\tMake sure to clean the " + this.getColor() + " "
            + this.getYearManufactured() + " " + this.getManufacturerName() + " " 
            + this.getModelName() + " " + this.getModelType() + "!");
        System.out.println("\tThe interior is likely leather so bring leather cleaner regardless");
        System.out.println("\tIf issues call " + this.eliteServiceCompany
            + " and mention the Warranty: (" + this.eliteServiceWarranty
            + ")!");
        if (this.isConvertable) System.out.println("\tIt is a convertable so apply Water Proof Protection to Interior!");
        System.out.println("\tThe Handle With Care Service Instructions are: " + this.handleWithCareService);

        handleWithCareService = handleWithCareService;
        
    }
}
