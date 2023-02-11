package Homework4;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        int[] a = nhapmang();
        xuatmang(a);
        Solonthu2(a);
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

    public static void Solonthu2(int[] a) {
        int n = a.length;
        int max1 = a[0];
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max1 = Math.max(a[i], max1);
        }
        for (int i = 0; i < n; i++) {
            if (a[i] != max1) {
                max2 = Math.max(max2, a[i]);
            }
        }
        if (max1 != max2 && max2 != Integer.MIN_VALUE) {
            System.out.println("Số lớn thứ 2: " + max2);
            System.out.print("Vị trí: ");
            for (int i = 0; i < n; i++) {
                if (a[i] == max2) {
                    System.out.print((i + 1) + " ");
                }
            }
        } else {
            System.out.println("Không có số lớn thứ 2!");
        }



    }
}
