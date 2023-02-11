package Homework4;
import java.util.Scanner;
public class Ex9 {
    public static void main(String[] args) {
        int[] a = nhapmang();
        int[] mang = Bai9(a);
        xuatmang(mang);
    }

    public static int[] nhapmang() {
        System.out.println("Nhập số lượng phần tử của mảng: ");
        int n = new Scanner(System.in).nextInt();
        int[] a = new int[n];
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

    public static int[] Bai9(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
        }
        return a;
    }
}
