package exp3;

/**
 *
 * @author student
 */
public class q3 {

    int[] array = new int[5];

    q3() {
        for (int i = 0; i < array.length; i++) {
            array[i] = -1;
        }
    }

    q3(int[] newArray) {
        System.arraycopy(newArray, 0, array, 0, array.length);
    }

    // sort the array in ascending order using insertion sort
    void sort() {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        System.out.println("Using default constructor");
        q3 x = new q3();
        x.print();
        int[] newArray;

        newArray = new int[] { 6, 4, 2, 8, 10 };
        System.out.println("Using parameterized constructor");
        q3 y = new q3(newArray);
        y.sort();
        System.out.println("Sorted array");
        y.print();

    }
}