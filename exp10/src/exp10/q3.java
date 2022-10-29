package exp10;

// . First thread generates random integer every 1 second and if the value is even,
// second thread computes the square of the number and prints. If the value is odd, the
// thread will print the value of the number

public class q3 {

    static class SquareThread extends Thread {
        int number;

        SquareThread(int randomNumbern) {
            number = randomNumbern;
        }

        public void run() {
            System.out.println("Square of " + number + " = " + (number * number));
        }
    }

    static class PrintThread extends Thread {
        int number;

        PrintThread(int randomNumber) {
            number = randomNumber;
        }

        public void run() {
            System.out.println("Number = " + number);
        }
    }

    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    int randomNumber = (int) (Math.random() * 100);
                    System.out.println("Random Number: " + randomNumber);
                    if (randomNumber % 2 == 0) {
                        new SquareThread(randomNumber).start();
                    } else {
                        new PrintThread(randomNumber).start();
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        t1.start();

    }

}
