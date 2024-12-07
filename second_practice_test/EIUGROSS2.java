package second_practice_test;

import java.util.Scanner;

public class EIUGROSS2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long[] taxable = { 0, 5000000, 10000000, 18000000, 32000000, 52000000, 80000000, Long.MAX_VALUE };
        double[] rates = { 0, 0.05, 0.1, 0.15, 0.2, 0.25, 0.3, 0.35 };
        double calculated_money = sc.nextDouble();
        calculated_money -= 11000000;
        for (int i = 1; i < taxable.length; i++) {
            if (calculated_money > taxable[i - 1]) {
                calculated_money += Math.min((taxable[i] - taxable[i - 1]) * rates[i],
                        (taxable[i - 1] - calculated_money) * rates[i] / (rates[i] - 1));
            }
        }
        System.out.println(11000000 + Math.round(calculated_money));
        sc.close();
    }
}
