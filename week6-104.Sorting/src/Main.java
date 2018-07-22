import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // write testcode here
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);  
    }
    
    public static int smallest(int[] array) {
        int c = array[0];
        //int[] sorted = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < c) {
                c = array[i];
            }
        }
        
        return c;
    }
    
    public static int indexOfTheSmallest(int[] array) {
        int c = smallest(array);
        int d = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == c) {
                d = i;
            }
        }
        return d;
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int c = array[index];
        //int[] sorted = new int[array.length];
        for (int i = index; i < array.length; i++) {
            if (array[i] < c) {
                c = array[i];
            }
        }
        int d = 0;
        for (int i = index; i < array.length; i++) {
            if (array[i] == c) {
                d = i;
            }
        }
        return d;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int c = index1; //1
        int d = index2; //0
        int a = array[c]; //3
        int b = array[d]; //2
        array[d] = a;
        array[c] = b;
    }
    
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            swap(array,i,indexOfTheSmallestStartingFrom(array, i));
        }
        
    }
}
