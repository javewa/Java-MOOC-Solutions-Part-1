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
import java.util.Arrays;

public class Distribution {
    
    private ArrayList<Integer> grades = new ArrayList<Integer>();
    private int[] scores = new int[6];
    
    public Distribution() {
    }
    
    public void addGrades(Integer grade) {
        grades.add(grade);
    }
    
    public void sortGrades() {
        for (Integer grade : grades) {
            if (grade >= 0 && grade <= 60) {
                if (grade < 30) {
                    scores[0] += 1;
                } else if (grade < 35) {
                    scores[1] += 1;
                } else if (grade < 40) {
                    scores[2] += 1;
                } else if (grade < 45) {
                    scores[3] += 1;
                } else if (grade < 50) {
                    scores[4] += 1;
                } else {
                    scores[5] += 1;
                }
            }
        }
    }    
    
    public String graphLine() {
        String graph = "Grade Distribution: \n";
        //for (int num : grades) {
        //    graph += num;
        //}
        //for (int i = 0; i < scores.length; i++) {
         //   graph += scores[i];
        //}
        for (int i = scores.length - 1; i >= 0; i--) {
           graph += i + ": ";
           for (int j = 0; j < scores[i]; j++) {
                graph += "*";
           }
           graph += "\n";
        }
        graph += "Acceptance percentage: " + acceptancePercentage();
        return graph;
    }
    
    public double acceptancePercentage() {
        int allScores = 0;
        int acceptance = 0;
        for (int i = 0; i < scores.length; i++) {
            allScores += scores[i];
        }
        for (int i = 1; i < scores.length; i++) {
            acceptance += scores[i];
        }
        return 100.0*acceptance/allScores;
    }
    
}
