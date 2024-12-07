package thir_practice_test;

import java.util.Scanner;

public class EIUBattery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long M = sc.nextLong();
        long T = sc.nextLong();
        double r = sc.nextDouble() / 100;
        double pay = 0;
        pay = ((N - M) * r * (Math.pow(1 + r, T))) / (Math.pow(1 + r, T) - 1);
        pay += M * r;
        System.out.println(Math.round(pay));
        sc.close();

    }
}
