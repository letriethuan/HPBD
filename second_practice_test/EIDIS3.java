package second_practice_test;

import java.util.Scanner;

public class EIDIS3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long price = sc.nextLong();
        long[] tags = { 5_000_000, 20_000_000, 100_000_000, 300_000_000, 600_000_000, 900_000_000, Long.MAX_VALUE };
        double[] discount = { 0, 0.03, 0.05, 0.07, 0.1, 0.12, 0.15 };
        double total = 0;
        for (int i = 1; i < tags.length; i++) {
            if (price > tags[i - 1]) {
                total += Math.min(tags[i] - tags[i - 1], price - tags[i - 1]) * discount[i];
            }
        }
        long payed_price = price - (long) total;
        for (int i = 0; i < 2; i++) {
            int m = sc.nextInt();
            if (m == 1) {
                payed_price *= (1 - 0.02); // giam gia
            }
        }
        System.out.println(payed_price);
    }

}
