package exp1;

public class q4 {
    public static void main(String[] args) {
        int x = 10;
        // find factorial
        int fact = 1;
        for (int i = 1; i <= x; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + x + " is " + fact);

    }
}
