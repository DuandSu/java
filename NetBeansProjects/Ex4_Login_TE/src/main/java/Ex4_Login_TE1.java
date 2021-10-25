import java.util.Scanner;
import java.util.Calendar;

public class Ex4_Login_TE {

    public static void main(String[] args) {
        Scanner numscan = new Scanner(System.in);
        Scanner wordscan = new Scanner(System.in);

        // Part 1: Login information
        String savedUser = "ms. wiebe";
        String savedPass = "adM1n";

        String username;
        String password;

        System.out.println("What is your username?");
        username = wordscan.nextLine().toLowerCase();// ".toLowerCase()" will make sure the string that becomes the username is all in lowercase.
        System.out.println("What is your password?");
        password = wordscan.nextLine();

        while (!(username.equalsIgnoreCase(savedUser) && password.equals(savedPass))) {// Remember, "!" means not. Also, ".equals" is case sensitive, ".equalsIgnoresCase" is not.
            System.out.println("Invalid username or password");
            System.out.println("What is your username?");
            username = wordscan.nextLine().toLowerCase();
            System.out.println("What is your password?");
            password = wordscan.nextLine();
        }
        System.out.println("Login successful!");
        
        if ( username.contains("toews")  || username.endsWith("reimer") ){
            System.out.println("Ms. Wiebe has found her people!");
        }
        
        // Part 2: Dates and selecting sub-strings
        String date = "September 21, 2001"; // The date the first episode of Jeopardy! with a moustache-less Alex Trebek aired. 
        String month = date.substring(0, 3) +"."; // ".substring()" will return just part of the string. The numbers indicate the first character to keep and the first number to ignore. Note: Often in computing science we start counting at 0, so the first thing in a list has a position of 0, not 1.
        System.out.println("Month is: " + month);
        String day = date.substring(date.indexOf(" ")+1, date.length()-6); // ".indexOf()" method will return the first position of the specified value. In this case, it finds the first space, then returns it's index value.
        // ".length()" method will return how many characters are in your string (including spaces).
        System.out.println("Day is: " + day + "st");
        
        String year = date.substring(date.length()-4);
        System.out.println("Year is: " + year);
        int age = 2020 - Integer.parseInt(year); // "Integer.parseInt()" is method in the Integer class that takes a string and converts it into an integer.
        System.out.println("Alex Trebek's bare uppper lip is " + age + " years old.");
         
        Calendar calendar = Calendar.getInstance(); // This line creates a Calendar object [called 'calendar']. Below, you can see how different properties can be retrieved from the calendar object.
        System.out.println("Year: " + calendar.get(Calendar.YEAR));
        System.out.println("Date: " + calendar.get(Calendar.DATE));
        System.out.println("Month: " + calendar.get(Calendar.MONTH)); // Java starts counting months starting with January = 0.
        System.out.println("Day:  " + calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("Time: " + calendar.getTime());
        
    }//end main

}//end class
