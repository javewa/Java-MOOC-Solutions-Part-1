
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int guessnum = 0;
        // program your solution here. Do not touch the above lines!
        while (true) {
            System.out.println("Guess a number: ");
            int guess = Integer.parseInt(reader.nextLine());
            guessnum += 1;
            if (guess > numberDrawn) {
                System.out.println("The number is lesser, guesses made: " + guessnum);
            } else if (guess < numberDrawn) {
                System.out.println("The number is greater, guesses made: " + guessnum);
            } else {
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
        }
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
