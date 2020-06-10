/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonecompany;

import java.time.LocalDate;
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

        String[][] calendarByDaysFiveYears = new String[5][365];

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
                
                pickRingTone();
                
            }
            else if (numberAnswer.equals("3")) {
                
                manageCalendar(calendarByDaysFiveYears);
                
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
    /*
    ** This method implements the option 1 to have the user enter personal information. Then
    ** based on the age it selects the best phone plan for that user. Note that
    ** it doesn't really assign it to anything. This would normally happend if the user
    ** had an actual account assigned. That did not seem to be a requirement of the
    ** assignment so didn't implement since this assignment was reasonably extensive
    ** to start with and didn't feel had time to implement the account side of things.
    */
    public static void buyNewPhone() {

        LocalDate todayDate = LocalDate.now();
        LocalDate birthDate = LocalDate.now();
        boolean dateOK = true;
        
        /*
        ** Set up the prompt information to be used in the following loop. It will 
        ** determine which question and help to use for each prompt, as well as the 
        ** variables that will store the responses and be used for later
        ** processing and evaluation. Notice the prompt variable determines
        ** which question is to be asked and which is to be asked next.
        */
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

        do {
            
            /* 
            ** Set the questions and help based on the prompt variable.
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
            /*
            ** Display the question and read in the response.
            */
            System.out.print(currPrompt);
            promptAnswer = input.nextLine().toUpperCase();
            
            /*
            ** Since reading in the users response using string, some answers will
            ** need to be converted to integers, so need to check for exceptions.
            */

            try {
            
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
                /*
                ** All the remaining answers are processed based on the prompt.
                ** If there is an issue the prompt is not changed. The program
                ** loops back and asks the same question.
                ** When a good answer is received the prompt is changed for the
                ** next question.
                */
                else if (promptName) {
                
                    finalName = promptAnswer.trim();
                    promptName = false;
                    promptAge = true;
                
                }
                else if (promptAge) {
                
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
                
                    finalYear = Integer.parseInt(promptAnswer.trim());
                    if (finalYear < 1909 || finalYear > 2019) {
                        System.out.println("\nAre you sure? Final check after Birth Day");
                    }
                    promptYear = false;
                    promptMonth = true;
                
                }
                else if (promptMonth) {
                
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
                    /*
                    ** For this assignment, I chose to get the year, month and day
                    ** inputted separately. Probably would seem nicer to have had user
                    ** input the entire Birthday date, but we are new to input and
                    ** don't really have knowledge for using a form. I didn't feel like 
                    ** I had time to fight with a date input.
                    **
                    ** Therefore, left most of the validation for last input which is the day.
                    ** Then the values are converted to a date and use date thereafter,
                    ** just to show some usage of the Date class.
                    */
                    dateOK = true;
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
                        //System.out.println(checkYear + ":" + checkMonth  + ":" + checkDay);

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
                
                    finalCountryBorn = promptAnswer.trim();
                    promptCountryBorn = false;

                    phoneSelection = true;
                }
                /*
                ** Check if all questions answered correctly and ready for
                ** phone plan selection.
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
                    System.out.println("\n\tOn this date: " + todayDate);
                    System.out.println("\tYour Name: " + finalName);
                    System.out.println("\tYour Age: " + finalAge);
                    //System.out.println("\tYour Birth Year: " + finalYear);
                    //System.out.println("\tYour Birth Month: " + finalMonth);
                    //System.out.println("\tYour Birth Day: " + finalDay);
                    System.out.println("\tYour Birthday Date: " + birthDate);
                    System.out.println("\tYour Birth Country: " + finalCountryBorn);
                    /*
                    ** The following allows the loop to end.
                    */
                    promptAnswer = "EXIT";
                
                }
            }
            /*
            ** Catch the exception. Display a message to the user to help them
            ** understand why their last input was invalid. No prompt information
            ** has been changed so it will ask the same question again.
            */
            catch (NumberFormatException e) {
        
                String errMsg = e.getMessage();
                System.out.println("\nException Error With Data Entered: " + errMsg 
                    + ". Please Try Again.");

            }
        /*
        ** This will loop until either the user asks to Exit by typing exit, or
        ** all questions are answered correctly and the phone plan selected.
        ** Used do while loop since want it to ask the question at least once
        ** everytime.
        */    
        } while (!promptAnswer.equals("EXIT"));
    }

    /*
    ** This method implements the option 2 to have the user pick a ring tone. Then
    ** check for invalid picks and assign valid picks to that user. Note that
    ** it doesn't really assign it to anything like an account. This would normally happend if the user
    ** had an actual account assigned. That did not seem to be a requirement of the
    ** assignment so didn't implement since this assignment was reasonably extensive
    ** to start with and didn't feel had time to implement the account side of things.
    */
    public static void pickRingTone() {
        // Set up the Prompts
        boolean promptDetail = true;

        /*
        ** Define the available ring tones.
        */
        String[] ringTones = new String[20];
        ringTones[0] = "Standard North America";
        ringTones[1] = "Standard European";
        ringTones[2] = "Alarms";
        ringTones[3] = "Oh Canada";
        ringTones[4] = "Star Spangled Banner";
        ringTones[5] = "Wake Up Already";
        ringTones[6] = "Cockadoodle Doo";
        ringTones[7] = "Big Dog Barking";
        ringTones[8] = "Small Dog Yapping";
        ringTones[9] = "Alley Cat Meowing";
        ringTones[10] = "Standard North America";
        ringTones[11] = "Nirvana: Lithium";
        ringTones[12] = "Led Zeppelin: Stairway to Heaven";
        ringTones[13] = "Beatles: HELP";
        ringTones[14] = "Pink Floyd: Time";
        ringTones[15] = "Beastie Boys: Sabatoge";
        ringTones[16] = "Rage Against the Machine : Wake Up";
        ringTones[17] = "Spirit of the West: Pub Crawl";
        ringTones[18] = "RUSH: Spirit of the Radio";
        ringTones[19] = "Queen: We are the Champions";
        
        String numberShortPrompt = "\n\nPlease Enter Your Choice Now: ";
        
        Scanner input = new Scanner(System.in);
        String numberAnswer = " ";
        int intAnswer = 0;
        String finalRingTone = " ";

        while (!numberAnswer.equals("EXIT")) {
            
            /* 
            ** Prompt the user. Always show detailed prompt first time.
            ** Thereafter, prompt with short prompt, unless user asks for help
            ** or enters invalid selection.
            */
            try {
                    
                if (promptDetail) {
        
                    System.out.println("\nWe have the following Ring Tones Available:\n");
                    for (int i = 0; i < ringTones.length; i++) {
                        System.out.println("\t(" + (i+1) + ") " + ringTones[i]);
                    }
                    System.out.print("\n\n\tEnter (Help), (H), (?) for Help;" +
                        "\n\tEnter (Exit) to quit:");

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
                
                    System.out.println("\nThank You. Existing Ring Tone Selection");
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
                else {
                
                    intAnswer = Integer.parseInt(numberAnswer.trim());
                    if (intAnswer < 1 || intAnswer > ringTones.length) {
                        System.out.println("\nInvalid Selection: " + intAnswer + ". Please review the choices.");
                        promptDetail = true;
                    }
                    else {
                        /*
                        ** User picked valid ring tone. Assign it and display
                        */
                        finalRingTone = ringTones[intAnswer-1];
                        System.out.println("\nYou Picked Ring Tone (" + intAnswer + "): " + ringTones[intAnswer-1]);
                    }
                }
            }
            /*
            ** Catch the exception. Display a message to the user to help them
            ** understand why their last input was invalid. No prompt information
            ** has been changed so it will ask the same question again.
            */
            catch (NumberFormatException e) {
        
                promptDetail = true;
                String errMsg = e.getMessage();
                System.out.println("\nException Error With Data Entered: " + errMsg 
                    + ". Please Try Again.");

            }
        }
    }

    /*
    ** This method implements the option 3 to allow the user to manage their time by
    ** entering plans for each day of the week and help reminding them. It is NOT
    ** fully implemented and as yet has no user input, but simply simulates the user
    ** entering some values in the Calendar, then deleting some days plans and then 
    ** edit some others. It uses a 2D array.
    */
    public static void manageCalendar(String[][] calendarByDaysFiveYears) {
        
        /*
        ** Set up the calendar array.
        */
        final int YEAR_2019 = 2019;
        final int YEAR_2020 = 2020;
        final int YEAR_2021 = 2021;
        final int YEAR_2022 = 2022;
        final int YEAR_2023 = 2023;
        
        final int MONTH_JANUARY = 1;
        final int MONTH_FEBRUARY = 2;
        final int MONTH_MARCH = 3;
        final int MONTH_APRIL = 4;
        final int MONTH_MAY = 5;
        final int MONTH_JUNE = 6;
        final int MONTH_JULY = 7;
        final int MONTH_AUGUST = 8;
        final int MONTH_SEPTEMBER = 9;
        final int MONTH_OCTOBER = 10;
        final int MONTH_NOVEMBER = 11;
        final int MONTH_DECEMBER = 12;
        
        final char ADD_PLAN = 'A';
        final char DELETE_PLAN = 'D';
        final char CHANGE_PLAN = 'C';
        
        //String[][][] calendarByWeeksDaysFiveYears = new String[5][52][7];
        /*
        ** Set plant for Christmas and Boxing Day, Dec 25 and 26 respectively, for next 5 years.
        ** Set reminder for 4 weeks or 28 days.
        */
        customerPlan(calendarByDaysFiveYears, "Christmas Day", YEAR_2019, MONTH_DECEMBER, 25, 28, ADD_PLAN);
        customerPlan(calendarByDaysFiveYears, "Christmas Day", YEAR_2020, MONTH_DECEMBER, 25, 28, ADD_PLAN);
        customerPlan(calendarByDaysFiveYears, "Christmas Day", YEAR_2021, MONTH_DECEMBER, 25, 28, ADD_PLAN);
        customerPlan(calendarByDaysFiveYears, "Christmas Day", YEAR_2022, MONTH_DECEMBER, 25, 28, ADD_PLAN);
        customerPlan(calendarByDaysFiveYears, "Christmas Day", YEAR_2023, MONTH_DECEMBER, 25, 28, ADD_PLAN);
        customerPlan(calendarByDaysFiveYears, "Boxing Day", YEAR_2019, MONTH_DECEMBER, 26, 28, ADD_PLAN);
        customerPlan(calendarByDaysFiveYears, "Boxing Day", YEAR_2020, MONTH_DECEMBER, 26, 28, ADD_PLAN);
        customerPlan(calendarByDaysFiveYears, "Boxing Day", YEAR_2021, MONTH_DECEMBER, 26, 28, ADD_PLAN);
        customerPlan(calendarByDaysFiveYears, "Boxing Day", YEAR_2022, MONTH_DECEMBER, 26, 28, ADD_PLAN);
        customerPlan(calendarByDaysFiveYears, "Boxing Day", YEAR_2023, MONTH_DECEMBER, 26, 28, ADD_PLAN);
        /*
        ** Set Birthday for Suzanne, Dec 7. Then delete it because it is actually
        ** on the 7th. Add back in on 6th. Set reminders for 2 weeks or 14 days.
        */
        customerPlan(calendarByDaysFiveYears, "Suzanne Birthday", YEAR_2019, MONTH_DECEMBER, 7, 14, ADD_PLAN);
        customerPlan(calendarByDaysFiveYears, "Suzanne Birthday", YEAR_2019, MONTH_DECEMBER, 7, 14, DELETE_PLAN);
        customerPlan(calendarByDaysFiveYears, "Suzanne Birthday", YEAR_2019, MONTH_DECEMBER, 6, 14, ADD_PLAN);
        /*
        ** Set Birthday for Christopher, Jun 30. Then change it because it is actually
        ** on the 16th. Set reminders for 2 weeks or 7 days.
        */
        customerPlan(calendarByDaysFiveYears, "Christopher Birthday", YEAR_2019, MONTH_JUNE, 30, 7, ADD_PLAN);
        customerPlan(calendarByDaysFiveYears, "Christopher Birthday", YEAR_2019, MONTH_JUNE, 16, 7, CHANGE_PLAN);
    }
    /*
    ** This method simulates adding, deleting and changing plans, with reminders. All it really does is populate the String Array with the details, but in the 
    ** correct array container for that date in the 2-dimensional array. I think the main point of this particular option was to populate the array correctly and play
    ** with dates.
    **
    ** Again, this is not the perfect code, it is just a basic setup to simulate. It could probably handle the change a lot better. It could handle much more with defining a
    ** class instead of an array. However, I think/hope it satisfies the point of the assignment which says basic add, delete and change with no other implementation really.
    */
    public static void customerPlan(String[][] calendarByDaysFiveYears, String planDesc, int year, int month, int day, int daysReminder, char actionPlan) {

        final int YEAR_2019 = 2019;
        final int YEAR_2020 = 2020;
        final int YEAR_2021 = 2021;
        final int YEAR_2022 = 2022;
        final int YEAR_2023 = 2023;

        final char ADD_PLAN = 'A';
        final char DELETE_PLAN = 'D';
        final char CHANGE_PLAN = 'C';

        Scanner input = new Scanner(System.in);
        String nextPrompt = " ";
        
        /*
        ** The index for the year is different than the year value. It is the
        ** array index set for this 5-year array where 0 is the first year 2019.
        */

        int indexYear = 0;
        
        switch (year) {
            case YEAR_2019:
                indexYear = 0;
                break;
            case YEAR_2020:
                indexYear = 1;
                break;
            case YEAR_2021:
                indexYear = 2;
                break;
            case YEAR_2022:
                indexYear = 3;
                break;
            case YEAR_2023:
                indexYear = 4;
                break;
            default:
                indexYear = 0;
        }
        
        /*
        ** Define the date field planDate and modify it for the planned event date.
        */
        LocalDate todayDate = LocalDate.now();
        LocalDate planDate = LocalDate.now();
        
        planDate = planDate.withYear(year);
        planDate = planDate.withMonth(month);
        planDate = planDate.withDayOfMonth(day);
        
        /*
        ** Now determine the day index based on 364 days for non-leap year and 365
        ** days for leap year.
        */
        int dayofYear = 0;
        dayofYear = planDate.getDayOfYear();
        
        switch (actionPlan) {
            case ADD_PLAN: case CHANGE_PLAN:
                calendarByDaysFiveYears[indexYear][dayofYear-1] = planDate + ": " + planDesc
                    + ". Reminder set to " + daysReminder + " days";
                System.out.println("\nPlan Added/Changed: " + calendarByDaysFiveYears[indexYear][dayofYear-1]);  
                break;
            case DELETE_PLAN:
                calendarByDaysFiveYears[indexYear][dayofYear-1] = "";
                System.out.println("\nPlan Deleted: " + planDate + ": " + calendarByDaysFiveYears[indexYear][dayofYear-1]);  
                break;
            default:
                calendarByDaysFiveYears[indexYear][dayofYear-1] = planDate + ": " + planDesc
                    + ". Reminder set to " + daysReminder + " days";
                System.out.println("\nPlan Added/Changed: " + calendarByDaysFiveYears[indexYear][dayofYear-1]);  
        }

        System.out.print("\n\nPress <ENTER> Key to Continue: ");
        nextPrompt = input.nextLine().toUpperCase();
    }
}
