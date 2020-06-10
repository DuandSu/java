/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cleaningcompany;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Duane
 * This is the solution for Assignment 5-1.
*/
public class CleaningCompany {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LocalDate tempDate = LocalDate.now();
        
        // Use Array List to gather all the car names for later printing.
        ArrayList<String> carNames = new ArrayList();   

        // Create Home for Bob Barker.

        House bobBarkerHouse = new House("California Homes", LocalDate.now(), 
                "Barley Mill Estates", "1990 Barley Drive", "White", "Stucco", 
                true, true, true, "Bob Barker", true);

        tempDate = bobBarkerHouse.getDateConstructionCompleted();
        tempDate = tempDate.withYear(2005);
        tempDate = tempDate.withMonth(6);
        tempDate = tempDate.withDayOfMonth(15);
        bobBarkerHouse.setDateConstructionCompleted(tempDate);

        // Create Vacation Home for Bob Barker.

        House bobVacationHouse = new House();

        bobVacationHouse.setContructionName("Oahu Housing");
        
        bobVacationHouse.setDateConstructionCompleted(1990, 12, 31);

        bobVacationHouse.setLocationArea("Volcano Ridge");
        bobVacationHouse.setLocationAddress("Lava Flow Drive");
        bobVacationHouse.setOutsideColor("Lava Black");
        bobVacationHouse.setOutsideSurface("Lava Rock");
        bobVacationHouse.setHasCarpet(false);
        bobVacationHouse.setHasHardwood(true);
        bobVacationHouse.setHasTile(true);
        bobVacationHouse.setHomeOwner("Bob Barker");
        bobVacationHouse.setHasDog(false);

        // Create Bob Barker car.
        
        HondaOdyssey bobMiniVan = new HondaOdyssey("Honda", "Odyssey", 2018, "Gray",
            "EX-L Touring with " + Car.NUMBER_OF_WHEELS + " Wheels", "Leather", "Calgary Honda", "5-Year");

        carNames.add("'" + bobBarkerHouse.getHomeOwner() + " House at " + bobBarkerHouse.getLocationAddress()
            + " has a " + bobMiniVan.getColor() + " " + bobMiniVan.getYearManufactured() + " " 
            + bobMiniVan.getManufacturerName() + " " + bobMiniVan.getModelName() + "'");

        // Create Bob Barker wife's car.
        
        HondaAccord bobWifeCar = new HondaAccord();
        bobWifeCar.setManufacturerName("Honda");
        bobWifeCar.setModelName("Accord");
        bobWifeCar.setYearManufactured(1991);
        bobWifeCar.setColor("Red");
        bobWifeCar.setModelType("EX with " + Car.NUMBER_OF_WHEELS + " Wheels");
        bobWifeCar.setInteriorType("Vinyl");
        bobWifeCar.setHondaServiceCompany("Calgary Honda");
        bobWifeCar.setHondaServiceWarranty("Expired");
        bobWifeCar.setIsConvertable(true);
        
        // Bob was just able to extend the warranty
        
        if (bobWifeCar.getHondaServiceWarranty().equals("Expired")) {
            
            bobWifeCar.setHondaServiceWarranty("2-Year Extension");
            
        }

        carNames.add("'" + bobBarkerHouse.getHomeOwner() + " House at " + bobBarkerHouse.getLocationAddress()
            + " has a " + bobWifeCar.getColor() + " " + bobWifeCar.getYearManufactured() + " " 
            + bobWifeCar.getManufacturerName() + " " + bobWifeCar.getModelName() + "'");

        // Create Bob Barker vacation car in Hawaii.
        
        LamborghiniAventador bobVacationCar = new LamborghiniAventador("Lamborghini",
            "Aventador", 2019, "Gold", "Elite", "Oahu Luxury Speedy Cars", "10-Year Elite", true, "Oh Yeah Baby");


        carNames.add("'" + bobVacationHouse.getHomeOwner() + " House at " + bobVacationHouse.getLocationAddress()
            + " has a " + bobVacationCar.getColor() + " " + bobVacationCar.getYearManufactured() + " " 
            + bobVacationCar.getManufacturerName() + " " + bobVacationCar.getModelName() + "'");

        // Print out array list of cars
        
        System.out.println("Car List: " + carNames);
        
        // Clean the Home and Cars
        
        bobBarkerHouse.clean();
        bobMiniVan.clean();
        bobWifeCar.clean();
        
        // Clean the Vacation Home and Car

        bobVacationHouse.clean();
        bobVacationCar.clean();

    }
        
}
