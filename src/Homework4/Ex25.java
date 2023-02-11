package Homework4;
import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        int[] a = nhapmang();
        xuatmang(a);
        ChanLe(a);
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

    public static void ChanLe(int[] a) {
        int chan = 0;
        int le = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                chan += 1;
            }
            le = a.length - chan;
        }
        System.out.println("Mảng có " + chan + " số chẵn");
        System.out.println("Mảng có " + le + " số lẻ");
    }
}
