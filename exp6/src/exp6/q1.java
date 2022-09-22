public class q1 {

    // interface payable
    interface payable {
        double getPaymentAmount();
    }

    // employee class
    static class Employee implements payable {
        String fname;
        String lname;
        String ssn;

        public double getPaymentAmount() {
            return 0;
        }
    }

    // invoice class
    static class Invoice implements payable {
        String partNumber;
        String partDescription;
        int quantity;
        double pricePerItem;

        public double getPaymentAmount() {
            return quantity * pricePerItem;
        }
    }

    // commission employee class
    static class CommissionEmployee extends Employee {
        double grossSales;
        double commissionRate;

        public double getPaymentAmount() {
            return grossSales * commissionRate;
        }

    }

    // hourly employee class
    static class HourlyEmployee extends Employee {
        double wage;
        double hours;

        public double getPaymentAmount() {
            return wage * hours;
        }
    }

    // weekly employee class
    static class WeeklyEmployee extends Employee {
        double salary;

        public double getPaymentAmount() {
            return salary;
        }
    }

    // base plus commission employee class
    static class BasePlusCommissionEmployee extends CommissionEmployee {
        double baseSalary;

        public double getPaymentAmount() {
            return baseSalary + super.getPaymentAmount();
        }
    }

    public static void main(String[] args) {

        // create objects
        CommissionEmployee ce = new CommissionEmployee();
        BasePlusCommissionEmployee bce = new BasePlusCommissionEmployee();

        // set values

        ce.fname = "Jane";
        ce.lname = "Doe";
        ce.ssn = "987654321";
        ce.grossSales = 1000;
        ce.commissionRate = 0.1;

        bce.fname = "John";
        bce.lname = "Doe";
        bce.ssn = "123456789";
        bce.grossSales = 1000;
        bce.commissionRate = 0.1;
        bce.baseSalary = 100;

        // print values
        System.out.println("Commission Employee");
        System.out.println("Name: " + ce.fname + " " + ce.lname);
        System.out.println("Payment Amount: " + ce.getPaymentAmount());

        System.out.println("Base Plus Commission Employee");
        System.out.println("Name: " + bce.fname + " " + bce.lname);
        System.out.println("Payment Amount: " + bce.getPaymentAmount());

    }
}
