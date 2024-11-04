package scraptest;

import java.util.Scanner;

public class EIU_saving2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int M = sc.nextInt();
        double[] interest_Rate = { 0, 3.9, 3.92, 3.95, 3.99, 4.04, 5.54, 5.72, 5.92, 6.14, 6.38, 6.64, 6.92 };
        double total = 0;
        double money = 0;
        for (int i = 0; i < M; i++) {
            money = sc.nextLong();
            int current_Month = M - i;
            int years = current_Month / 12;
            if (years > 0) {
                money *= Math.pow((1 + 0.0692), years); // using the interest rate in years term
            }
            current_Month %= 12;
            total += money * (1 + interest_Rate[current_Month] * current_Month / 1200);
        }
        System.out.println(Math.round(total));
    }
}
