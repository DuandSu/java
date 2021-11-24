/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Duane
 */
import java.util.ArrayList; // import the ArrayList class
import java.util.Scanner;

public class Assign5Translator_Munro {
    
    public static void main(String[] args){

        Scanner numscan = new Scanner(System.in);
        Scanner wordscan = new Scanner(System.in);

        String[] languages = {"English", "Dog"};
        String[] englishWords = {"play", "hi", "sad", "excited", "walk", 
            "hungry", "scared", "angry", "mad", "happy", "pee", "poop"};
        String[] dogWords = {"rrrrrr", "ruff", "mmmm", "mmmruff", "yup", 
            "whoof", "yip", "grrrrr", "grrrrr", "wuff", "yipruff", "yipruff"};

        int fromLangID;
        int toLangID;
        Boolean keepTranslating = true;
        String keepTransPick;
        while (keepTranslating) {
            System.out.println("Welcome to the Word translator!");
            printLanguages(languages);
            System.out.println();
            System.out.println("Type the number of the language you want to translate from: ");
            fromLangID = numscan.nextInt();
            System.out.println();
            System.out.println("Type the number of the language you want to translate to: ");
            toLangID = numscan.nextInt();

            if (fromLangID < 0 || fromLangID >= languages.length) {
                System.out.println();
                System.out.println("Your From Language pick " + fromLangID + " is not a valid selection.");
            } else if (toLangID < 0 || toLangID >= languages.length) {
                System.out.println();
                System.out.println("Your To Language pick " + toLangID + " is not a valid selection.");
            } else {
                System.out.println();
                System.out.println("You have selected to translate from " + languages[fromLangID] 
                    + " to " + languages[toLangID]);

                if (fromLangID == 0)
                    translate(languages, 0, englishWords, 1, dogWords);
                else
                    translate(languages, 1, dogWords, 0, englishWords);
            }

            System.out.println();
            System.out.println("Would you like to try selecting languages again? Type no or n: ");
            keepTransPick = wordscan.nextLine();
            if (keepTransPick.toLowerCase().startsWith("n")) keepTranslating = false;
        }
    }

    public static void printLanguages(String[] languages) {
        System.out.println();
        System.out.println("The translator works for the following languages: ");
        for (int i = 0; i < languages.length; i++) {
            System.out.println("    " + i + ". " + languages[i]);
        }
    }

    public static void printWords(String lang, String [] words) {
        System.out.println();
        System.out.println("The translator works for the following " + lang + " words:");
        for (int i = 0; i < words.length; i++) {
            System.out.println("    " + words[i]);
        }
    }

    public static void translate(String[] lang, int fromID, String[] fromLang, int toID, String[] toLang) {
        
        Scanner wordscan = new Scanner(System.in);
        String fromWord;
        Boolean anotherWord = true;
        String anotherPick;
        while(anotherWord) {
            printWords(lang[fromID], fromLang);
            System.out.println("Say the " + lang[fromID] +
                " word you want converted to " + lang[toID] + ": ");
            fromWord = wordscan.nextLine().toLowerCase();
            int foundID = -1;
            for (int i = 0; i < fromLang.length; i++) {
                if (fromWord.equals(fromLang[i])) {
                    foundID = i;
                    break;
                }
            }
            if (foundID >= 0) {
                System.out.println();
                System.out.println("The " + lang[toID] + " version is: " 
                    + toLang[foundID]);
            } else {
                System.out.println();
                System.out.println("There is no translation for that word!");
            }
            System.out.println();
            System.out.println("If you want to go again, say " + toLang[0] + " to continue: ");
            anotherPick = wordscan.nextLine().toLowerCase();
            if (!anotherPick.equals(toLang[0])) anotherWord = false;
        }
    }

}
