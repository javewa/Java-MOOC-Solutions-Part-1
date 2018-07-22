public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int c = 0;
        while (c < amount) {
            System.out.print("*");
            c += 1;
        }
        System.out.print("\n");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        int d = 0;
        while (d < amount) {
            System.out.print(" ");
            d += 1;
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        int n = 1;
        while (n <= size) {
            printWhitespaces(size - n);
            printStars(n);
            n += 1;
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int c = 1;
        int d = 1;
        int n = height - 1;
        while (d <= height) {
            printWhitespaces(n);
            printStars(c);
            c += 2;
            d += 1;
            n -= 1; 
        }
        printWhitespaces(height-2);
        printStars(3);
        printWhitespaces(height-2);
        printStars(3);
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
