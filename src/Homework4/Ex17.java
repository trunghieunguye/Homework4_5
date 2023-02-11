package Homework4;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        int n = nhapN();
        int soChan = soChan(n);
        int soLe = soLe(n);

    }


    public static int nhapN() {
        System.out.print("Nhap n = ");
        int n = new Scanner(System.in).nextInt();
        return n;
    }

    public static int soChan(int n) {
        System.out.print("So chan la : ");
        int i;
        for (i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + "\t");


            }


        }
        return i;

    }

    public static int soLe(int n) {
        System.out.print("So chan la : ");
        int i;
        for (i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + "\t");

            }
        }
        return i;
    }
}

