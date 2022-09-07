package ru.mirea.practice_1;
import java.lang.*;
public class TestBall {
    public static void main(String[] args) {
        Ball ball1 = new Ball("Blue",7.0);
        Ball ball2 = new Ball("Red",2.0);
        Ball ball3 = new Ball();

        ball3.setColour("Green");
        ball3.setWeight(14.0);
        System.out.println(ball1);
    }
}
