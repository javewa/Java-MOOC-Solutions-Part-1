
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);
        
        while (true) {
            System.out.println("name: ");
            String name = reader.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.println("student number: ");
            String studentNumber = reader.nextLine();
            Student newStudent = new Student(name, studentNumber);
            list.add(newStudent);
        }
        
        for (Student students : list) {
            System.out.println(students);
        }
        
        System.out.println("Give search term");
        String search = reader.nextLine();
        
        System.out.println("Result:");
        for (Student students : list) {
            String name = students.getName();
            if (name.contains(search)) {
                System.out.println(students);
            }
        }
    }
}
