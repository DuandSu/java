/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animals;

/**
 *
 * @author Duane Munro
 */
public abstract class Animal {
    
    private String name;
    private String[] food;
    
    public Animal (String name) {

        this.name = name;

    }
    
    public Animal (String name, String[] food) {
        
        this(name);
        this.food = food;
        
    }
    
    public Animal () {
        
        name = "Name NOT Set";
        food = new String[] {"Food NOT Set"};

    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the food
     */
    public String[] getFood() {
        return food;
    }

    /**
     * @param food the food to set
     */
    public void setFood(String[] food) {
        this.food = food;
    }
    
    public void printAnimal(String title) {
        System.out.println("\nPrinting " + title + ":");
        System.out.println("\tName: " + this.getName());
        for (int i = 0; i < this.getFood().length; i++) {
            System.out.println("\tFood" + (i+1) + ": " + this.getFood()[i]);
        }
    }
}

