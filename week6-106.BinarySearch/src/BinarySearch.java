public class BinarySearch {
    public static boolean search(int[] array, int searchedValue) {
        int beginning = 0;
        int end = array.length - 1;
        boolean c = false;
        
        while (beginning <= end) {
            int middle = (beginning + end) / 2;  //3 5
            if (array[middle] == searchedValue) { // 4 < 8  8
                c = true;
                break;
            } else if (array[middle] > searchedValue) {
                end = middle - 1;
            } else {
                beginning = middle + 1; // 5
            }
        }    // restrict the search area
        return c;
    }
}
