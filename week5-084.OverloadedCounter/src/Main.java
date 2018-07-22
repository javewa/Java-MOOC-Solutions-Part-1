public class Main {
    public static void main(String[] args) {
        // write testcode here
        Counter myCounter = new Counter(25, true);
        myCounter.increase();
        myCounter.increase(6);
        System.out.println(myCounter.value());
    }
}
