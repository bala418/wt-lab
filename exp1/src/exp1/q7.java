package exp1;

public class q7 {
    String name;
    int rollNo;
    int marks;

    q7() {
        System.out.println("Student Details");
    }

    void set(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    void studentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
        System.out.println();
    }

    public static void main(String[] args) {
        q7 x = new q7();
        q7 y = new q7();
        x.set("John", 1, 90);
        y.set("Mary", 2, 95);
        x.studentDetails();
        y.studentDetails();

    }
}
