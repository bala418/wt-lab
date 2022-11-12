package exp11;

import java.util.*;

class Thread1 extends Thread {
    PC obj;

    Thread1(PC obj) {
        this.obj = obj;
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++)
                obj.addstock(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Thread2 extends Thread {
    PC obj;

    Thread2(PC obj) {
        this.obj = obj;
    }

    public void run() {
        try {
            while (obj.st.size() != 0)
                obj.getstock();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ProducerConsumer {
    public static void main(String[] args) throws InterruptedException {
        final PC pc = new PC();
        Thread1 t1 = new Thread1(pc);
        Thread2 t2 = new Thread2(pc);

        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}

class PC {
    Stack<Integer> st = new Stack<Integer>();

    public void addstock(int num) throws InterruptedException {
        synchronized (this) {
            if (st.size() > 3)
                wait();
            st.push(num);
            System.out.println("Stock added: " + num);
        }
    }

    public void getstock() throws InterruptedException {
        Thread.sleep(1000);
        if (st.size() == 0)
            wait();
        Scanner s = new Scanner(System.in);
        synchronized (this) {
            System.out.println("Stock consumed: " + st.pop());
            notify();
            // Thread.sleep(2000);
        }
    }
}