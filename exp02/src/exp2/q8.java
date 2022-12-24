package exp2;

import java.util.Scanner;

public class q8 {
    static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n and r: ");
        int n = sc.nextInt();
        int r = sc.nextInt();
        int nCr = factorial(n) / (factorial(r) * factorial(n - r));
        System.out.println("nCr: " + nCr);

        int nPr = factorial(n) / factorial(n - r);
        System.out.println("nPr: " + nPr);

        sc.close();
    }
}
