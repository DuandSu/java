/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animals;

/**
 *
 * @author Duane Munro
  * This is the solution for Assignment 4 Exercise 1.
*/
public class Animals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String [] basicAnimalFood = {"Water", "Other Animals", "Plants"};
        // Test Prevention of creating Animal Object. Uncomment and shows error
        // "Animal is abstract; cannot be instantiated.".
        //Animal basicAnimal = new Animal("Animal Object", basicAnimalFood);

        // Create a Mouse and print it.
        String [] fieldMouseFood = {"Water", "Seeds", "Vegetables", "Meat"};
        Mouse fieldMouse = new Mouse("Field Mouse", fieldMouseFood, 5.0);
        fieldMouse.printAnimal("New Mouse");
        
        // Mouse had gained weight. Modify and print
        fieldMouse.setWeight(8);
        fieldMouse.printAnimal("Changed Mouse");
        
        // Next Mouse is a vegetarian species. Create and print
        String [] vegiMouseFood = {"Water", "Seeds", "Vegetables"};
        Mouse vegiMouse = new Mouse("Vegetarian Mouse", vegiMouseFood, 3.0);
        vegiMouse.printAnimal("Changed Mouse");


        // Create a Default Mouse and print it.
        String [] defaultMouseFood = {"1", "2", "3", "4"};
        Mouse defaultMouse = new Mouse();
        defaultMouse.printAnimal("Default Mouse");

        // Create a Cat and print it.
        String [] blackCatFood = {"Water", "Mouse", "Duck", "Meat"};
        Cat blackCat = new Cat("Black Cat", blackCatFood, 6, 20.0);
        blackCat.printAnimal(blackCat.getName());

        // Create the subclass Asian Cat of super class Cat and print it.
        String [] asianCatFood = {"Water", "Ginger Fried Mouse", "Peking Duck", "Meat"};
        AsianCat asianCat = new AsianCat("Asian Cat", asianCatFood, 10, 20.0, 15.0);
        asianCat.printAnimal(asianCat.getName());

        // Create an object Cat that references to an Asian cat.
        Cat blackAsianCat = new AsianCat("Black Asian Cat", asianCatFood, 12, 22.0, 15.2);
        blackAsianCat.printAnimal(blackAsianCat.getName());

        // Cat grew and got heavier. Notice casting to allow use of AsianCat
        // method setWeight method.
        blackAsianCat.setHeight(22.0);
        if (blackAsianCat instanceof AsianCat) {
            ((AsianCat)blackAsianCat).setWeight(32.0);
        }
        blackAsianCat.printAnimal("Heavier " + blackAsianCat.getName());

        // Create a Duck and print it.
        String [] duckFood = {"Water", "Insects", "Water Plants"};
        Duck duck = new Duck("Purple Duck", duckFood, "Purple");
        duck.printAnimal(duck.getName());
        
        // Purple duck gets the duckie pox
        duck.setColor("Purple with Red Spots");
        duck.printAnimal(duck.getName());
    }
    
}
