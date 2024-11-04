package scraptest;

import java.util.Scanner;

public class EIU_saving1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        long M = sc.nextLong();

        double[] inRates = { 3.9, 3.92, 3.95, 3.99, 4.04, 5.54, 5.72, 5.92, 6.14, 6.38, 6.64, 6.92 };

        long years = M / 12;
        long months = M % 12;

        double money = N;
        if (years > 0) {
            money = N * Math.pow((1 + 0.0692), years);
        }
        if (months > 0) {
            money = money * (1 + (inRates[(int) (months - 1)] / 100 / 12) * months);
        }

        System.out.println(Math.round(money));
        sc.close();
    }
}
