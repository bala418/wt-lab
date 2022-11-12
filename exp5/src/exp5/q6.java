import java.util.*;

public class q6 {
    public static ArrayList<String> capitalizePlural(ArrayList<String> arr) {
        ArrayList<String> newArr = new ArrayList<String>();
        for (String i : arr) {
            if (i.charAt(i.length() - 1) == 's') {
                i = i.toUpperCase();
            }
            newArr.add(i);
        }
        return newArr;
    }

    public static ArrayList<String> removePlural(ArrayList<String> arr) {
        ArrayList<String> newArr = new ArrayList<String>();
        for (String i : arr) {
            if (i.charAt(i.length() - 1) != 's') {
                newArr.add(i);
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("hello");
        arr.add("world");
        arr.add("rabbits");
        arr.add("cats");
        Collections.reverse(arr);
        System.out.println(arr);
        ArrayList<String> arr2 = arr;
        arr = capitalizePlural(arr);
        System.out.println(arr);
        arr2 = removePlural(arr2);
        System.out.println(arr2);

    }
}
