package ru.mirea.practice_3;
import java.math.*;
public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle()
    {
        this.color = "None";
        this.filled = false;
        this.length = 1;
        this.width = 1;
    };
    public Rectangle(double width, double length)
    {
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled)
    {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }
    public double getWidth()
    {
        return this.width;
    }
    public double getLength()
    {
        return this.length;
    }
    public void setWidth(double width)
    {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea()
    {
      return width*length;
    }
    @Override
    public double getPerimeter()
    {
        return (width*length)/2;
    }
    @Override
    public String toString() {
        return "Shape: rectangle, width: "+this.width+", length: "+ this.length+", color: "+this.color;
    }
}
