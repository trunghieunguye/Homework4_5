package Homework4;
import java.util.Scanner;
import java.util.Arrays;

public class Ex22 {
    public static void main(String[] args) {
        int[] a = nhapmang();
        xuatmang(a);
        sapxep(a);
        chenmang(a);
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


    public static int[] sapxep(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        return a;
    }

    public static void chenmang(int[] a) {
        System.out.print("Nhập x: ");
        int x = new Scanner(System.in).nextInt();
        int n = a.length;
        int[] b = new int[n+1];
        int vitri =n;
        for (int i = 0; i < n; i++) {
            if (x<=a[i]){
                vitri =i;
                break;
            }
        }
        for (int i = 0; i < vitri; i++) {
            b[i]=a[i];
        }
        b[vitri]=x;
        for (int i = vitri; i <n ; i++) {
            b[i+1]=a[i];
        }
        System.out.println("Mảng chèn x: " + Arrays.toString(b));
    }
}
