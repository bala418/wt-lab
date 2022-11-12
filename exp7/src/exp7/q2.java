import java.util.*;

public class q2 {
    static class EMI {
        int amount;
        int rate;
        int time;
        double emi;

        EMI(int amount, int rate, int time) {
            this.amount = amount;
            this.rate = rate;
            this.time = time;
        }

        void calculate() {
            double emi;
            int n;
            n = 12 * time;
            emi = (amount * rate * Math.pow(1 + rate, n)) / (Math.pow(1 + rate, n) - 1);
            System.out.println("EMI is: " + emi);
        }
    }

    static class NoBalanceException extends Exception {
        public NoBalanceException(String s) {
            super(s);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EMI e = new EMI(100000, 13, 3);

        System.out.println("Enter the balance: ");
        int balance = sc.nextInt();
        e.calculate();

        if (balance < (e.emi * 3 * 12)) {
            try {
                throw new NoBalanceException("Balance is not enough to pay the EMI for 3 years");
            } catch (NoBalanceException nbe) {
                System.out.println(nbe.getMessage());
            }
        } else {
            System.out.println("EMI can be paid");
        }

    }
}