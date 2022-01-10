/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duane
 */
public class dgParams {
    
    String userInput = "";
    String[] roomDesc = {
        "You are in the entry hall. There is a closet with a ring of garlic "
            + "hanging on it, chair, coat rack, chest and picture of an "
            + "old man. It is a long narrow room. There are doors to the "
            + "north, east, west and south.",
        "You are in the grand hall. It has a high ceiling, chandelier, "
            + "armoire, fire place, chairs in front, "
            + "desk, piano and an electric guitar. The fire is out. There is "
            + "a door to the east, west and south.",
        "You are in the dining room. There is table. It has a plate full of "
            + "fish. There is a door to the west and south.",
        "You are in a kitchen. You see a black cat in the southeast corner. "
            + " There is a door to the north and west."
    };
    boolean cheatMode = false;
    boolean openedChest = false;
    boolean openedDesk = false;
    boolean hasKey = false;
    boolean hasStrings = false;
    boolean hasMatches = false;
    boolean fireStarted = false;
    boolean rm2LightsOn = false;
    boolean hasGarlic = false;
    boolean ratGone = false;
    boolean hasFish = false;
    boolean hasCat = false;
    String catName = "Black Cat";
    int room = 1;
    boolean keepGoing = true;
}
