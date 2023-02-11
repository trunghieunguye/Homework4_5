package Homework4;
import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        int[] a = nhapmang();
        xuatmang(a);
        timx(a);
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


    public static void timx(int[] a) {
        int temp = 0;
        System.out.print("Nhập x: ");
        int x = new Scanner(System.in).nextInt();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                temp += 1;
            }
        }
        System.out.printf("X xuất hiện " + temp + " lần");
    }
}
