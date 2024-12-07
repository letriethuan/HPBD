package second_practice_test;

import java.util.Scanner;

public class EIBankLoan {
    static Scanner sc = new Scanner(System.in);

    public static void MonthCount(long X, long Y, double r) {
        int i = 0;
        r /= 1200;
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
        MonthCount(X, Y, r);

    }
}
