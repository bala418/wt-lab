package exp5;

// import array list
import java.util.ArrayList;
// reverse
import java.util.Collections;

public class q6 {

    // capitalize plural arraylist
    public static ArrayList<String> capitalizePlural(ArrayList<String> arr) {
        // create new arraylist
        ArrayList<String> newArr = new ArrayList<String>();
        // loop through arraylist
        for (String i : arr) {
            // if last character is s
            if (i.charAt(i.length() - 1) == 's') {
                // capitalize
                i = i.toUpperCase();
            }
            // add to new arraylist
            newArr.add(i);
        }
        // return new arraylist
        return newArr;
    }

    // remove plurals
    public static ArrayList<String> removePlural(ArrayList<String> arr) {
        // create new arraylist
        ArrayList<String> newArr = new ArrayList<String>();
        // loop through arraylist
        for (String i : arr) {
            // if last character is not s
            if (i.charAt(i.length() - 1) != 's') {
                // add to new arraylist
                newArr.add(i);
            }
        }
        // return new arraylist
        return newArr;
    }

    public static void main(String[] args) {
        // array lsit of strings
        ArrayList<String> arr = new ArrayList<String>();
        // add elements
        arr.add("hello");
        arr.add("world");
        arr.add("rabbits");
        arr.add("cats");

        // reverse the arraylist
        Collections.reverse(arr);

        // print arraylist
        System.out.println(arr);
        // arr2 = arr
        ArrayList<String> arr2 = arr;
        // capitalize plural
        arr = capitalizePlural(arr);
        System.out.println(arr);

        // remove plurals
        arr2 = removePlural(arr2);
        System.out.println(arr2);

    }
}
