/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex10_2_exercise;

/**
 *
 * @author Duane
 * This contains the code for both Exercises 10-2 & 10-3. 10-2 is commented out
 * chained if then else statement. 10-3 is the switch case and ternary replacements.
 */
public class Order {

    static final char CORP = 'C';
    static final char PRIVATE = 'P';
    static final char NONPROFIT = 'N';
    String name;
    double total;
    String stateCode;
    double discount;
    char custType;

    public Order(String name, double total, String state, char custType) {
        this.name = name;
        this.total = total;
        this.stateCode = state;
        this.custType = custType;
        calcDiscount();
    }
    
    public String getDiscount(){
        return Double.toString(discount) + "%";
    }

    // Code the calcDiscount method.
    public void calcDiscount() {
        /*if (custType == NONPROFIT) {
            if (total > 900) {
                discount = 10;
            }
            else {
                discount = 5;
            }
        }
        else if (custType == PRIVATE) {
            if (total > 900) {
                discount = 7;
            }
            else {
                discount = 0;
            }
        }
        else if (custType == CORP) {
            if (total > 500) {
                discount = 8;
            }
            else {
                discount = 5;
            }
        }
        else {
            discount = 0;
        }*/

        switch (custType) {
            case NONPROFIT:
                /*if (total > 900) {
                    discount = 10;
                }
                else {
                    discount = 5;
                } */
                discount = (total > 900) ? 10 : 5;
                break;
            case PRIVATE:
                /*if (total > 900) {
                    discount = 7;
                }
                else {
                    discount = 0;
                }*/
                discount = (total > 900) ? 7 : 0;
                break;
            case CORP:
                /*if (total > 500) {
                    discount = 8;
                }
                else {
                    discount = 5;
                }*/
                discount = (total > 500) ? 8 : 5;
                break;
            default:
                discount = 0;
        }
         
    }    
}
