import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int numofnum = 0;
        int even = 0;
        int odd = 0;
        System.out.println("Type numbers: ");
        while (true) {
            int num = Integer.parseInt(reader.nextLine());
            if (num == -1) {
                System.out.println("Thank you and see you later!\nThe sum is " + sum);
                System.out.println("How many numbers: " + numofnum);
                System.out.println("Average: " + 1.0*sum/numofnum);
                System.out.println("Even numbers: " + even);
                System.out.println("Odd numbers " + odd);
                break;
            } else {
               sum += num;
               numofnum += 1;
               if (num % 2 == 0) {
                   even += 1;
               } else {
                   odd += 1;
               }
            }
        }
    }
}
