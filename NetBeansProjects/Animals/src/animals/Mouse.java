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
public class Mouse extends Animal {
    
    private double weight;
    
    public Mouse (double weight) {
        
        this.weight = weight;
        
    }
    
    public Mouse (String name, String[] food, double weight) {
        
        super(name, food); 
        this.weight = weight;
        
    }
        
    public Mouse () {
        
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
