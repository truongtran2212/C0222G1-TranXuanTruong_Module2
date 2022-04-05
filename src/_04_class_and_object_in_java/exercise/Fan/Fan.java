package _04_class_and_object_in_java.exercise.Fan;

public class Fan {
    protected static final int slow = 1,medium = 2,fast = 3;
   private int speed;
    private boolean on =false;
    private double radius;
    private String color;

    Fan(){
        this.speed = slow;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public String toString(){
        if(!this.on){
            return " Fan is off" + "\n" +"radius is: " + this.radius+"\n" + " Color is " + this.color+ "\n";
        }else{
            return "Fan is on" + "\n" + "speed is: " + this.speed + "\n" + "radius is: " + this.radius+"\n" + " Color is " + this.color+ "\n";
        }
    }

}
