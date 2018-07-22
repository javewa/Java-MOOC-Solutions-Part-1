
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write testcode here
        int[] original = {1, 2, 3, 4};
        int[] reverse = reverseCopy(original);

        // print both
        System.out.println( "original: " +Arrays.toString(original));
        System.out.println( "reversed: " +Arrays.toString(reverse));
    }
    
    public static int[] copy(int[] array) {
        int[] copyArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copyArray[i] = array[i];
        }
        return copyArray;
    }
    
    public static int[] reverseCopy(int[] array) {
        int[] reverseArray = new int[array.length];
        int c = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            reverseArray[c] = array[i];
            c++;
        }
        return reverseArray;
    }
    
}
