/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nacht
 */
public class Player {
    
    private String playerName;
    private int numberOfGoals;
    
    public Player(String playerName, int numberOfGoals) {
        this.playerName = playerName;
        this.numberOfGoals = numberOfGoals;
    }
    
    public Player(String playerName) {
        this.playerName = playerName;
    }
    
    public String getName() {
        return playerName;
    }
    
    public int goals() {
        return numberOfGoals;
    }
    
    public String toString() {
        return playerName + ", goals " + numberOfGoals;
    }
    
}
