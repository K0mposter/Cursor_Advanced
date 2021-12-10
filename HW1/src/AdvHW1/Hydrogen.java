package AdvHW1;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;


public class Hydrogen implements Runnable {
    CyclicBarrier cyclicBarrier;

    public Hydrogen(CyclicBarrier cyclicBarrier) {
        this.cyclicBarrier = cyclicBarrier;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {

            try {
                System.out.println("H");
                cyclicBarrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        }

    }
}