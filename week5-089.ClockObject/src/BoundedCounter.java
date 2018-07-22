/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nacht
 */
public class BoundedCounter {
    private int value;
    private int upperLimit;
    
    public BoundedCounter(int upperLimit, int value) {
        this.upperLimit = upperLimit;
        this.value = value;
    }
    
    public void next() {
        this.value += 1;
        if (this.value >= this.upperLimit) {
            this.value = 0;
        }
    }
    
    public String toString() {
        if (value < 10) {
            return "0" + value;
        } else {
            return "" + value;
        }
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int parameter) {
        if (!(parameter < 0 || parameter >this.upperLimit)) {
            this.value = parameter;
        }
    }
}
