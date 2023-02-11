package Homework4;

public class Ex2 {
    public static void main(String[] args) {
        for (int i = 1000000; i <= 9999999; i++) {
            if (songuyento(i) && chuasonguyento(i) && nghichdaonguyento(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean songuyento(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static boolean chuasonguyento(int n) {
        while (n > 0) {
            if (!songuyento(n % 10)) {
                return false;
            }
            n /= 10;
        }
        return true;
    }


    public static boolean nghichdaonguyento(int n) {
        int x = 0;
        while (n > 0) {
            x = x * 10 + n % 10;
            n = n / 10;
        }
        if (x < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

}
