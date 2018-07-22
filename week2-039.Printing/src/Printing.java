public class Printing {

    public static void printStars(int amount) {
        // 39.1
        // you can print one star with the command
        // System.out.print("*");
        // call this command amount times
        int c = 0;
        while (c < amount) {
            System.out.print("*");
            c += 1;
        }
        System.out.print("\n");
    }

    public static void printSquare(int sideSize) {
        // 39.2
        int n = 0;
        while (n < sideSize) {
            printStars(sideSize);
            n += 1;
        }
    }

    public static void printRectangle(int width, int height) {
        // 39.3
        int m = 0;
        while (m < height){
            printStars(width);
            m += 1;
        }
    }

    public static void printTriangle(int size) {
        // 39.4
        int d = 0;
        int e = 1;
        while (d < size) {
            printStars(e);
            e += 1;
            d += 1;
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct

        printStars(3);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

}
