package logic;

import java.util.Arrays;

/**
 * Created by Yevhen on 11.08.2015.
 */
public class Main {
    private Book[] books;

    public Main(Book[] books) {
        this.books = books;
    }

    public Main() {
        Book b1 = new Book("Джонатан Свифт", 320, 95.99, "Гулливер");
        Book b2 = new Book("Джордж Оруэлл", 279, 134.00, "1984");
        Book b3 = new Book("Джером Сэлинджер", 478, 154.50, "Над пропастью во ржи");
        Book b4 = new Book("Пауло Коэльо", 220, 45.29, "Алхимик");
        Book b5 = new Book("Виктор Пелевин", 416, 75.00, "t");
        Book b6 = new Book("Пауло Коэльо", 220, 45.29, "Алхимик 2");
        books = new Book[]{b1, b2, b3, b4, b5, b6};
    }

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {

//        System.out.println(Arrays.toString(books));
        Arrays.sort(books);
        print(books);
    }

    private void print(Book[] books) {
        for (Book book : books) {
            System.out.println(book.getAuthor() + " " + book.getBookname());
        }
    }

    public Book[] getBooks() {
        return books;
    }

    public void printBooks() {
        for (Book book : books) {
            System.out.println(book.getAuthor() + " " + book.getBookname());
        }
    }

    public void printBooksSorted() {
        Arrays.sort(books);
        printBooks();
    }
}
