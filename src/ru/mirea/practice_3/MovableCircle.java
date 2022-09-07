package ru.mirea.practice_3;

public class MovableCircle  implements  Movable{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius)
    {
        this.center.x = x;
        this.center.y = y;
        this.center.xSpeed = xSpeed;
        this.center.ySpeed = ySpeed;
        this.radius = radius;
    }
    public void moveUp()
    {
        this.center.x = this.center.x + this.center.xSpeed;
    }
    public void moveDown()
    {
        this.center.x-= this.center.xSpeed;
    }
    public void moveLeft()
    {
        this.center.y-=this.center.ySpeed;
    }
    public void moveRight()
    {
        this.center.y+=this.center.ySpeed;
    }
    @Override
    public String toString(){
        return "Circle is at x:"+this.center.x+" , y:"+this.center.y;
    }
}
