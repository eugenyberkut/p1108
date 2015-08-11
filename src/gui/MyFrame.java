package gui;

import logic.Book;
import logic.CollectionDemo;
import logic.Main;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Yevhen on 11.08.2015.
 */
public class MyFrame extends JFrame{
    Main main;
    CollectionDemo demo;
    public MyFrame(String title) throws HeadlessException {
        super(title);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(500, 400));
        JButton button1 = new JButton("Список книг");
        button1.addActionListener(e -> main.printBooks());
        JButton button2 = new JButton("Список книг по алфавиту");
        button2.addActionListener(e -> main.printBooksSorted());
        JPanel bottomPanel = new JPanel();
        bottomPanel.add(button1);
        bottomPanel.add(button2);

        JButton button3 = new JButton("Коллекции");
        bottomPanel.add(button3);
        button3.addActionListener(e -> {
            demo.addBook(new Book("Неизвестный", 100, 50, "Первая"));
            demo.addBook(new Book("Неизвестный", 100, 50, "Вторая"));
            demo.addBook(new Book("Неизвестный", 100, 50, "Третья"));
            demo.addBook(new Book("Неизвестный", 100, 50, "Четвертая"));
            demo.printBooks();
        });
        getContentPane().add(bottomPanel, BorderLayout.SOUTH);
        pack();
        main = new Main();
        demo = new CollectionDemo();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MyFrame myFrame = new MyFrame("Hello");
            myFrame.setVisible(true);
        });
    }
}
