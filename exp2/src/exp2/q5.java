package exp2;

import java.util.Scanner;
import java.util.Arrays;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("3rd smallest element: " + arr[2]);
        System.out.println("5th largest element: " + arr[n - 3]);

        sc.close();
    }
}
