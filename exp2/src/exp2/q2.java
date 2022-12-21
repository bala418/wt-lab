package exp2;

public class q2 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int rev = 0;
        while (num != 0) {
            // java q2.java 1234 7.4 Bala 
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        System.out.println("Reverse of the number is: " + rev);
    }
}
