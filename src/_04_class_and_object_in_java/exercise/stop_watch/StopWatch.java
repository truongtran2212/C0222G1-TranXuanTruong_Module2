package _04_class_and_object_in_java.exercise.stop_watch;

import java.util.Calendar;

public class StopWatch {
    private double startTime;
    private double endTime;

    public StopWatch(double startTime,double endTime) {
            this.startTime = startTime;
            this.endTime = endTime;
    }

    public StopWatch() {

    }

    public double getStartTime() {
        return this.startTime;
    }

    public double getEndTime() {
        return this.endTime;
    }
    public void start(){
         this.startTime = Calendar.getInstance().getTimeInMillis();
    }
    public void stop() {
        this.endTime = Calendar.getInstance().getTimeInMillis();
    }
    public double getElapsedTime() {
        return this.endTime - this.startTime;
    }
}

