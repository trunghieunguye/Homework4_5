package Homework4;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        int[] a = nhapmang();
        int[] saukhisapxep = sapxep(a);
        xuatmang(saukhisapxep);
    }

    public static int[] nhapmang() {
        System.out.println("Nhập số lượng phần tử của mảng: ");
        int n = new Scanner(System.in).nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = ");
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

    public static int[] sapxep(int[] a) {
        int i;
        int value = 0;
        for (i = 0; i < a.length-1; i++) {
            if (a[i] == value) {
                System.out.println("nhập lại giá trị khác với giá trị đã nhập trước đó");
                break;

            }
        }
        return a;
    }
}
