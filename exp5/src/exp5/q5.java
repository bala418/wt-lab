import java.util.ArrayList;

public class q5 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        System.out.println("Adding 1, 2, 3: " + arr);
        arr.remove(1);
        System.out.println("Removing index 1: " + arr);
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        arr2.add(4);
        arr2.add(5);
        arr2.add(6);
        arr.addAll(arr2);
        System.out.println("After Adding all elements of arr2: " + arr);
        arr.removeAll(arr2);
        System.out.println("After removing all of arr2: " + arr);
        System.out.println("Does arr contain 1? " + arr.contains(1));
        System.out.println("Size of arr: " + arr.size());
        System.out.println("Element at index 0: " + arr.get(0));
    }
}
