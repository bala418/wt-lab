package exp2;

import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a and b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b && a < 100) {
            System.out.println("a is greater than b and less than 100");
        } else {
            System.out.println("a is not greater than b and less than 100");
        }

        sc.close();
    }
}
