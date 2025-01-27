package class_Exp;
import java.util.Scanner;

public class exp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr1 = new int[2][2];
        int[][] arr2 = new int[2][2];

        System.out.println("Enter elements of matrix 1:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of matrix 2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Addition of matrices will give output:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print((arr1[i][j] + arr2[i][j]) + " ");
            }
            System.out.println();
        }

        System.out.println("Subtraction of matrices will give output:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print((arr1[i][j] - arr2[i][j]) + " ");
            }
            System.out.println();
        }

        System.out.println("Multiplication of matrices will give output:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                int result = 0;
                for (int k = 0; k < 2; k++) {
                    result += arr1[i][k] * arr2[k][j];
                }
                System.out.print(result + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
