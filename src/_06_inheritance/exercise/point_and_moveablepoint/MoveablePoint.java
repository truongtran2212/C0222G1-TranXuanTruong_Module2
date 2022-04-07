package _06_inheritance.exercise.point_and_moveablepoint;

import java.util.Arrays;

public class MoveablePoint extends Point {
    private float xSpeed;
    private float ySpeed;



    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setXSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return new float[]{this.xSpeed, this.ySpeed};
    }

    public MoveablePoint move() {
         super.setX(this.getX() + xSpeed) ;
        super.setY(this.getY() + ySpeed) ;
        return this;

    }

    @Override
    public String toString() {
        return Arrays.toString(getXY()) + " ,speed = " + Arrays.toString(getSpeed());
    }
}
