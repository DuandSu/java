/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex11_1_exercise;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 *
 * @author Duane Munro
 */
public class ShoppingCart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	// Declare a LocalDateTime object, orderDate

        LocalDateTime orderDate = LocalDateTime.now();
        
	// Initialize the orderDate to the current date and time. Print it.
        // Initialize done above during instantiation.

        System.out.println("Today's Order Date from Instantiation:" + orderDate);
        
	// Format orderDate using ISO_LOCAL_DATE; Print it.

        //DateTimeFormatter dtf = DateTimeFormatter.BASIC_ISO_DATE;
        //DateTimeFormatter dtf1 = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        //DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern(" YYYY MM dd");

        //LocalDate date = LocalDate.now();
        //System.out.println(date.format(dtf)); //20190213
        //dtf.format(date); //same result as preceeding code
        //System.out.println(date);
        
        //LocalDateTime dateTime = LocalDateTime.now();
        //DateTimeFormatter dtfl = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        //System.out.println(dtfl.parse(dateTime));

        
        
        System.out.println("Today's Order Date Formated for ISO_LOCAL_DATE:" + orderDate.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println("Today's Order Date Formated for ISO_DATE_TIME:" + orderDate.format(DateTimeFormatter.ISO_DATE_TIME));
        ////System.out.println("Today's Order Date Formated for ISO_ZONED_DATE_TIME:" + orderDate.format(DateTimeFormatter.ISO_ZONED_DATE_TIME));
        System.out.println("Today's Order Date ofLocalized MEDIUM:" + orderDate.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));
        System.out.println("Today's Order Date ofLocalized SHORT:" + orderDate.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)));
        ////System.out.println("Today's Order Date ofLocalized SHORT:" + orderDate.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL)));

    }
    
}
