package second_practice_test;

import java.util.Scanner;

public class EIUpurchase {
    static Scanner sc = new Scanner(System.in);

    public static double RateCal(long V, long T, long N, long M) {

        double remainingDebt = V - N;

        double low = 0;
        double high = 0.09;
        double pricision = 1e-7;

        while (high - low > pricision) {
            double r = (high + low) / 2;
            double debt = remainingDebt;

            for (int i = 0; i < T; i++) {
                debt = debt * (1 + r) - M;
            }
            if (debt > 0) {
                high = r;
            } else {
                low = r;
            }
        }
        return (high + low) / 2;
    }

    public static void main(String[] args) {
        long V = sc.nextLong();
        long T = sc.nextLong();
        long N = sc.nextLong();
        long M = sc.nextLong();
        double result = RateCal(V, T, N, M);
        System.out.printf("%.3f", result);
    }
}
