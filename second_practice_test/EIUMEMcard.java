package second_practice_test;

import java.util.Scanner;

public class EIUMEMcard {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        long items = sc.nextLong();
        long[] pricetags = { 0, 1_000_000, 20_000_000, 50_000_000, 200_000_000, Long.MAX_VALUE };
        double[] rates = { 0, 0.02, 0.03, 0.05, 0.07 };
        double sum_money = 0;
        int rank = 0;
        for (int i = 0; i < items; i++) {
            long price = sc.nextLong();
            double discount = price * rates[rank];
            sb.append(discount + " ");
            sum_money += price;
            while (true) {
                if (sum_money >= pricetags[rank + 1]) {
                    rank++;
                } else {
                    break;
                }
            }

        }
        System.out.println(sb);
    }
}
