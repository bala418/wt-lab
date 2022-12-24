import java.util.*;

public class q1 {

    abstract static class ProductFn {

        int price;
        int quantity;
        String name;

        ProductFn(int price, int quantity, String name) {
            this.price = price;
            this.quantity = quantity;
            this.name = name;
        }

        abstract void display();
    }

    static class Product extends ProductFn {

        Product(int price, int quantity, String name) {
            super(price, quantity, name);
        }

        void display() {
            System.out.println("Product: " + this.name + " Price: " + this.price + " Quantity: " + this.quantity);
        }

    }

    static class NotPaidFullAmoutException extends Exception {
        public NotPaidFullAmoutException(String s) {
            super(s);
        }
    }

    static class NoSufficientChangeException extends Exception {
        public NoSufficientChangeException(String s) {
            super(s);
        }
    }

    static class SoldOutException extends Exception {
        public SoldOutException(String s) {
            super(s);
        }
    }

    interface VendingMachineFn {

        void selectProduct(int choice);

        void insertCoin(int coin);

        void refund();

        void reset();

    }

    static class VendingMachine implements VendingMachineFn {

        int total;
        int[] coins = { 1, 5, 10, 25, 50 };
        int[] coinCount = { 0, 0, 0, 0, 0 };

        Product[] products = new Product[4];

        VendingMachine() {
            products[0] = new Product(10, 10, "Chocolate");
            products[1] = new Product(25, 10, "Snack");
            products[2] = new Product(50, 10, "Nuts");
            products[3] = new Product(20, 10, "Juice");
        }

        public void insertCoin(int coin) {
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

        public void selectProduct(int choice) {
            try {
                if (total < products[choice].price) {
                    throw new NotPaidFullAmoutException("Not paid full amount");
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
            } catch (NotPaidFullAmoutException e) {
                System.out.println(e.getMessage());
            } catch (SoldOutException e) {
                System.out.println(e.getMessage());
            } catch (NoSufficientChangeException e) {
                System.out.println(e.getMessage());
            }
        }

        public void refund() {
            System.out.println("Refund: " + total);
            total = 0;
        }

        public void reset() {
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