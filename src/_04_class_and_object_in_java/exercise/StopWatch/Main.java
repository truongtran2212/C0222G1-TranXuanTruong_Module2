package _04_class_and_object_in_java.exercise.StopWatch;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        System.out.println("Thời gian bắt đầu");
        System.out.println(stopWatch.getStartTime());

        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.floor(Math.random() * 100000);
        }

        for (int i = 0; i < array.length; i++) {
            int max = array[i];
            for (int j = i; j < array.length - i; j++) {
                if (array[j] > max) {
                    max = array[j];
                    array[j] = array[i];
                    array[i] = max;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        stopWatch.stop();
        System.out.println("Thời gian kết thúc");
        System.out.println(stopWatch.getEndTime());
        System.out.println("Thời gian đồng hồ chạy là: " + stopWatch.getElapsedTime() + " ms.");


    }
}
