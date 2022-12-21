package exp1;

public class q2 {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        // check prime till square root of n
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int x = 7;
        int y = 9;
        
        if (isPrime(x)) {
            System.out.println(x + " is a prime number");
        } else {
            System.out.println(x + " is not a prime number");
        }
        if (isPrime(y)) {
            System.out.println(y + " is a prime number");
        } else {
            System.out.println(y + " is not a prime number");
        }

    }
}
