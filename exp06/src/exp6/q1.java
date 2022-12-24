public class q1 {
    interface payable {
        double getPaymentAmount();

    }

    static class Employee implements payable {
        String fname;
        String lname;
        String ssn;

        public double getPaymentAmount() {
            return 0;
        }
    }

    static class Invoice implements payable {
        String partNumber;
        String partDescription;
        int quantity;
        double pricePerItem;

        public double getPaymentAmount() {
            return quantity * pricePerItem;
        }
    }

    static class CommissionEmployee extends Employee {
        double grossSales;
        double commissionRate;

        public double getPaymentAmount() {
            return grossSales * commissionRate;
        }

    }

    static class HourlyEmployee extends Employee {
        double wage;
        double hours;

        public double getPaymentAmount() {
            return wage * hours;
        }
    }

    static class WeeklyEmployee extends Employee {
        double salary;

        public double getPaymentAmount() {
            return salary;
        }
    }

    static class BasePlusCommissionEmployee extends CommissionEmployee {
        double baseSalary;

        public double getPaymentAmount() {

            return baseSalary + super.getPaymentAmount();
        }
    }

    static void print(Object o) {
        System.out.println(o);
    }

    public static void main(String[] args) {

        CommissionEmployee ce = new CommissionEmployee();
        BasePlusCommissionEmployee bce = new BasePlusCommissionEmployee();

        ce.fname = "Jane";
        ce.lname = "Doe";
        ce.ssn = "987654321";
        ce.grossSales = 1000;
        ce.commissionRate = 0.1;

        bce.fname = "John";
        bce.lname = "Cena";
        bce.ssn = "123456789";
        bce.grossSales = 1000;
        bce.commissionRate = 0.1;
        bce.baseSalary = 100;

        print("Commission Employee:");
        print("Name: " + ce.fname + " " + ce.lname);
        print("Payment Amount: " + ce.getPaymentAmount());

        print("Base Plus Commission Employee:");
        print("Name: " + bce.fname + " " + bce.lname);
        print("Payment Amount: " + bce.getPaymentAmount());

    }
}
