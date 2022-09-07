package ru.mirea.practice_1;
import java.lang.*;
public class TestBook {
    public static void main(String[] args) {
        Book book1 = new Book("mewo", 547);
        Book book2 = new Book("Voina i Mir", 283);
        Book book3 = new Book();

        book3.setName("Anna Korenina");
        book3.setPages(183);
        System.out.println(book1);
    }
}
