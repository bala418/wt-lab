package exp2;

import java.util.Scanner;

public class q6 {

    static void matrix_add() {
        // matrix addition
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of matrix: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int mat1[][] = new int[n][m];
        int mat2[][] = new int[n][m];
        int mat3[][] = new int[n][m];
        System.out.println("Enter elements of matrix 1: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements of matrix 2: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat3[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        System.out.println("Sum of matrices: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mat3[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void matrix_multiply() {
        // matrix multiplication
        Scanner sc = new Scanner(System.in);
        int n, m;
        int mat1[][];
        int mat2[][];
        int mat3[][];
        System.out.print("Enter size of matrix 1: ");
        n = sc.nextInt();
        m = sc.nextInt();
        System.out.println("Enter size of matrix 2: ");
        int p = sc.nextInt();
        int q = sc.nextInt();
        if (m != p) {
            System.out.println("Matrix multiplication not possible");
            sc.close();
            return;
        }
        mat1 = new int[n][m];
        mat2 = new int[p][q];
        mat3 = new int[n][q];
        System.out.println("Enter elements of matrix 1: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements of matrix 2: ");
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < q; j++) {
                mat3[i][j] = 0;
                for (int k = 0; k < m; k++) {
                    mat3[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
        System.out.println("Product of matrices: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < q; j++) {
                System.out.print(mat3[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void transpose() {
        // transpose of matrix
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of matrix: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int mat1[][] = new int[n][m];
        int mat2[][] = new int[m][n];
        System.out.println("Enter elements of matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat2[j][i] = mat1[i][j];
            }
        }
        System.out.println("Transpose of matrix: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        matrix_add();
        matrix_multiply();
        transpose();
        sc.close();
    }
}
