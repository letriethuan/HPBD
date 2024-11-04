package first_practice_test;

import java.util.Scanner;

public class saving2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long M = sc.nextLong();
        double money;
        double total = 0;
        double[] Inrates = { 3.9, 3.92, 3.95, 3.99, 4.04, 5.54, 5.72, 5.92, 6.14, 6.38, 6.64, 6.92 };
        for (int i = 0; i < M; i++) {
            money = sc.nextLong();
            long current_Months = M - i;

            long years = current_Months / 12;
            if (years > 0) {
                money *= Math.pow(1 + 0.0692, years);
            }
            current_Months %= 12;

            if (current_Months > 0) {
                total += money * (1 + (Inrates[(int) current_Months] / 100 / 12) * current_Months);
            }
        }

        System.out.println(Math.round(total));
        sc.close();
    }
}
