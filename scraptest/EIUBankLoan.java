package scraptest;

import java.util.Scanner;

public class EIUBankLoan {
    static Scanner sc = new Scanner(System.in);

    public static void payOffloanTime(long X, long Y, double r) {
        r /= 1200;
        int i = 0;
        while (X > 0) {
            X = (long) (X * (1 + r) - Y);
            i++;
        }
        System.out.println(i);
    }

    public static void main(String[] args) {
        long X = sc.nextLong();
        long Y = sc.nextLong();
        double r = sc.nextDouble();
        payOffloanTime(X, Y, r);
    }
}
