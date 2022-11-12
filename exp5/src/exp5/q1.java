public class q1 {

    static class member {
        String name;
        int age;
        String phone;
        String address;
        int salary;

        void printSalary() {
            System.out.println("Salary of " + name + " is " + salary);
        }
    }

    static class employee extends member {
        String specialization;
    }

    static class manager extends member {
        String department;
    }

    public static void main(String[] args) {

        employee e = new employee();
        e.name = "John";
        e.age = 20;
        e.phone = "9876543210";
        e.address = "Chennai";
        e.salary = 10000;
        e.specialization = "Java";
        e.printSalary();

        manager m = new manager();
        m.name = "Rima";
        m.age = 32;
        m.phone = "9876543201";
        m.address = "Bangalore";
        m.salary = 50000;
        m.department = "Management";
        m.printSalary();

    }
}
