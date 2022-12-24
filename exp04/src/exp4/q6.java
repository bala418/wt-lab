package exp4;

public class q6 {
    public static void main(String[] args) {
        String s = "Bala";
        System.out.println("Length of string is: " + s.length());
        char b = s.charAt(0);
        System.out.println("1st character is: " + b);

        // find no of occurences of b in s
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == b) {
                count++;
            }
        }
        System.out.println("No of occurences of " + b + " in " + s + " is: " + count);

    }
}
