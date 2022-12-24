import java.io.*;
import java.util.Scanner;

public class q6 {

    static boolean validate_code(String s) {
        if (s.length() != 6) {
            return false;
        }
        if (!s.substring(0, 3).equals("Cod")) {
            return false;
        }
        if (!s.matches(".*\\d.*")) {
            return false;
        }
        if (!Character.isUpperCase(s.charAt(0))) {
            return false;
        }
        if (!s.matches("^[a-zA-Z0-9]+$")) {
            return false;
        }

        return true;
    }

    static void validate(String s) {
        if (validate_code(s)) {
            System.out.println("Valid code");
        } else {
            System.out.println("Invalid code");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

       

    }
}
