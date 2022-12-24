package exp3;

/**
*
* @author student
*/

import java.util.Scanner;

public class q6 {

    // date class
    static class DateClass {

        int day, month, year;

        DateClass(int d, int m, int y) {
            day = d;
            month = m;
            year = y;
        }

        void print() {
            System.out.println(day + "/" + month + "/" + year);
        }
    }

    static class Employee {
        String name;
        double salary;
        DateClass date;
    }

    static void print(Employee[] employees) {
        for (int i = 0; i < 2; i++) {
            System.out.println("Name: " + employees[i].name);
            System.out.println("Salary: " + employees[i].salary);
            System.out.println("Date of joining: ");
            employees[i].date.print();
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Employee[] employees = new Employee[10];
        Scanner sc = new Scanner(System.in);
        int year, month, day;
        for (int i = 0; i < 2; i++) {
            employees[i] = new Employee();
            System.out.println("Enter name");
            employees[i].name = sc.nextLine();
            System.out.println("Enter salary");
            employees[i].salary = sc.nextDouble();
            System.out.println("Enter date of joining");
            year = sc.nextInt();
            month = sc.nextInt();
            day = sc.nextInt();
            employees[i].date = new DateClass(day, month, year);
            sc.nextLine();

        }
        print(employees);

    }

}