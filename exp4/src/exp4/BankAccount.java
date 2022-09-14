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
public class BankAccount {
    int id;
    String name;
    int amount;

    void credit(int amount) {
        this.amount += amount;
    }

    void debit(int amount) {
        if (this.amount < amount) {
            System.out.println("Amount withdrawn exceeds the current balance!");
        } else {
            this.amount -= amount;
        }
    }

    void display() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Amount: " + amount);
        System.out.println();
    }

    public static void main(String[] args) {
        BankAccount x = new BankAccount();
        System.out.println("Account details of x:");
        x.id = 1;
        x.name = "John";
        x.amount = 1000;
        x.display();

        System.out.println("After credit of 200:");
        x.credit(200);
        x.display();
        
        System.out.println("After debit of 40:");
        x.debit(40);
        x.display();
    }
}
