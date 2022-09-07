package ru.mirea.practice_2;
import java.lang.*;
public class TestAuthor {
    public static void main(String[] args) {
        Author author1 = new Author("Ivan Popov","ivPopov@somewhere.com",'M');
        Author author2 = new Author("Anna Ivanova","anIvanova@somewhere.com",'F');
        System.out.println(author1);
        author1.setEmail("IVIVPopoV@gmail.com");
        System.out.println(author1);
    }
}
