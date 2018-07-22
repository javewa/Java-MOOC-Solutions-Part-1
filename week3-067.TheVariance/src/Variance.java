import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int accum = 0;
        for (int thing : list) {
            accum += thing;
        }
        return accum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        int counter = 0;
        for (int thing : list) {
            counter += 1;
        }
        return 1.0 * sum(list)/counter;
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        double avg = average(list);
        double c = 0;
        int n = 0;
        for (int num : list) {
            c += (num - avg) * (num - avg);
            n += 1;
        }
        return c/(n-1);
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
