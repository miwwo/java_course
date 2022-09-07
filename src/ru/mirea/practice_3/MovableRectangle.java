package ru.mirea.practice_3;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int x2, int y1, int y2, int xSpeed, int ySpeed)
    {
        this.topLeft.x = x1;
        this.topLeft.y = y1;
        this.bottomRight.x = x2;
        this.bottomRight.y = y2;
        this.topLeft.xSpeed = xSpeed;
        this.bottomRight.xSpeed = xSpeed;
        this.topLeft.ySpeed = ySpeed;
        this.bottomRight.ySpeed = ySpeed;

    }
    public void moveUp()
    {
        this.topLeft.x = this.topLeft.x + this.topLeft.xSpeed;
        this.bottomRight.x = this.bottomRight.x + this.bottomRight.xSpeed;
    }
    public void moveDown()
    {
        this.topLeft.x = this.topLeft.x - this.topLeft.xSpeed;
        this.bottomRight.x = this.bottomRight.x - this.bottomRight.xSpeed;
    }
    public void moveLeft()
    {
        this.topLeft.y = this.topLeft.y - this.topLeft.ySpeed;
        this.bottomRight.y = this.bottomRight.y - this.bottomRight.ySpeed;
    }
    public void moveRight()
    {
        this.topLeft.x = this.topLeft.x + this.topLeft.xSpeed;
        this.bottomRight.x = this.bottomRight.x + this.bottomRight.xSpeed;
    }
    @Override
    public String toString(){
        return "this.topLeft point of rectangle is at x: "+this.topLeft.x+", y:"+this.topLeft.y+"; BottomRight point of rectagle is at x: "+this.bottomRight.x+", y:"+this.bottomRight.y;
    }


}
