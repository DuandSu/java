/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonecompany;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

/**
 *
 * @author Duane Munro
 * This is the solution for Assignment 5-2.
 */
public class PhoneCompany {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Set up the Prompts
        
        boolean promptDetail = true;
        String numberDetailedPrompt = "\nEnter a number (1), (2), (3)" +
                "\n\n\t(1): Buy a new phone line" +
                "\n\t(2): Choose ring tone" +
                "\n\t(3): Calendar setting (edit/add/delete)" +
                "\n\n\tEnter (Help), (H), (?) for Help;" +
                "\n\tEnter (Exit) to quit:" +
                "\n\nPlease Enter Your Choice Now: ";

        String numberShortPrompt = "\n\nPlease Enter Your Choice Now: ";
        
        Scanner input = new Scanner(System.in);
        String numberAnswer = " ";

        while (!numberAnswer.equals("EXIT")) {
            
            /* 
            ** Prompt the user. Always show detailed prompt first time.
            ** Thereafter, prompt with short prompt, unless user asks for help
            ** or enters invalid selection.
            */
            if (promptDetail) {
        
                System.out.print(numberDetailedPrompt);
                numberAnswer = input.nextLine().toUpperCase();
                promptDetail = false;
                
            }
            else {
        
                System.out.print(numberShortPrompt);
                numberAnswer = input.nextLine().toUpperCase();
                
            }
            /*
            ** If user selects EXIT then break and exit the loop and program.
            */
            if (numberAnswer.equals("EXIT")) {
                
                System.out.println("Thank You. Existing the program");
                break;
                
            }
            /*
            ** If user selects HELP then display detailed prompt.
            */
            else if (numberAnswer.equals("H") ||
                    numberAnswer.equals("HELP") ||
                    numberAnswer.equals("?")) {
                
                System.out.println("\nPlease review the choices for HELP.");
                promptDetail = true;
                
            }
            else if (numberAnswer.equals("1")) {
                
                buyNewPhone();
                
            }
            else if (numberAnswer.equals("2")) {
                
                System.out.println("User Picked to Choose a Ring Tone");
                
            }
            else if (numberAnswer.equals("3")) {
                
                System.out.println("User Picked Calendar Setting");
                
            }
            /*
            ** User has selected invalid choice. Ask again with detailed prompt.
            */
            else {
                
                System.out.println("\nInvalid Selection: " + numberAnswer + ". Please review the choices.");
                promptDetail = true;
                
            }
        }
        
    }
    public static void buyNewPhone() {

        LocalDate todayDate = LocalDate.now();
        LocalDate birthDate = LocalDate.now();
        boolean dateOK = true;
        
        boolean phoneSelection = false;
        String phonePlan = " ";
        
        String namePrompt = "\nPlease Enter Your Name: ";
        String nameHelp = "\n\tEnter your first and last name";
        boolean promptName = true;
        String finalName = " ";
        
        String agePrompt = "\nPlease Enter Your Age: ";
        String ageHelp = "\n\tEnter your age in years";
        boolean promptAge = false;
        int finalAge = 0;
        
        String yearPrompt = "\nPlease Enter the Year You Were Born (YYYY): ";
        String yearHelp = "\n\tEnter the year born Eg. 1962 or 2002";
        boolean promptYear = false;
        int finalYear = 0;
        
        String monthPrompt = "\nPlease Enter the Month You Were Born (MM): ";
        String monthHelp = "\n\tEnter the month born Eg. Feb is 2 or Dec is 12";
        boolean promptMonth = false;
        int finalMonth = 0;
        int checkYear = 0;
        int checkMonth = 0;
        int checkDay = 0;
        
        String dayPrompt = "\nPlease Enter the Day of Month You Were Born (DD): ";
        String dayHelp = "\n\tEnter the day of month born Eg. 1 to 31";
        boolean promptDay = false;
        int finalDay = 0;
        
        String countryBornPrompt = "\nPlease Enter Country You Were Born In: ";
        String countryBornHelp = "\n\tEnter country born. Eg. Canada or France";
        boolean promptCountryBorn = false;
        String finalCountryBorn = "";
       
        String currPrompt = " ", currHelp = " ";
        
        Scanner input = new Scanner(System.in);
        String promptAnswer = " ";
        
        System.out.println("\nPlease enter some of your "
            + "information so we can pick the right plan for you.");

        while (!promptAnswer.equals("EXIT")) {
            
            /* 
            ** Set Prompt 
            */
            if (promptName) {
        
                currPrompt = namePrompt;
                currHelp = nameHelp;
                
            }
            else if (promptAge){
        
                currPrompt = agePrompt;
                currHelp = ageHelp;
                
            }
            else if (promptYear){
        
                currPrompt = yearPrompt;
                currHelp = yearHelp;
                
            }
            else if (promptMonth){
        
                currPrompt = monthPrompt;
                currHelp = monthHelp;
                
            }
            else if (promptDay){
        
                currPrompt = dayPrompt;
                currHelp = dayHelp;
                
            }
            else if (promptCountryBorn){
        
                currPrompt = countryBornPrompt;
                currHelp = countryBornHelp;
                
            }
            
            System.out.print(currPrompt);
            promptAnswer = input.nextLine().toUpperCase();
            
            /*
            ** If user selects EXIT then break and exit the loop this menu option.
            */
            if (promptAnswer.equals("EXIT")) {
                
                System.out.println("\nThank You. Existing New Phone Order");
                break;
                
            }
            /*
            ** If user selects HELP then display detailed prompt.
            */
            else if (promptAnswer.equals("H") ||
                    promptAnswer.equals("HELP") ||
                    promptAnswer.equals("?")) {
                
                System.out.println("\n" + currHelp);
                
            }
            else if (promptName) {
                
                System.out.println("\nProcess Name: " + promptAnswer);
                finalName = promptAnswer.trim();
                promptName = false;
                promptAge = true;
                
            }
            else if (promptAge) {
                
                System.out.println("\nProcess Age: " + promptAnswer);
                finalAge = Integer.parseInt(promptAnswer.trim());
                if (finalAge < 10 || finalAge > 110) {
                    System.out.println("\nOur policy is you must be older than 10"
                        + " and younger than 110. Please try again.");
                }
                else {
                    promptAge = false;
                    promptYear = true;
                }
                
            }
            else if (promptYear) {
                
                System.out.println("\nProcess Year: " + promptAnswer);
                finalYear = Integer.parseInt(promptAnswer.trim());
                if (finalYear < 1909 || finalYear > 2019) {
                    System.out.println("\nAre you sure? Final check after Birth Day");
                }
                promptYear = false;
                promptMonth = true;
                
            }
            else if (promptMonth) {
                
                System.out.println("\nProcess Month: " + promptAnswer);
                finalMonth = Integer.parseInt(promptAnswer.trim());
                if (finalMonth < 1 || finalMonth > 12) {
                    System.out.println("\nMonth must be between 1 for January"
                        + " and 12 for December. Please Try Again.");
                }
                else {
                    promptMonth = false;
                    promptDay = true;
                }
                
            }
            else if (promptDay) {
                
                dateOK = true;
                System.out.println("\nProcess Day: " + promptAnswer);
                finalDay = Integer.parseInt(promptAnswer.trim());
                switch(finalMonth) {
                    case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                        if (finalDay < 1 || finalDay > 31) {
                            System.out.println("\nDay must be between 1 and 31"
                                + " for month: " + finalMonth +". Please Try Again.");
                            dateOK = false;
                        }
                        break;
                    case 2:
                        if (finalYear % 4 == 0) {
                            if (finalDay < 1 || finalDay > 29) {
                                System.out.println("\nDay must be between 1 and 29"
                                    + " for Leap Year February. Please Try Again.");
                                dateOK = false;
                            }
                        }
                        else {
                            if (finalDay < 1 || finalDay > 28) {
                                System.out.println("\nDay must be between 1 and 28"
                                    + " for Non Leap Year February. Please Try Again.");
                                dateOK = false;
                            }
                        }
                        break;
                    case 4: case 6: case 9: case 11:
                        if (finalDay < 1 || finalDay > 30) {
                            System.out.println("\nDay must be between 1 and 30"
                                + " for month: " + finalMonth +". Please Try Again.");
                            dateOK = false;
                        }
                        break;
                    default:
                        System.out.println("\nMonth must be between 1 for January"
                            + " and 12 for December. Please Try Again.");
                        dateOK = false;
                        promptMonth = true;
                        promptDay = false;
                    
                }
                if (dateOK) {
                    birthDate = birthDate.withYear(finalYear);
                    birthDate = birthDate.withMonth(finalMonth);
                    birthDate = birthDate.withDayOfMonth(finalDay);

                    checkYear = todayDate.getYear() - birthDate.getYear() - finalAge;
                    checkMonth = todayDate.getMonthValue()- birthDate.getMonthValue();
                    checkDay = todayDate.getDayOfMonth() - birthDate.getDayOfMonth();
                    System.out.println(checkYear + ":" + checkMonth  + ":" + checkDay);

                    if (checkYear <= 1 && checkYear >= 0) {
                        promptDay = false;
                        promptCountryBorn = true;
                    }
                    else {
                        System.out.println("\nAge / Year mismatch by more than 1 year at "
                            + checkYear + " years. Please Try Again.");
                        promptDay = false;
                        promptAge = true;
         
                    }
                }
                
            }
            else if (promptCountryBorn) {
                
                System.out.println("\nProcess Country Born: " + promptAnswer);
                finalCountryBorn = promptAnswer.trim();
                promptCountryBorn = false;

                phoneSelection = true;
            }
            /*
            ** User has selected invalid choice. Ask again with detailed prompt.
            */
            if (phoneSelection) {
                
                if (finalAge < 18) {
                    phonePlan = "Student plan";
                }
                else if (finalAge > 64) {
                    phonePlan = "Elder plan";
                }
                else {
                    phonePlan = "Normal plan";
                }
                System.out.println("\nGood News. The plan selected for you is: " 
                    + phonePlan + ". Your information below:");
                System.out.println("\tOn this date: " + todayDate);
                System.out.println("\tYour Name: " + finalName);
                System.out.println("\tYour Age: " + finalAge);
                System.out.println("\tYour Birth Year: " + finalYear);
                System.out.println("\tYour Birth Month: " + finalMonth);
                System.out.println("\tYour Birth Day: " + finalDay);
                System.out.println("\tSo Your Birthday Date: " + birthDate);
                System.out.println("\tYour Birth Country: " + finalCountryBorn);
                promptAnswer = "EXIT";
                
            }
        }
    }
    
}
