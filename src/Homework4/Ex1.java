package Homework4;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        for (int i = 1000000; i <= 999999999; i++) {
            if (thuannghich(i) && chua068(i) && chiahetcho10(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean thuannghich(int n) {
        int m = n;
        int check = 0;
        while (m > 0) {
            check = check * 10 + m % 10;
            m /= 10;
        }
        if (check == n) {
            return true;
        }
        return false;
    }

    public static boolean chua068(int n) {
        while (n > 0) {
            switch (n % 10) {
                case 0:
                    break;
                case 6:
                    break;
                case 8:
                    break;
                default:
                    return false;
            }
            n /= 10;
        }
        return true;
    }

    public static boolean chiahetcho10(int n) {
        int du;
        int tong = 0;
        while (n > 0) {
            du = n % 10;
            n /= 10;
            tong += du;
            if (tong % 10 == 0) {
                return true;
            }
        }
        return false;
    }
}


