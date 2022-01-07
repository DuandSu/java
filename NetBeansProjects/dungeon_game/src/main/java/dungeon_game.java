
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Duane
 */
public class dungeon_game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner numscan = new Scanner(System.in);
        Scanner wordscan = new Scanner(System.in);
        
        String userInput = "";
        
        String[] roomDesc = {
            "You are in the entry hall. There is a closet, chair, chest, coat "
                + "rack and a picture of an old man. It is a long narrow room. "
                + "There are doors to the North, West and East.",
            "You are in the grand hall. It has a high ceiling, chandelier, "
                + "an armoire, a fire place, chairs in front, a "
                + "desk, a piano, an electric guitar. The fire is out. There is "
                + "a door to the west, east and south.",
            "You are in an empty room. There is nothing to do here. There is "
                + "a door to the west and south.",
            "You are in an empty room. There is nothing to do here. There is "
                + "a door to the west and north."
        };
        boolean openedChest = false;
        boolean openedDesk = false;
        boolean hasKey = false;
        boolean hasStrings = false;
        boolean hasMatches = false;
        boolean fireStarted = false;
        boolean rm2LightsOn = false;
        int room = 1;
        boolean keepGoing = true;
        while (keepGoing) {
            System.out.println("\n" + roomDesc[room-1] + "\n");
            System.out.println("\n What would you like to do? ");
            userInput = wordscan.nextLine().toLowerCase();
            
            if (userInput.contains("exit") || userInput.contains("quit") || userInput.contains("die")) {
                keepGoing = false;
                System.out.println("\nThanks for Playing. Have a good DEATH!");
            }
            else if (userInput.contains("help") || userInput.contains("?")) {
                System.out.println("\n\nType in the word for the item you want to get, observe or go into. Type HELP to get this message.");
            }
            else if (userInput.contains("cry") || userInput.contains("scream") ||
                    userInput.contains("mad") || userInput.contains("shout")) {
                System.out.println("\n\nBy all means! If you think it will help, "
                        + "but I think it is a waste of time!");
            }
            else {
                if (room == 1) {
                    if (userInput.contains("north")) {
                        if (hasKey) {
                            System.out.println("\nYou are going through the north door");
                            room = 2;
                        }
                        else {
                            System.out.println("\nDarn! The door seems to be "
                                    + "locked!");
                        }
                    }
                    else if (userInput.contains("east")) {
                        if (hasKey) {
                            System.out.println("\nYou are going through the east door");
                            room = 4;
                        }
                        else {
                            System.out.println("\nDarn! The door seems to be "
                                    + "locked!");
                        }
                    }
                    else if (userInput.contains("west")) {
                        if (hasKey) {
                            System.out.println("\nYou are going through the west door");
                        }
                        else {
                            System.out.println("\nDarn! The door seems to be "
                                    + "locked!");                            
                        }
                    }
                    else if (userInput.contains("south")) {
                        System.out.println("\nThat's the door you just came "
                        + "through ya big dummy! You go through the south door "
                        + "and are greeted by the band of orcs that were chasing "
                        + "you! Remember? They smile and grunt HALLO, then chop your head off!");
                        keepGoing = false;
                        System.out.println("\nThanks for Playing. Have a good DEATH!");
                    }
                    else if (userInput.contains("closet")) {
                        System.out.println("\nYou open the closet doors and "
                                + "discover a tall gentleman with razor sharp"
                                + " teeth. He crys Velcom to my domain. He bites "
                                + "your neck, drinks your blood. Yup. You are DEAD!");
                        keepGoing = false;
                        System.out.println("\nThanks for Playing. Have a good DEATH!");
                    }
                    else if (userInput.contains("picture") || userInput.contains("man")) {
                        System.out.println("\nYou look at the picture. It looks"
                                + " familiar. You decide it looks like a VERY "
                                + "OLD version of yourself. Then he sticks his"
                                + " tongue out at you. Blahhh!");
                    }
                    else if (userInput.contains("coat") || userInput.contains("rack")) {
                        System.out.println("\nYou hang up your coat. The coat "
                                + "rack says Thanks Man! Puts it on and "
                                + "disappears.");
                    }
                    else if (userInput.contains("chest")) {
                        System.out.println("\nYou open the chest and discover "
                                + "a key. Wow! I wonder what that could be used "
                                + "for. Think hard dummy!");
                        openedChest = true;
                    }
                    else if (userInput.contains("key")) {
                        if (openedChest) {
                            System.out.println("\nYou open the chest and pocket "
                                    + "the key. It might come in handy.");
                            hasKey = true;
                        }
                        else {
                            System.out.println("\nGood Idea! Maybe you should "
                                    + "find one.")
                        }
                    }
                    else if (userInput.contains("chair") || userInput.contains("sit")) {
                        System.out.println("\nYou are so thankful to sit in the "
                                + "chair because you are so tired. You fall "
                                + "DEAD asleep. Key word is DEAD!");
                        keepGoing = false;
                        System.out.println("\nThanks for Playing. Have a good DEATH!");                    }
                }
                else if (room == 2) {
                    if (userInput.contains("south")) {
                        if (hasKey) {
                            System.out.println("\nYou are going through the south door");
                            room = 1;
                        }
                        else {
                            System.out.println("\nDarn! The door seems to be "
                                    + "locked!"
                        }
                    }                    
                    else if (userInput.contains("east")) {
                        if (hasKey) {
                            System.out.println("\nYou are going through the east door");
                            room = 3;
                        }
                        else {
                            System.out.println("\nDarn! The door seems to be "
                                    + "locked!");
                        }
                    }
                    else if (userInput.contains("west")) {
                        if (hasKey) {
                            System.out.println("\nYou are going through the west door");
                        }
                        else {
                            System.out.println("\nDarn! The door seems to be "
                                    + "locked!");                            
                        }
                    }
                    else if (userInput.contains("light") || userInput.contains("chandelier")) {
                        if (rm2LightsOn) {
                            System.out.println("\nYou decide this room looks better "
                                    + "dark and turn the lights off! First good "
                                    + "decision you've made so far.");
                        }
                        else {
                            System.out.println("\nYou see a light switch and "
                                    + "turn the lights on. God. Is this room "
                                    + "dusty and dirty. You also notice a pack "
                                    + "of bats in the ceiling.");                            
                        }
                        rm2LightsOn = !rm2LightsOn;
                    }
                    else if (userInput.contains("armoire") || userInput.contains("closet")) {
                        System.out.println("\nYou open the armoire hoping for "
                                + "some stylish clothes. Out jumps a pack rat. "
                                + "He grabs your key and runs through the east "
                                + "door. You have no key to get through the "
                                + "doors now. Unless you want to perish slowly, "
                                + "The key command you are looking for is DIE!");
                        hasKey = false;
                    }
                    else if (userInput.contains("piano")) {
                        System.out.println("\nOK Elton! You rock an incredible "
                                + "version of chop sticks. The bats in the "
                                + "ceiling applaud!");
                    }
                    else if (userInput.contains("desk")) {
                        System.out.println("\nWow. The desk contains guitar "
                                + "strings and matches. Maybe you can burn "
                                + "your guitar and play the fire place!");
                        openedDesk = true;
                    }
                    else if (userInput.contains("strings")) {
                        if (openedDesk) {
                            System.out.println("\nYou open the desk and grab "
                                    + "the guitar strings!");
                            hasStrings = true;
                        }
                        else {
                            System.out.println("\nGood idea. Maybe you should "
                                    + "find some!");                            
                        }
                    }
                    else if (userInput.contains("matches")) {
                        if (openedDesk) {
                            System.out.println("\nYou open the desk and grab "
                                    + "the matches!");
                            hasMatches = true;
                        }
                        else {
                            System.out.println("\nGood idea. Maybe you should "
                                    + "find some!");                            
                        }
                    }
                    else if (userInput.contains("guitar") || userInput.contains("electric")) {
                        if (hasStrings) {
                            System.out.println("\nOK Eddie! You put the strings "
                                    + "on the guitar and tune it, kind of. You "
                                    + "then rock an incredible version of "
                                    + "Eruption. The bats in the ceiling "
                                    + "screech for more!");
                        }
                        else {
                            System.out.println("\nSorry ole chap, but it seems "
                                    + "all the strings are broken! Maybe try "
                                    + "whistling?");
                        }
                    }
                    else if (userInput.contains("fire") || userInput.contains("place")) {
                        if (hasMatches) {
                            System.out.println("\nOK Fire Starter, you light a "
                                    + "match and somehow get a roaring blaze "
                                    + "going. Try not to burn down the house "
                                    + "please!");
                            fireStarted = true;
                        }
                        else {
                            System.out.println("\nSorry Mr. Pyromania. You "
                                    + "should know you need some fire for that, "
                                    + "or something to start it with!");
                        }
                    }
                    else if (userInput.contains("chair")) {
                        if (fireStarted) {
                            System.out.println("\nIt is so warm and toasty "
                                    + "sitting in front of this fire. You kind "
                                    + "of think maybe it is too hot, but "
                                    + "regardless you fall asleep. Suddenly, you "
                                    + "seem to be floating above the charred "
                                    + "remains of your body. You realize you are "
                                    + "a ghost and you are DEAD smart guy!");
                            keepGoing = false;
                            System.out.println("\nThanks for Playing. Have a good DEATH!");
                        }
                        else {
                            System.out.println("\nIt is really just too cold in "
                                    + "this room to be comfortable sitting in "
                                    + "this chair. You shiver and stand up!");
                        }
                    }
                }
                else if (room == 3) {
                    if (userInput.contains("west")) {
                        if (hasKey) {
                            System.out.println("\nYou are going through the west door");
                            room = 2;
                        }
                        else {
                            System.out.println("\nDarn! The door seems to be "
                                    + "locked!"
                        }
                    }                    
                    else if (userInput.contains("south")) {
                        if (hasKey) {
                            System.out.println("\nYou are going through the south door");
                            room = 4;
                        }
                        else {
                            System.out.println("\nDarn! The door seems to be "
                                    + "locked!");
                        }
                    }
                }
                else if (room == 4) {
                    if (userInput.contains("west")) {
                        if (hasKey) {
                            System.out.println("\nYou are going through the west door");
                            room = 1;
                        }
                        else {
                            System.out.println("\nDarn! The door seems to be "
                                    + "locked!"
                        }
                    }                    
                    else if (userInput.contains("north")) {
                        if (hasKey) {
                            System.out.println("\nYou are going through the north door");
                            room = 3;
                        }
                        else {
                            System.out.println("\nDarn! The door seems to be "
                                    + "locked!");
                        }
                    }
                }
                else {
                    System.out.println("\nSeems you are lost and don't know which room you are in. Go back to start!");
                    room = 1;
                }
            }
        }
    }
}
