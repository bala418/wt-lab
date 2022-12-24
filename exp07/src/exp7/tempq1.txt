// Develop a Java Console application to design a Vending Machine which follows following
// requirements
// 1. Accepts coins of ₹1, ₹5, ₹10, ₹25, ₹50
// 2. Allows user to select products (Chocolate(10), Snack(25), Nuts(50),
// Juice(20))
// 3. Allow user to take refund by cancelling the request
// 4. Return selected product and remaining change, if any
// 5. Allow reset operation for vending machine supplier
// Use Interface, Inheritance, Constructor, abstract class, polymorphism, exception
// (Unchecked Exception, checked Exception, Custom Exception 
// (NotPaidFullAmoutException, NoSufficientChangeException, SoldOutException))
// concepts and also use static, final and this keyword wherever applicable to design a java 
// application. 

import java.util.*;

class NotPaidFullAmountException extends Exception {
    public NotPaidFullAmountException(String s) {
        super(s);
    }
}

class NoSufficientChangeException extends Exception {
    public NoSufficientChangeException(String s) {
        super(s);
    }
}

class SoldOutException extends Exception {
    public SoldOutException(String s) {
        super(s);
    }
}

abstract class Product {
    int price;
    int quantity;
    String name;

    Product(int price, int quantity, String name) {
        this.price = price;
        this.quantity = quantity;
        this.name = name;
    }

    abstract void display();
}

class Chocolate extends Product {
    Chocolate(int price, int quantity, String name) {
        super(price, quantity, name);
    }

    void display() {
        System.out.println("Chocolate: " + this.name + " Price: " + this.price + " Quantity: " + this.quantity);
    }
}

class Snack extends Product {
    Snack(int price, int quantity, String name) {
        super(price, quantity, name);
    }

    void display() {
        System.out.println("Snack: " + this.name + " Price: " + this.price + " Quantity: " + this.quantity);
    }
}

class Nuts extends Product {
    Nuts(int price, int quantity, String name) {
        super(price, quantity, name);
    }

    void display() {
        System.out.println("Nuts: " + this.name + " Price: " + this.price + " Quantity: " + this.quantity);
    }
}

class Juice extends Product {
    Juice(int price, int quantity, String name) {
        super(price, quantity, name);
    }

    void display() {
        System.out.println("Juice: " + this.name + " Price: " + this.price + " Quantity: " + this.quantity);
    }
}

class VendingMachine {
    int total;
    int[] coins = { 1, 5, 10, 25, 50 };
    int[] coinCount = { 0, 0, 0, 0, 0 };

    Product[] products = new Product[4];

    VendingMachine() {
        products[0] = new Chocolate(10, 10, "Dairy Milk");
        products[1] = new Snack(25, 10, "Lays");
        products[2] = new Nuts(50, 10, "Almonds");
        products[3] = new Juice(20, 10, "Pepsi");
    }

    void insertCoin(int coin) {
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] == coin) {
                coinCount[i]++;
                total += coin;
                System.out.println("Coin inserted: " + coin);
                return;
            }
        }
        System.out.println("Invalid coin");
    }

    void selectProduct(int choice) {
        try {
            if (total < products[choice].price) {
                throw new NotPaidFullAmountException("Not paid full amount");
            }
            if (products[choice].quantity == 0) {
                throw new SoldOutException("Sold out");
            }
            if (total > products[choice].price) {
                int change = total - products[choice].price;
                if (!isChangeAvailable(change)) {
                    throw new NoSufficientChangeException("No sufficient change");
                }
                System.out.println("Product: " + products[choice].name + " Change: " + change);
                products[choice].quantity--;
                total = 0;
                return;
            }
            System.out.println("Product: " + products[choice].name);
            products[choice].quantity--;
            total = 0;
        } catch (NotPaidFullAmountException e) {
            System.out.println(e.getMessage());
        } catch (SoldOutException e) {
            System.out.println(e.getMessage());
        } catch (NoSufficientChangeException e) {
            System.out.println(e.getMessage());
        }
    }

    boolean isChangeAvailable(int change) {
        int[] temp = coinCount.clone();
        for (int i = coins.length - 1; i >= 0; i--) {
            while (change >= coins[i] && temp[i] > 0) {
                change -= coins[i];
                temp[i]--;
            }
        }
        if (change == 0) {
            return true;
        }
        return false;
    }

    void refund() {
        System.out.println("Refund: " + total);
        total = 0;
    }

    void reset() {
        for (int i = 0; i < products.length; i++) {
            products[i].quantity = 10;
        }
        for (int i = 0; i < coinCount.length; i++) {
            coinCount[i] = 0;
        }
        total = 0;
        System.out.println("Reset successful");
    }

    void display() {
        System.out.println("Total: " + total);
        for (int i = 0; i < products.length; i++) {
            products[i].display();
        }
    }

}

public class q1 {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Insert coin");
            System.out.println("2. Select product");
            System.out.println("3. Refund");
            System.out.println("4. Reset");
            System.out.println("5. Display");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter coin: ");
                    int coin = sc.nextInt();
                    vm.insertCoin(coin);
                    break;
                case 2:
                    System.out.print("Enter product number: ");
                    int product = sc.nextInt();
                    vm.selectProduct(product);
                    break;
                case 3:
                    vm.refund();
                    break;
                case 4:
                    vm.reset();
                    break;
                case 5:
                    vm.display();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
