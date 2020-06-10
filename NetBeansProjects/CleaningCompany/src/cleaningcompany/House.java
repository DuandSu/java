/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cleaningcompany;

import java.time.LocalDate;

/**
 *
 * @author Duane
 */
public class House extends Houses {
    private String homeOwner;
    private boolean hasDog;

    /**
     * Constructors with overloading depending on signature used.
     */
    
    public House (String contructionName, LocalDate dateConstructionCompleted,
        String locationArea, String locationAddress, String outsideColor, String outsideSurface,
        boolean hasHardwood, boolean hasTile, boolean hasCarpet,
        String homeOwner, boolean hasDog) {
        
        super(contructionName, dateConstructionCompleted, locationArea, locationAddress,
            outsideColor, outsideSurface, hasHardwood, hasTile, hasCarpet);
        this.homeOwner = homeOwner;
        this.hasDog = hasDog;
        
    }
    
    public House () {
        
        super();
        homeOwner = "Name NOT Set";
        hasDog = false;

    }

    /**
     * @return the homeOwner
     */
    public String getHomeOwner() {
        return homeOwner;
    }

    /**
     * @param homeOwner the homeOwner to set
     */
    public void setHomeOwner(String homeOwner) {
        this.homeOwner = homeOwner;
    }

    /**
     * @return the hasDog
     */
    public boolean isHasDog() {
        return hasDog;
    }

    /**
     * @param hasDog the hasDog to set
     */
    public void setHasDog(boolean hasDog) {
        this.hasDog = hasDog;
    }
    
    /*
    ** This is the child class implementation of the Cleanable method clean
    ** which overides the super class method.
    */

    public void clean() {

        System.out.println("\nCleaning the House for: " + this.homeOwner + ": ");
        System.out.println("\tContructed By " + this.getContructionName() + " in the year " +
            this.getDateConstructionCompleted());
        System.out.println("\tThe Address is " + this.getLocationAddress() + " in " +
            this.getLocationArea() + " Area");
        System.out.println("\tLook for a " + this.getOutsideColor() + " " 
                + this.getOutsideSurface() + " house. Bring correct outside cleaner!");
        if (this.isHasHardwood()) System.out.println("\tBring Hardwood Polish!");
        if (this.isHasTile()) System.out.println("\tBring Tile Cleaner!");
        if (this.isHasCarpet()) System.out.println("\tBring Carpet Cleaner!");
    }

}
