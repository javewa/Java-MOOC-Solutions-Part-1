import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int end = Integer.parseInt(reader.nextLine());
        int fact = 1;
        int num = 1;
        while (num <= end) {
            fact *= num;
            num += 1;
        }
        System.out.println("Factorial is " + fact);
    }
}
