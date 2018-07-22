/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nacht
 */
public class Bird {
    
    private String birdName;
    private String latinName;
    private int observations;
    
    public Bird(String name, String latin) {
        this.birdName = name;
        this.latinName = latin;
        this.observations = 0;
    }
    
    public String name(){
        return birdName;
    }
    
    public void observe() {
        observations += 1;
    }
    
    public int returnObservations() {
        return observations;
    }
    
    public String toString() {
        return birdName + " (" + latinName + "): " + observations + " observations";
    }
}
