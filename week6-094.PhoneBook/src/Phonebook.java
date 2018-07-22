/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nacht
 */
import java.util.ArrayList;

public class Phonebook {
    
    private ArrayList<Person> phoneBook = new ArrayList<Person>();
    
    public Phonebook() {
        this.phoneBook = phoneBook;
    }
    
    public void add(String name, String number) {
        Person newPerson = new Person(name, number);
        phoneBook.add(newPerson);
    }
    
    public void printAll() {
        for (Person persons : phoneBook) {
            System.out.println(persons);;
        }
    }
    
    public String searchNumber(String name) {
        boolean contains = false;
        String returned = "";
        for (Person persons : phoneBook) {
            if (persons.getName().equals(name)) {
                returned = persons.getNumber();
                contains = true;
            }
        }
        
        if (contains == false) {
            returned = "number not known";
        }
        
        return returned;
    }
    
}
