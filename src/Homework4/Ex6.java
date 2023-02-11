package Homework4;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        int[] a = nhapmang();
        int b, c;
        while (true) {
            System.out.print("Nhập b: ");
            b = new Scanner(System.in).nextInt();
            System.out.print("Nhập c: ");
            c = new Scanner(System.in).nextInt();
            if (b < c) {
                break;
            } else {
                System.out.println("Nhập b < c");
            }
        }
        System.out.printf("Trung bình cộng các số trong khoảng [%d,%d] là: %.2f", b, c, Trungbinh(a, b, c));
    }

    public static int[] nhapmang() {
        System.out.println("Nhập số lượng phần tử của mảng: ");
        int n = new Scanner(System.in).nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = new Scanner(System.in).nextInt();
        }
        return a;
    }

    public static void xuatmang(int[] a) {
        System.out.println("----------------------");
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                System.out.print(a[i]);
                break;
            }
            System.out.print(a[i] + ", ");
        }
        System.out.println("]");
    }

    public static float Trungbinh(int[] a, int b, int c) {
        int sum = 0;
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= b && a[i] <= c) {
                sum += a[i];
                k += 1;
            }
        }
        if (k == 0) {
            return 0;
        }
        return (float) sum / k;

    }
}