package AdvHW1;

import java.util.concurrent.CyclicBarrier;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3);

        new Thread(new Hydrogen(cyclicBarrier)).start();
        new Thread(new Hydrogen(cyclicBarrier)).start();
        new Thread(new Oxygen(cyclicBarrier)).start();
    }
}
