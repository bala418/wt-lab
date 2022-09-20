package exp5;

// array list
import java.util.ArrayList;

public class q5 {
    public static void main(String[] args) {
        // initialize array list while declaring
        ArrayList<Integer> arr = new ArrayList<Integer>();
        // add elements
        arr.add(1);
        arr.add(2);
        arr.add(3);
        System.out.println("Adding 1, 2, 3: " + arr);
        // remove elements
        arr.remove(1);
        System.out.println("Removing index 1: " + arr);
        // add all
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        arr2.add(4);
        arr2.add(5);
        arr2.add(6);
        arr.addAll(arr2);
        System.out.println("After Adding all elements of arr2: " + arr);

        // remove all
        arr.removeAll(arr2);
        System.out.println("After removing all of arr2: " + arr);

        // contains
        System.out.println("Does arr contain 1? " + arr.contains(1));

        // size
        System.out.println("Size of arr: " + arr.size());

        // get
        System.out.println("Element at index 0: " + arr.get(0));

    }
}
