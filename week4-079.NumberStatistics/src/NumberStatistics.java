
public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;
    
    public NumberStatistics() {
        this.amountOfNumbers = 0;
        this.sum = 0;
        
    }
    
    public void addNumber(int number) {
        this.amountOfNumbers += 1;
        this.sum += number;
    }
    
    public int amountOfNumbers() {
        return this.amountOfNumbers;
    }
    
    public int sum() {
        return this.sum;
    }
    
    public double average() {
        double avg;
        if (this.amountOfNumbers > 0) {
            avg = 1.0 * this.sum/this.amountOfNumbers;
        } else {
            avg = 0;
        }
        return avg;
    }
}
