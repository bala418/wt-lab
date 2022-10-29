package exp10;

public class q4 {
    public static void main(String[] args) {
        // 1st thread prints from a to z

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (char i = 'a'; i <= 'z'; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        // 2nd thread prints from z to a

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (char i = 'z'; i >= 'a'; i--) {
                    System.out.println(i);
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        // t2 starts after t1

        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();

        // app ends when t2 ends

        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
