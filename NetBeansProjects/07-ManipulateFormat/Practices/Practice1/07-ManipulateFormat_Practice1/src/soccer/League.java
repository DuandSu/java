/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soccer;

/**
 *
 * @author Duane Munro
 */
public class League {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Create Team 1
        
        Player player1 = new Player();
        player1.playerName = "George Eliot";
        
        Player player2 = new Player();
        player2.playerName = "Graham Greene";
        
        Player player3 = new Player();
        player3.playerName = "Geoffrey Chaucer";
        
        Player[] thePlayers = {player1, player2, player3}; 
        
        Team team1 = new Team();
        team1.teamName = "The Greens";
        team1.playerArray = thePlayers;
        
        //player1.playerName = "Robert Service";
        
        // Create Team 2
    
        Team team2 = new Team();
        team2.teamName = "The Reds";
        team2.playerArray = new Player[3];

        // Commenting out the new Player () for each array element causes NullPointerException. Ali explained why in class.
        // Answer is simple. Java requires that you instantiate each array element. Live with it.
        
        team2.playerArray[0] = new Player();
        team2.playerArray[0].playerName = "Robert Service";
        
        team2.playerArray[1] = new Player();
        team2.playerArray[1].playerName = "Robbie Burns";
        
        team2.playerArray[2] = new Player();
        team2.playerArray[2].playerName = "Rafael Sabatini";
        
        /* Practice 6-2 asks to remove the two 6-1 practice for loops below
        for (Player thePlayer : team1.playerArray) {
            System.out.println("Team " + team1.teamName + " has player " + thePlayer.playerName);
        }

        System.out.println();
        
        for (Player thePlayer : team2.playerArray) {
            System.out.println("Team " + team2.teamName + " has player " + thePlayer.playerName);
        } */
        
        
        /* Practice 6-2. Create a Game here */
        
        Game currGame = new Game();
        
        currGame.homeTeam = team1;
        currGame.awayTeam = team2;
        
        /* Practice 6-2. Create a Goal object here */
        
        Goal goal1 = new Goal();
        goal1.theTeam = currGame.homeTeam;
        goal1.thePlayer = currGame.homeTeam.playerArray[2];
        goal1.theTime = 55;
        
        /* Practice 6-2. Put  Goal object in a Goal array and assign Goal array to goals attribute of Game object */

        Goal[] theGoals = {goal1};
        currGame.goals = theGoals;
        
        /* Practice 6-2. Print out the score of the Game */

        System.out.println("Goal scored after " + 
                currGame.goals[0].theTime + " mins by " +
                currGame.goals[0].thePlayer.playerName + " of " +
                currGame.goals[0].theTeam.teamName);
        
        /* Practice 7-1. Add code for finding a player within team2 here */
        
        System.out.println("Using 'contains': Searching for someone with 'Saba' in their name:");
        for (Player checkPlayer : team2.playerArray) {
            if (checkPlayer.playerName.contains("Saba")){
                System.out.println("Found Player named " + checkPlayer.playerName);
            }
        }
        
        System.out.println("Using 'endsWith': Searching for someone last name 'Sabatini':");
        for (Player checkPlayer : team2.playerArray) {
            if (checkPlayer.playerName.endsWith("Sabatini")){
                System.out.println("Found Player named " + checkPlayer.playerName);
            }
        }
        
        System.out.println("Using 'matches': Searching for Rafael Sabatini:");
        for (Player checkPlayer : team2.playerArray) {
            if (checkPlayer.playerName.matches(".*Saba.*")){
                System.out.println("Found Player named " + checkPlayer.playerName);
                System.out.println("First name is " + checkPlayer.playerName.split(" ") [0]);
                System.out.println("Last name is " + checkPlayer.playerName.split(" ") [1]);
            }
            
        }
        
        StringBuilder familyNameFirst = new StringBuilder();
        
        System.out.println("Team 1:");
        for (Player thePlayer : team1.playerArray) {
            
            String name[] = thePlayer.playerName.split(" ");
            System.out.println("Last name, First name is " + name [1] + ", " + name[0]);
            
            familyNameFirst.append(name[1]);
            familyNameFirst.append(", ");
            familyNameFirst.append(name[0]);
            System.out.println(familyNameFirst);
            familyNameFirst.delete(0, familyNameFirst.length());
        }
    }   
}
