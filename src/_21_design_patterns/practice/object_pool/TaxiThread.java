package _21_design_patterns.practice.object_pool;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class TaxiThread implements Runnable {
    public TaxiThread(TaxiPool taxiPool) {
    }

    @Override
    public void run() {

    }
    private void takeATaxi() {
        try {
            System.out.println("New Client" + Thread.currentThread().getName());
            TaxiPool taxiPool = null;
            Taxi taxi = taxiPool.getTaxi();
            TimeUnit.MICROSECONDS.sleep(randInt(1000, 1500));
            taxiPool.release(taxi);
            System.out.println("Served the client: " + Thread.currentThread().getName());
        } catch (InterruptedException | TaxiNotFoundException e) {
            System.out.println(">>>Rejected the client: " + Thread.currentThread().getName());
        }
    }

    private int randInt(int min, int max) {
        return new Random().nextInt((max - min) + 1) + min;
    }
}
