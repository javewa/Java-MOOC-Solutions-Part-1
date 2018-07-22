
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        System.out.println("First: ");
        int num = Integer.parseInt(reader.nextLine());
        System.out.println("Last: ");
        int end = Integer.parseInt(reader.nextLine());
        while (num <= end){
            sum += num;
            num += 1;
        }
        System.out.println("Sum is " + sum);
    }
}
