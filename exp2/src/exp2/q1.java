package exp2;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        // program to implement a calculator
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        double num1, num2, result = 0;
        System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exit");

        while (choice != 5) {
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            System.out.print("Enter the 2 numbers: ");
            num1 = sc.nextDouble();
            num2 = sc.nextDouble();
            switch (choice) {
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            System.out.println("Result: " + result);

        }

        sc.close();
    }
}
