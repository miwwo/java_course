package ru.mirea.practice_3;
import java.math.*;

public class Square extends Rectangle {
    protected double side;

    public Square()
    {
        this.color = "None";
        this.filled = false;
        this.side = 1;
    };
    public Square(double side)
    {
        this.side = side;
    }
    public Square(double side, String color,boolean filled)
    {
        this.side = side;
        this.color = color;
        this.filled = filled;
    }
    public double getSide()
    {
        return this.side;
    }
    public void setSide(double side)
    {
        this.side = side;
    }
    @Override
    public void setWidth(double side)
    {
        this.width = side;
    }
    @Override
    public void setLength(double side)
    {
        this.length = side;
    }
    @Override
    public String toString() {
        return "Shape: square, side: "+this.side+", color: "+this.color;
    }
}
