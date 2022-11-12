package exp10;

import java.lang.Thread;

public class q2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("Hello");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("Wear Mask");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("Use Sanitizer");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("Wash Hands");
                    try {
                        Thread.sleep(7000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread t5 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("Maintain Social Distancing");
                    try {
                        Thread.sleep(9000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        t1.setPriority(1);
        t2.setPriority(2);
        t3.setPriority(3);
        t4.setPriority(4);
        t5.setPriority(5);

        t4.start();
        t5.start();

        try {
            t5.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            t4.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // check if thread is alive
        System.out.println("Thread 1 is alive: " + t1.isAlive());
        System.out.println("Thread 2 is alive: " + t2.isAlive());
        System.out.println("Thread 3 is alive: " + t3.isAlive());
        System.out.println("Thread 4 is alive: " + t4.isAlive());
        System.out.println("Thread 5 is alive: " + t5.isAlive());

    }
}
