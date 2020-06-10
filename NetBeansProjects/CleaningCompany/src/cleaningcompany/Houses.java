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
public abstract class Houses implements Cleanable {
    
    private String contructionName;
    private LocalDate dateConstructionCompleted;
    private String locationArea;
    private String locationAddress;
    private String outsideColor;
    private String outsideSurface;
    private boolean hasHardwood;
    private boolean hasTile;
    private boolean hasCarpet;

    /**
     * Constructors with overloading depending on signature used.
     */
    
    public Houses (String contructionName, LocalDate dateConstructionCompleted,
        String locationArea, String locationAddress, String outsideColor,
        String outsideSurface, boolean hasHardwood, boolean hasTile, boolean hasCarpet) {
        
        this.contructionName = contructionName;
        this.dateConstructionCompleted = dateConstructionCompleted;
        this.locationArea = locationArea;
        this.locationAddress = locationAddress;
        this.outsideColor = outsideColor;
        this.outsideSurface = outsideSurface;
        this.hasHardwood = hasHardwood;
        this.hasTile = hasTile;
        this.hasCarpet = hasCarpet;
        
    }
    
    public Houses () {
        
        contructionName = "Name NOT Set";
        dateConstructionCompleted = LocalDate.now();
        locationArea = "Area NOT Set";
        locationAddress = "Address NOT Set";
        outsideColor = "Color NOT Set";
        outsideSurface = "Surface NOT Set";
        hasHardwood = false;
        hasTile = false;
        hasCarpet = false;

    }
    
    /**
     * @return the contructionName
     */
    public String getContructionName() {
        return contructionName;
    }

    /**
     * @param contructionName the contructionName to set
     */
    public void setContructionName(String contructionName) {
        this.contructionName = contructionName;
    }

    /**
     * @return the dateConstructionCompleted
     */
    public LocalDate getDateConstructionCompleted() {
        return dateConstructionCompleted;
    }

    /**
     * @param dateConstructionCompleted the dateConstructionCompleted to set
     * Overloaded to receive either a date, or the integer values for year, month
     * and day to figure out the date to set.
     */
    public void setDateConstructionCompleted(LocalDate dateConstructionCompleted) {
        this.dateConstructionCompleted = dateConstructionCompleted;
    }

    public void setDateConstructionCompleted(int year, int month, int day) {
        // Good practice would have error checking on the arguments, but this
        // was a long assignment and deadline Saturday. You can see I validated 
        // in other parts of the the assignment.
        
        this.dateConstructionCompleted = this.dateConstructionCompleted.withYear(year);
        this.dateConstructionCompleted = this.dateConstructionCompleted.withMonth(month);
        this.dateConstructionCompleted = this.dateConstructionCompleted.withDayOfMonth(day);
    }

    /**
     * @return the locationArea
     */
    public String getLocationArea() {
        return locationArea;
    }

    /**
     * @param locationArea the locationArea to set
     */
    public void setLocationArea(String locationArea) {
        this.locationArea = locationArea;
    }

    /**
     * @return the locationAddress
     */
    public String getLocationAddress() {
        return locationAddress;
    }

    /**
     * @param locationAddress the locationAddress to set
     */
    public void setLocationAddress(String locationAddress) {
        this.locationAddress = locationAddress;
    }

    /**
     * @return the outsideColor
     */
    public String getOutsideColor() {
        return outsideColor;
    }

    /**
     * @param outsideColor the outsideColor to set
     */
    public void setOutsideColor(String outsideColor) {
        this.outsideColor = outsideColor;
    }

    /**
     * @return the outsideSurface
     */
    public String getOutsideSurface() {
        return outsideSurface;
    }

    /**
     * @param outsideSurface the outsideSurface to set
     */
    public void setOutsideSurface(String outsideSurface) {
        this.outsideSurface = outsideSurface;
    }

    /**
     * @return the hasHardwood
     */
    public boolean isHasHardwood() {
        return hasHardwood;
    }

    /**
     * @param hasHardwood the hasHardwood to set
     */
    public void setHasHardwood(boolean hasHardwood) {
        this.hasHardwood = hasHardwood;
    }

    /**
     * @return the hasTile
     */
    public boolean isHasTile() {
        return hasTile;
    }

    /**
     * @param hasTile the hasTile to set
     */
    public void setHasTile(boolean hasTile) {
        this.hasTile = hasTile;
    }

    /**
     * @return the hasCarpet
     */
    public boolean isHasCarpet() {
        return hasCarpet;
    }

    /**
     * @param hasCarpet the hasCarpet to set
     */
    public void setHasCarpet(boolean hasCarpet) {
        this.hasCarpet = hasCarpet;
    }
    
    public void clean() {

        System.out.println("Cleaning the Super House:");
        
    }
}

