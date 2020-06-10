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
public class AsianCat extends Cat {
    
    private double weight;
    
    
    public AsianCat (int age, double height, double weight) {

        super(age, height); 
        this.weight = weight;

    }
    
    public AsianCat (String name, String[] food, int age, double height, double weight) {
        
        super(name, food, age, height); 
        this.weight = weight;
        
    }
    
    public AsianCat () {
        
        super();
        weight = 0.0;

    }

    /**
     * @return the weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public void printAnimal(String title) {

        super.printAnimal(title);
        System.out.println("\tWeight: " + this.getWeight());
        
    }
}
