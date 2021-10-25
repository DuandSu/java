import java.util.Scanner;
public class Ex3_Number_Guess_Game {

    public static void main(String[] args) {
        Scanner numscan = new Scanner(System.in);
        Scanner wordscan = new Scanner(System.in);
        
        int userGuess, compNum;
        int highNum = 100;
        int lowNum = 1;
        int numTurns = 0;
        boolean keepGuessing = true, tryAgain;
        

        while (keepGuessing) {
            
            compNum =  (int)   (Math.random()*100 + 1);
            System.out.println("Debug: Computer number = " + compNum);
            
            tryAgain = true;
            lowNum = 1;
            highNum = 100;
            numTurns = 0;
            
            while (tryAgain) {
                
                System.out.println("Guess the number between " + lowNum + " and " + highNum + ": ");
                userGuess = numscan.nextInt();
                numTurns++;
                System.out.println("Debug: userGuess = " + userGuess + ". numTurns = " + numTurns);
                
                if (userGuess >= lowNum && userGuess <= 100) {
                    if (userGuess == compNum) {
                        System.out.println("Contratulations! You guessed the correct number " + userGuess + ". It took you " + numTurns + " attempts.");

                        System.out.println("Do you want to play again? ");
                        String playAgain = wordscan.nextLine().toLowerCase();

                        tryAgain = false;
                        if (playAgain.startsWith("n")) {
                            keepGuessing = false;
                        }
                    } else if (userGuess < compNum) {
                        System.out.println("The number you guessed " + userGuess + " is too low!. Try Again!");
                        lowNum = userGuess + 1;
                    } else {
                        System.out.println("The number you guessed " + userGuess + " is too high!. Try Again!");
                        highNum = userGuess - 1;                    
                    }
                } else {
                    System.out.println("Your guess of " + userGuess + " is NOT between " + lowNum + " and " + highNum + "! Try Again.");
                }
            }
        }
    }//end main
}//end class
