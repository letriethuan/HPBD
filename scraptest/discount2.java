package scraptest;

import java.util.Scanner;

public class discount2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextLong();
        long[] price = { 5000000, 20000000, 100000000, 300000000, 600000000, 900000000, Long.MAX_VALUE };
        double[] discount = { 0.0, 0.03, 0.05, 0.07, 0.1, 0.12, 0.15 };
        double total = 0;
        for (int i = 1; i < price.length; i++) {
            if (n > price[i - 1]) {
                total += Math.min(price[i] - price[i - 1], n - price[i - 1]) * discount[i];
            }
        }
        System.out.println((long) (n - total));
        sc.close();
    }
}
