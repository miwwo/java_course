package ru.mirea.practice_1;
import java.lang.*;
public class TestDogClass {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Nikita",5);
        Dog dog2 = new Dog("Maxxx");
        Dog dog3 = new Dog();
        dog3.setName("Alex");
        dog3.setAge(3);
        System.out.println(dog1);
        dog1.intoHumanAge();

    }
}
