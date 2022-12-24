package exp3;

/**
 *
 * @author student
 */
public class q5 {

    static void print(int n, char c) {
        System.out.println(n + " : " + c);
    }

    static void print(char c, int n) {
        System.out.println(c + " : " + n);
    }

    public static void main(String args[]) {
        System.out.println("Using int first");
        print(4, 'b');
        System.out.println("Using int second");
        print('c', 12);

    }
}