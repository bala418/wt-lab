import java.util.*;

public class q7 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
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
        System.out.println("Avg = " + avg);
        System.out.println("Highest = " + highest);
        System.out.println("Lowest = " + lowest);
        System.out.println("Even = " + newArr);

    }
}
