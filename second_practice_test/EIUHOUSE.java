package second_practice_test;

import java.util.Scanner;

public class EIUHOUSE {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long N = sc.nextLong();
        long M = sc.nextLong();
        long K = sc.nextLong();
        double r = sc.nextDouble();
        CountMonthlypaid(N, M, K, r);

    }

    public static void CountMonthlypaid(long N, long M, long K, double r) {
        double L = (double) (N - M);
        double monthlypayments = L / K;
        double total = 0;
        r /= 100;
        for (int i = 1; i <= K; i++) {
            double interestrate = L * r;
            total = monthlypayments + interestrate;
            L -= monthlypayments;
            System.out.println(i + " " + Math.round(total));
        }

    }
}
