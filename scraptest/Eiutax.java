package scraptest;

import java.util.Scanner;

public class Eiutax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long salary = sc.nextLong();
        long[] tax_payables = { 0, 5000000, 10000000, 18000000, 32000000, 52000000, 80000000, Long.MAX_VALUE / 2 };
        double[] tax_rate = { 0.05, 0.1, 0.15, 0.2, 0.25, 0.3, 0.35 };
        long taxable_incomes = salary - 9000000;
        long tax = 0;
        for (int i = 0; i < 8; i++) {
            if (taxable_incomes > tax_payables[i]) {
                tax += Math.min(tax_payables[i + 1] - tax_payables[i], taxable_incomes - tax_payables[i]) * tax_rate[i];
            } else {
                break;
            }
        }
        System.out.println(tax);
        sc.close();
    }
}
