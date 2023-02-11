package Homework4;

import java.util.Scanner;



public class Ex14 {
    public static void main(String[] args) {
        int m = nhapM();
        int n = nhapN();
        int checkSCP = check(m, n);
        System.out.println("The number of square number(s) is(are) " + checkSCP);
    }

    public static int nhapM () {
            System.out.print("Nhap m = ");
            int m = new Scanner(System.in).nextInt();
            return m;
        }
        public static int nhapN () {
            System.out.print("Nhap n = ");
            int n = new Scanner(System.in).nextInt();
            return n;
        }

        public static int check (int m, int n){

            String square_number = "";
            int count = 0;
            for (int i = m; i <= n; i++) {
                double temp = Math.sqrt(i) / Math.round(Math.sqrt(i));
                if (temp != 1) {
                    continue;
                }
                count++;
                square_number += ", " + i;
            }
            return count;


        }

    }
