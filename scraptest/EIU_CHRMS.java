package scraptest;

import java.util.Scanner;

public class EIU_CHRMS {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int bill = sc.nextInt();
        long[] discount = { 0, 2000000, 5000000, 10000000, 20000000, 50000000, 100000000, 200000000, Long.MAX_VALUE };
        double[] dis_rates = { 0.03, 0.04, 0.05, 0.06, 0.07, 0.08, 0.09, 0.1 };
        double total = 0;
        double discount_value = 0;
        for (int i = 0; i < bill; i++) {
            long value = sc.nextLong();
            for (int j = 0; j < discount.length - 1; j++) {
                if (value <= discount[j + 1]) {
                    discount_value = value * (1 - dis_rates[j]);
                    break;
                }
            }
            total += discount_value;
        }
        System.out.println((long) total);

    }

}