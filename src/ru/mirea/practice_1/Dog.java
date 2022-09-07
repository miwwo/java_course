package ru.mirea.practice_1;
import java.lang.*;
public class Dog {
    private String name;
    private int age;

    public Dog(String n, int a){
        name = n;
        age = a;
    }
    public Dog(String n){
        name = n;
        age = 0;
    }
    public Dog(){
        name = "Puppy";
        age = 0;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String toString(){
        return "Dog's name is "+this.name+", age is "+this.age;
    }
    public void intoHumanAge(){
        System.out.println(this.name+"'s age in human years is "+this.age*7+" years");
    }
}
