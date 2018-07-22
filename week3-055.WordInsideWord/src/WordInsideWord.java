
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word: ");
        String word = reader.nextLine();
        System.out.println("Type a second word: ");
        String subword = reader.nextLine();
        if (word.indexOf(subword)!= -1) {
            System.out.println("The word '" + subword + "' is found in the word '" + word + "'.");
        } else {
            System.out.println("The word '" + subword + "' is not found in the word '" + word + "'.");
        }
    }
}
