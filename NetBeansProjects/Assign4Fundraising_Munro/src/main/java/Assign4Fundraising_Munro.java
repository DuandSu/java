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

public class Assign4Fundraising_Munro {
    
    public static void main(String[] args){
        String[] studentNames = {"Duane", "Suzanne", "Shelesea", "Victoria", 
            "Joseph", "Sasha", "Alessandra","Christopher", "Diesel", "Noahbody"};
        float[] studentRaised = {501, 500, 10, 99, 110, 120, 501, 499, 0, -10};
        boolean[] studentForms = {true, true, false, false, true, true, false, true, false, false};
        
        printStudentDetailList(studentNames, studentRaised, studentForms);
        
    }
    
    public static void printStudentDetailList(String[] studentNames, float[] studentRaised, boolean[] studentForms) {
        String printComma;
        ArrayList<Integer> highestRaisedIndex = new ArrayList<>();
        float highestRaisedAmt = 0;
        
        System.out.println();
        System.out.println("Detailed Student List:");
        System.out.println(String.format("%15s", "Name") + String.format("%14s","$ Raised") + String.format("%9s", "Reg Form"));
        System.out.println(String.format("%15s", "---------------") + String.format("%14s"," -------------") + String.format("%9s", " --------"));
        
        float totalRaised = 0;
        int countLess100 = 0;
        for (int i = 0; i < studentNames.length; i++) {
            System.out.println(String.format("%15s", studentNames[i]) + String.format("   $%10.2f", studentRaised[i]) + String.format("%9b", studentForms[i]));
                totalRaised += studentRaised[i];
            if (studentRaised[i] < 100) countLess100++;
            if (studentRaised[i] > highestRaisedAmt) {
                highestRaisedAmt = studentRaised[i];
                highestRaisedIndex.clear();
                highestRaisedIndex.add(i);
            } else if (studentRaised[i] == highestRaisedAmt) {
                highestRaisedIndex.add(i);
            }
        }
        System.out.println();
        System.out.println(String.format("Total Raised by Team: $%10.2f",totalRaised));
        System.out.println(String.format("Average Raised per Student: $%10.2f", (totalRaised / studentNames.length)));
        System.out.println(countLess100 + " students did NOT meet their $100 quota!");
        System.out.print("Time to consider cutting the following bakers: ");
       
        printComma = "";
        for (int i = 0; i < studentRaised.length; i++) {
            if (studentRaised[i] < 100) {
                System.out.print(printComma + studentNames[i]);
                printComma = ", ";
            }
        }
        System.out.println();
       
        System.out.print("The following have NOT returned their forms: ");
        printComma = "";
        for (int i = 0; i < studentForms.length; i++) {
            if (!studentForms[i]) {
                System.out.print(printComma + studentNames[i]);
                printComma = ", ";
            }
        }
        System.out.println();

        System.out.print(String.format("Congratulations to the highest earners of $%10.2f: ", highestRaisedAmt));
        printComma = "";
        for (int i = 0; i < highestRaisedIndex.size(); i++) {
            System.out.print(printComma + studentNames[highestRaisedIndex.get(i)]);
            printComma = ", ";
        }
        System.out.println();
        
        System.out.print("The following qualify for the scholarship: ");
        printComma = "";
        for (int i = 0; i < studentRaised.length; i++) {
            if (studentRaised[i] >= 500) {
                System.out.print(printComma + studentNames[i]);
                printComma = ", ";
            }
        }
        System.out.println();
    }
}
