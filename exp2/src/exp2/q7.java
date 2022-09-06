package exp2;

import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        // get array input
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter length of array: ");
        n = sc.nextInt();
        System.out.println("Enter elements of array: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // copy subset of array using System.arraycopy
        System.out.println("Enter start and end index of subset: ");
        int start = sc.nextInt();
        int end = sc.nextInt();

        int subset[] = new int[end - start + 1];
        System.arraycopy(arr, start, subset, 0, end - start + 1);

        // print subset
        System.out.println("Subset of array: ");
        for (int i = 0; i < end - start + 1; i++) {
            System.out.print(subset[i] + " ");
        }

        System.out.println();

        sc.close();

    }
}
