package exp3;

/**
 *
 * @author student
 */
public class AddAmount {
    int amount = 500;

    AddAmount() {
        System.out.println("No amount added");
    }

    AddAmount(int x) {
        amount += x;
        System.out.println("New Amount = " + amount);
    }

    public static void main(String args[]) {
        System.out.println("Using default constructor");
        AddAmount x = new AddAmount();
        System.out.println("Using parameterized constructor");
        AddAmount y = new AddAmount(20);

    }

}