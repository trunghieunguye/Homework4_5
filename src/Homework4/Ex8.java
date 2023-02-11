package Homework4;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        int[] a = nhapmang();
        int n = a.length;
        int[] b = new int[n];
        xuathien(a, b);
        int max = max(b);
        Bai8(a, b, max);
        int[] mang = xuatmang(a);
    }

    public static int[] nhapmang() {
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = new Scanner(System.in).nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = new Scanner(System.in).nextInt();
        }
        return a;
    }

    public static int[] xuathien(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            b[i] = 0;
            for (int j = i; j < a.length; j++) {
                if (a[i] == a[j]) {
                    b[i] = b[i] + 1;
                }
            }
        }
        return b;
    }
    public static int[] xuatmang(int[] a) {
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
        return a;
    }
    public static int max(int[] b) {
        int max = b[0];
        for (int i = 1; i < b.length; i++) {
            if (max < b[i]) {
                max = b[i];
            }
        }
        return max;
    }

    public static void Bai8(int[] a, int[] b, int max) {
        for (int i = 0; i < b.length; i++) {
            if (b[i] == max) {
                System.out.println("Phần tử xuất hiện nhiều nhất là " + a[i] + ", xuất hiện " + max + " lần");
            }
        }
    }
}
