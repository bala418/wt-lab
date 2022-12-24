package exp4;

// import Scanner
import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("John ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        s.append(sc.nextLine());
        System.out.println("String is: " + s);
        // check the capacity of the string
        System.out.println("Capacity of string is: " + s.capacity());

        // convert to upper case
        System.out.println("Upper case string is: " + s.toString().toUpperCase());
        // convert to lower case
        System.out.println("Lower case string is: " + s.toString().toLowerCase());
        // reverse the string
        System.out.println("Reversed string is: " + s.reverse());

        StringBuilder s1 = new StringBuilder("Brock ");
        System.out.print("Enter a string: ");

        s1.append(sc.nextLine());

        System.out.println("String is: " + s1);
        // check the capacity of the string
        System.out.println("Capacity of string is: " + s1.capacity());

        // convert to upper case
        System.out.println("Upper case string is: " + s1.toString().toUpperCase());
        // convert to lower case
        System.out.println("Lower case string is: " + s1.toString().toLowerCase());

        // reverse the string
        System.out.println("Reversed string is: " + s1.reverse());

        sc.close();
    }
}
