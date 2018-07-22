import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        if (name.length() >= 3) {
            System.out.println("1. character: " + firstChar(name));
            System.out.println("2. character: " + secondChar(name));
            System.out.println("3. character: "+ thirdChar(name));
        }
    }
    public static char firstChar(String text) {
        return text.charAt(0);
    }
    public static char secondChar(String text) {
        return text.charAt(1);
    }
    public static char thirdChar(String text) {
        return text.charAt(2);
    }
}
