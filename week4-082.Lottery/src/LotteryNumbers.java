import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Write the number drawing here using the method containsNumber()
        Random random = new Random();
        int c = 0;
        int d;
        while (c < 7) {
            d = (random.nextInt(39)) + 1;
            if (!this.numbers.contains(d)) {
                this.numbers.add(d);
                c += 1;
            }
        }
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        boolean c = false;
        if (this.numbers.contains(number)){
            c = true;
        }
        return c;
    }
}
