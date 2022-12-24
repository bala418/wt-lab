/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exp4;

/**
 *
 * @author student
 */

import java.util.Scanner;

public class q1 {
    static int a, b;

    static void add() {
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    static void sub() {
        System.out.println(a + " - " + b + " = " + (a - b));
    }

    static void mul() {
        System.out.println(a + " * " + b + " = " + (a * b));
    }

    static void div() {
        System.out.println(a + " / " + b + " = " + (a / b));
    }

    static void mod() {
        System.out.println(a + " % " + b + " = " + (a % b));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 numbers: ");

        a = sc.nextInt();
        b = sc.nextInt();
        add();
        sub();
        mul();
        div();
        mod();
        sc.close();

    }
}
