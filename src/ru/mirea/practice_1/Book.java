package ru.mirea.practice_1;

public class Book {
    private String name;
    private int pages;

    public Book(String name, int p){
        this.name = name;
        pages = p;
    }
    public Book(){
        name = "None";
        pages = 0;
    }

    public void setName(String n){
        this.name = n;
    }
    public void setPages(int p){
        this.pages = p;
    }

    public String getName() {
        return this.name;
    }

    public double getPages() {
        return this.pages;
    }
    public String toString(){
        return "Ball's name is "+this.name+", pages is "+this.pages;
    }
}
