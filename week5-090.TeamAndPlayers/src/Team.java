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

public class Team {
    
    private String name;
    private ArrayList<Player> roster;
    private int maxSize;
    
    public Team(String name) {
        this.name = name;
        this.roster = new ArrayList<Player>();
        this.maxSize = 16;
    }
    
    public String getName() {
        return name;
    }
    
    public void addPlayer(Player player) {
        if (this.size() < maxSize) {
            roster.add(player);
        }
    }
    
    public void printPlayers() {
        for (Player players : roster) {
            System.out.println(players);
        }
    }
    
    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }
    
    public int size(){
        return roster.size();
    }
    
    public int goals() {
        int goalSum = 0;
        for (Player players : roster) {
            goalSum += players.goals();
        }
        return goalSum;
    }
    
}
