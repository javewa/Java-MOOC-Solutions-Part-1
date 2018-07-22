
import java.util.ArrayList;

public class AverageOfNumbers {

    // Copy here the method sum from previous assignment
    public static int sum(ArrayList<Integer> list) {
        int accum = 0;
        for (int thing : list) {
            accum += thing;
        }
        return accum;
    }
    
    public static double average(ArrayList<Integer> list) {
        // write code here
        int counter = 0;
        for (int thing : list) {
            counter += 1;
        }
        return 1.0 * sum(list)/counter;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + average(list));
    }
}
