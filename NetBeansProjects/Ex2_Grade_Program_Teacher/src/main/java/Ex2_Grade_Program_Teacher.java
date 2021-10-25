import java.util.Scanner;

public class Ex2_Grade_Program_Teacher {
    public static void main(String[] args){
        Scanner numscan = new Scanner(System.in);
        Scanner wordscan = new Scanner(System.in);

        String name;
        String course;
        int percentage;
        String letter;
        double rating;
        String response;

        while (true) {

            System.out.println("What is your name?");
            name = wordscan.nextLine();
            System.out.println("What percentage did you get?");
            percentage = numscan.nextInt();
            System.out.println("What course are you taking?");
            course = wordscan.nextLine();

            if (percentage < 50) {
                letter = "an F";
            } else if (percentage >= 50 && percentage < 80) {
                letter = "a C";
            } else {
                letter = "an A";
            }

            System.out.print(name + ", your mark in " + course); //print, instead of println, won't end in going to a new line.
            System.out.println(" is " + letter + ".");
            System.out.println();

            System.out.println("Beep, boop. Can I ask you a question?");
            String reply = wordscan.nextLine();

            if (reply.equalsIgnoreCase("yes")) { // '.equalsIgnoreCase()' is a method that checks if the string 
                //supplied matches what is in the brackets, ignoring whether the letters are upper or lowercase.
                // It will return a boolean (true or false). Use '.equals()' if you do care about case.
                System.out.println("On a scale of 1 to 10, how good of a computer am I, 10 being the best?");
                rating = numscan.nextDouble();
                if (rating >= 10.0) {
                    response = "Wow! *blushes in binary* ";
                } else if (rating < 10 && rating >= 5) {
                    response = "That's not too bad. I'll keep trying my best, and I know I'll get better! ";
                } else {
                    response = "I'm sorry...*cries in binary* ";
                }
                System.out.print(response);
            } else {
                System.out.print("Oh, okay. ");
            }

            System.out.println("Would you like to check the grades of another student?");
            String answer = wordscan.nextLine().toLowerCase(); //'toLowerCase()' will convert the string to all lowercase letters.
            if (answer.startsWith("n")){ //'startsWith' checks if a string starts with something. Returns a boolean.
                break;
            }
            
        }//end while
    }//end main
}//end class
