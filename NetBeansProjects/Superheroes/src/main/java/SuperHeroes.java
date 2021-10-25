/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Duane
 */
public class SuperHeroes {
    
    public static void main(String[] args) {
        String[] heroName = {"Thor", "Batman", "Superman", "Spiderman", "Wolverine"}; 
        String[] superPower = {"God", "Technology", "Super Everything", "Spider Powers", "Mutant Self-Healing"};
        Boolean[] isHuman = {false, true, false, true, true};
        
        printFirstHeroName(heroName);
        printLastHeroName(heroName);
        printAllHeroNames(heroName);
        printDetailHeroList(heroName, superPower, isHuman);
        printAfterExposureHeroList(heroName, superPower, isHuman);

        String [] MsWiebeClassNames = {"Computer Science 20", "Computer Science 10", "Computer Science 30", "Computer Science AP"};
        String [][] MsWiebeClassStudents = { 
            {"Bobert", "Jaynifer", "Boulder"},
            {"Boberta", "Jaynifo", "Rocky"},
            {"Bobertium", "Jaynifa", "Gravela"},
            {"Boberto", "Jayniferous", "Minerelle"}
        };

        printAllNames(MsWiebeClassStudents);
        printAllCoursesNames(MsWiebeClassNames, MsWiebeClassStudents);
        printRequestedCoursesNames(MsWiebeClassNames, MsWiebeClassStudents, 3);
}

    public static void printAllHeroNames(String [] names) {
        System.out.println();
        System.out.println("List of All Hero Names:");
        for (int i = 0; i < names.length; i++) {
            System.out.println("Hero " + (i+1) + " Name is " + names[i]);
        }        
    }
    
    public static void printFirstHeroName(String [] names) {
        System.out.println("The First Hero's Name is " + names[0]);
    }
    
    public static void printLastHeroName(String [] names) {
        System.out.println("The Last Hero's Name is " + names[names.length - 1]);
    }
    
    public static void printDetailHeroList(String [] names, String [] power, Boolean [] human) {
        System.out.println();
        System.out.println("Detaled List of All Heros:");
        System.out.println("Index   Name    Power   Are they Human?");
        for (int i = 0; i < names.length; i++) {
            System.out.println(i + "    " + names[i] + "    " + power[i] + "    " + human[i]);
        }        
    }
        
    public static void printAfterExposureHeroList(String [] names, String [] power, Boolean [] human) {
        System.out.println();
        System.out.println("Detaled List of All Heros After Exposure:");
        System.out.println("Index   Name    Power   Are they Human?");
        for (int i = 0; i < names.length; i++) {
            String afterExposurePower = "NONE";
            if (human[i]) {
                afterExposurePower = power[i];
            }
            System.out.println(i + "    " + names[i] + "    " + afterExposurePower + "    " + human[i]);
        }        
    }
    
    public static void printAllNames(String names[][]) {
        System.out.println();
        System.out.println("All Names for All Classes:");
        for (int i = 0; i < names.length; i++) {
            System.out.print("Class " + (i+1) + ":");
            for (int j = 0; j < names[i].length; j++) {
                String comma = ",";
                if (j == 0) comma = "";
                System.out.print(comma + " " + names[i][j]);
            }
            System.out.println();
        }
    }
    
    public static void printAllCoursesNames(String course [], String names[][]) {
        System.out.println();
        System.out.println("All Course and Student Names for All Classes:");
        for (int i = 0; i < names.length; i++) {
            System.out.print(course [i] + ":");
            for (int j = 0; j < names[i].length; j++) {
                String comma = ",";
                if (j == 0) comma = "";
                System.out.print(comma + " " + names[i][j]);
            }
            System.out.println();
        }
    }
    
    public static void printRequestedCoursesNames(String course [], String names[][], int courseNo) {
        int i = courseNo - 1;
        System.out.println();
        System.out.println("Course " + courseNo + " and Student Names:");
        System.out.print(course [i] + ":");
        for (int j = 0; j < names[i].length; j++) {
            String comma = ",";
            if (j == 0) comma = "";
            System.out.print(comma + " " + names[i][j]);
        }
        System.out.println();
    }    
}
