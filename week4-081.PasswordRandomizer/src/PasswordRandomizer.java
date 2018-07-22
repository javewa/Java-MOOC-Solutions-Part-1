import java.util.Random;
import java.util.ArrayList;

public class PasswordRandomizer {
    // Define the variables
    private int length;
    private Random random;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
        random = new Random();
    }

    public String createPassword() {
        // write code that returns a randomized password        
        int c = this.length;
        String pass = "";
        while (c > 0) {   
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(random.nextInt(26));
            pass += symbol;
            c -= 1;
        }
        return pass;
    }
}
