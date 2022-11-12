/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exp1;

public class q1 {
    public static void main(String[] args) {
        int a = 0, b = 1;
        int c;
        System.out.print(a + " " + b + " ");
        int i;
        for (i = 2; i <= 20; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

    }
}
