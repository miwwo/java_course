package ru.mirea.practice_1;

public class Ball {
    private String colour;
    private double weight;

    public Ball(String c, double w){
        colour = c;
        weight = w;
    }
    public Ball(){
        colour = "None";
        weight = 0;
    }

    public void setColour(String c){
        this.colour = c;
    }
    public void setWeight(double w){
        this.weight = w;
    }

    public String getColour() {
        return this.colour;
    }

    public double getWeight() {
        return this.weight;
    }
    public String toString(){
        return "Ball's colour is "+this.colour+", weight is "+this.weight;
    }
}
