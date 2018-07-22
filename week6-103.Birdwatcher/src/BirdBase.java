/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nacht
 */
import java.util.ArrayList;

public class BirdBase {
    
    private ArrayList<Bird> birds = new ArrayList<Bird>();
    
    public BirdBase() {
        
    }
    
    public void addBird(Bird birdy) {
        birds.add(birdy);
    }
    
    public boolean isBird(String name) {
        boolean c = false;
        for (Bird birbs : birds) {
            if (birbs.name().equals(name)) {
                c = true;
            }
        }
        return c;
    }
    
    public Bird search(String name) {
        Bird theBird = new Bird("blah","blah");
        for (Bird birbs : birds) {
            if (birbs.name().equals(name)) {
                theBird = birbs;
            }
        }
        return theBird;
    }
    
    public void observation(Bird birdy) {
        birdy.observe();
    }
    
    public String entry(Bird birdy) {
        return birdy.toString();
    }
    
    public String allEntries() {
        String everything = "";
        for (Bird birbs : birds) {
            everything += birbs + "\n";
        }
        return everything;
    }
    
    
}
