package Homework4;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        int[][] a = nhap();
        int[][] b = new int[a.length][a.length];
        in(a, "A");
        b = chuyenvi(a, b);
        in(b, "chuyển vị B");
    }

    public static int[][] nhap() {
        int n = 0;
        int m = 0;
        System.out.println("Nhập n, m là số tự nhiên: ");
        while (m <= 0) {
            System.out.print("Nhập m: ");
            m = new Scanner(System.in).nextInt();
        }
        while (n <= 0) {
            System.out.print("Nhập n: ");
            n = new Scanner(System.in).nextInt();
        }
        System.out.println("Nhập ma trận:");
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Nhập a[%d][%d]: ", i, j);
                a[i][j] = new Scanner(System.in).nextInt();
            }
        }
        return a;
    }

    public static void in(int[][] a, String s) {
        System.out.println("Ma trận " + s);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print("\t" + a[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] chuyenvi(int[][] a, int[][] b) {
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                b[i][j] = a[j][i];
            }
        }
        return b;
    }
}
