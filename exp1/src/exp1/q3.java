package exp1;

public class q3 {

    // check for palindrome
    public static boolean isPalindrome(int n) {
        int temp = n;
        int rev = 0;
        while (temp != 0) {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp /= 10;
        }
        if (rev == n) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int num1 = 121;
        int num2 = 123;
        if (isPalindrome(num1)) {
            System.out.println(num1 + " is a palindrome");
        } else {
            System.out.println(num1 + " is not a palindrome");
        }
        if (isPalindrome(num2)) {
            System.out.println(num2 + " is a palindrome");
        } else {
            System.out.println(num2 + " is not a palindrome");
        }
    }
}
