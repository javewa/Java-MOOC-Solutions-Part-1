
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int num = 0;
        System.out.println("Until what? ");
        int end = Integer.parseInt(reader.nextLine());
        while (num < end) {
            num += 1;
            sum += num;
        }
        System.out.println("Sum is " + sum);       
    }
}
