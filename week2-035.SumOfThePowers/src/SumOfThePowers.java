
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int end = Integer.parseInt(reader.nextLine());
        int num = 1;
        int sum = 1;
        while (num <= end) {
            sum += Math.pow(2, num);
            num += 1;
        }
        System.out.println("The result is " + sum);
    }
}
