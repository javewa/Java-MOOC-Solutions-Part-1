
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        int num = 0;
        while (num < name.length()) {
            System.out.println(num+1 + ". character: " + name.charAt(num));
            num += 1;
        }
    }
}
