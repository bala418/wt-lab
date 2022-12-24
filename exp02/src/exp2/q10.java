package exp2;

import java.util.Scanner;

public class q10 {
    static class Book {
        String name;
        String author;
        int price;
        int pages;

        Book(String name, String author, int price, int pages) {
            this.name = name;
            this.author = author;
            this.price = price;
            this.pages = pages;
        }

        void display() {
            System.out.println("Name: " + this.name);
            System.out.println("Author: " + author);
            System.out.println("Price: " + price);
            System.out.println("Pages: " + pages);
        }
    }

    static Book[] books = new Book[10];
    static int count = 0;

    public void insertBook() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name, author, price and pages: ");
        String name = sc.nextLine();
        String author = sc.nextLine();
        int price = sc.nextInt();
        int pages = sc.nextInt();
        books[count] = new Book(name, author, price, pages);
        count++;
    }

    static void deleteBook() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of book to delete: ");
        String name = sc.nextLine();
        for (int i = 0; i < count; i++) {
            if (books[i].name.equals(name)) {
                for (int j = i; j < count - 1; j++) {
                    books[j] = books[j + 1];
                }
                // 1 2 3 4 5 6
                // 1 2 4 4 5 6
                // 1 2 4 5 5 6
                // 1 2 4 5 6 6
                count--;
                // 1 2 4 5 6

                break;
            }
        }
    }

    static void displayBooks() {
        for (int i = 0; i < count; i++) {
            books[i].display();
        }
    }

    public static void main(String[] args) {
        q10 q = new q10();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Insert book");
            System.out.println("2. Delete book");
            System.out.println("3. Display all books");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    q.insertBook();
                    break;
                case 2:
                    deleteBook();
                    break;
                case 3:
                    displayBooks();
                    break;
                case 4:
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
