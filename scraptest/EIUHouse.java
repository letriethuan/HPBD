package scraptest;

import java.util.*;
import java.lang.*;

class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws java.lang.Exception {
        long N = sc.nextLong();
        long M = sc.nextLong();
        long K = sc.nextLong();
        double r = sc.nextDouble();
        caculatedMonthlyPay(N, M, K, r);
    }

    public static void caculatedMonthlyPay(long N, long M, long K, double r) {
        double L = (double) (N - M);
        double monthlyPayment = (L / K);
        double totalPayment = 0;
        r /= 100;
        for (int i = 1; i <= K; i++) {
            double interestPayment = L * r;
            totalPayment = monthlyPayment + interestPayment;
            L -= monthlyPayment;
            System.out.println(i + " " + Math.round(totalPayment));
        }
    }
}