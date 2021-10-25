import java.util.Scanner;
import java.util.Calendar;

public class Ex4_Login_TE_pt1 {

    public static void main(String[] args) {
        Scanner numscan = new Scanner(System.in);
        Scanner wordscan = new Scanner(System.in);

        // Part 1: Login information
        String savedUser = "mr. wiebe";
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
            System.out.println("Mr. Wiebe has found his people!");
        }
        
    }//end main

}//end class
