import java.util.Scanner;
public class Palindromi {

    public static String reverse(String text) {
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string
        int i = text.length() - 1;
        String reversed = "";
        while (i >= 0) {
            reversed += text.charAt(i);
            i -= 1;
        }
        return reversed;
    }
    
    public static boolean palindrome(String text) {
        // write code here
        boolean c = false;
        if (text.equals(reverse(text))) {
            c = true;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
