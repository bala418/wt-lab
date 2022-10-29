// create 3 threads
package exp10;

public class q1 {
    public static void main(String[] args) {
        // 1 thread every 1 second
        // 2 thread every 3 seconds
        // 3 thread every 5 seconds

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

        t1.start();
        t2.start();
        t3.start();

    }
}
