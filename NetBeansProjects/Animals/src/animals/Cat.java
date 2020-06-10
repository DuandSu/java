/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animals;

/**
 *
 * @author Duane
 */
public class Cat extends Animal {
    
    private int age;
    private double height;
    
    public Cat (int age) {

        this.age = age;

    }
    
    public Cat (int age, double height) {
        
        this(age);
        this.height = height;
        
    }
    
    public Cat (String name, String[] food, int age, double height) {
        
        super(name, food); 
        this.age = age;
        this.height = height;
        
    }
    
    public Cat () {
        
        super();
        age = 0;
        height = 0.0;

    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }
    
    public void printAnimal(String title) {

        super.printAnimal(title);
        System.out.println("\tAge: " + this.getAge());
        System.out.println("\tHeight: " + this.getHeight());
        
    }
    
}
