package Homework4;

import java.util.Scanner;

public class Ex15 {

    public static int nhapM() {
        System.out.print("Nhap m = ");
        int m = new Scanner(System.in).nextInt();
        return m;
    }
    public static float tinhTong(int n) {
        float tong=0f;
        for(int i = 1; i <= n; i++) {
            tong += 1.0/i;
        }
        return tong;
    }

    public static void main(String[] args) {
        int m = nhapM();
        float tong = tinhTong(m);
        System.out.println("Tong bang "+tinhTong(m));
    }

}
