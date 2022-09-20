package exp5;

import java.util.*;

public class q7 {
    public static void main(String[] args) {
        // array list of random int
        ArrayList<Integer> arr = new ArrayList<Integer>();
        // add elements
        arr.add(1);
        arr.add(2);
        arr.add(3);
        // print
        System.out.println("Array = " + arr);
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        double avg = 0;
        int highest = arr.get(0);
        int lowest = arr.get(0);
        for (int i : arr) {
            avg += i;
            if (i > highest) {
                highest = i;
            }
            if (i < lowest) {
                lowest = i;
            }

            if (i % 2 == 0) {
                newArr.add(i);
            }
        }
        avg /= arr.size();
        // print avg
        System.out.println("Avg = " + avg);
        // print highest
        System.out.println("Highest = " + highest);
        // print lowest
        System.out.println("Lowest = " + lowest);
        // print even
        System.out.println("Even = " + newArr);

    }
}
