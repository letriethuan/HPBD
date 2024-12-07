package scraptest;

import java.util.Scanner;

public class EIMEMCARD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        long number = sc.nextLong();
        long total_Value = 0;
        double rat = 0;

        long[] threshold = { 1_000_000, 20_000_000, 50_000_000, 200_000_000 };
        double[] discount_rate = { 0.02, 0.03, 0.05, 0.07 };

        for (int i = 0; i < number; i++) {
            long price = sc.nextLong();

            long discount = (long) (price * rat);
            sb.append(discount).append(" ");

            total_Value += price;
            for (int j = 0; j < threshold.length; j++) {
                if (total_Value >= threshold[j]) {
                    rat = discount_rate[j];
                }
            }
        }
        System.out.println(sb.toString().trim());
        sc.close();
    }
}
