package logic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Yevhen on 11.08.2015.
 */
public class CollectionDemo {
    private List<Book> books = new ArrayList<>();
//    private Set<Book> books = new HashSet<>();

    public void addBook(Book b) {
        books.add(b);
    }

    public void printBooks() {
        for (Book book : books) {
            System.out.println(book.getAuthor() + " " + book.getBookname());
        }
    }

    public void printOdds() {
        for (int i = 0; i < books.size(); i++) {
            if (i % 2 != 0) {
                System.out.println(books.get(i));
            }
        }
    }
}
