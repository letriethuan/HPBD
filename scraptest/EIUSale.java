package scraptest;

import java.util.Scanner;

public class EIUSale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextLong();
        long[] price = { 0, 20, 50, 200, 500, 2000, Long.MAX_VALUE };
        double[] discount = { 0.0, 0.02, 0.03, 0.04, 0.05, 0.06, 0.07 };
        double total = 0;
        for (int i = 1; i < price.length; i++) {
            if (n > price[i - 1]) {
                total += Math.min(price[i] - price[i - 1], n - price[i - 1]) * discount[i];
            }
        }
        System.out.println(total);
        sc.close();
    }
}
