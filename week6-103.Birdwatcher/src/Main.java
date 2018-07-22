import java.util.Scanner;

public class Main {  

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        BirdBase birds = new BirdBase();
    
        while (true) {
            System.out.println("?");
            String userInput = reader.nextLine();
            if (userInput.equals("Add")) {
                System.out.println("Name: ");
                String birdName = reader.nextLine();
                System.out.println("Latin Name: ");
                String latinName = reader.nextLine();
                Bird raven = new Bird(birdName, latinName);
                birds.addBird(raven);
            } else if (userInput.equals("Observation")) {
                System.out.println("What was observed:?");
                String birdName = reader.nextLine();
                if (birds.isBird(birdName)) {
                    birds.search(birdName).observe();
                } else {
                    System.out.println("Is not a bird!");
                }
            } else if (userInput.equals("Statistics")) {
                System.out.println(birds.allEntries());
            } else if (userInput.equals("Show")) {
                System.out.println("What?");
                String birdName = reader.nextLine();
                System.out.println(birds.entry(birds.search(birdName)));
            } else if (userInput.equals("Quit")) {
                break;
            }     
        }
    }
}
