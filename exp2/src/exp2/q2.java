/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exp2;

/**
 *
 * @author bala9
 */
public class q2 {

    public static void main(String[] args) {
        // reverse number passed as command line argument
        int num = Integer.parseInt(args[0]);
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        System.out.println("Reverse of the number is: " + rev);

    }

}
