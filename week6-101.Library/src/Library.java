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

public class Library {
    
    private ArrayList<Book> library = new ArrayList<Book>();
    
    public Library() {
        this.library = library;
    }
    
    public void addBook(Book newBook) {
        library.add(newBook);
    } 
    
    public void printBooks() {
        for (Book books : library) {
            System.out.println(books);
        }
    }
    
    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> titleList = new ArrayList<Book>();
        for (Book books: library) {
            if (StringUtils.included(books.title(),title)) {
                titleList.add(books);
            }
        }
        return titleList;
    }
    
    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> pubList = new ArrayList<Book>();
        for (Book books: library) {
            if (StringUtils.included(books.publisher(), publisher)) {
                pubList.add(books);
            }
        }
        return pubList;
    }
    
    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> yearList = new ArrayList<Book>();
        for (Book books: library) {
            if (books.year() == year) {
                yearList.add(books);
            }
        }
        return yearList;
    }
    
}
