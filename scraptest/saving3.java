package scraptest;

import java.util.Scanner;

public class saving3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double[] interest_Rate = { 0, 3.9, 3.92, 3.95, 3.99, 4.04, 5.54, 5.72, 5.92, 6.14, 6.38, 6.64, 6.92 };
        double N = sc.nextDouble();
        int M = sc.nextInt();
        double monthlypayed = 0;
        for (int i = 0; i < M; i++) {
            int current_Month = M - i;
            int years = current_Month / 12;
            
            if (years > 0) {
                monthlypayed /=Math.pow(1.0692, years);
            }

            current_Month %= 12;
            monthlypayed += (1 + interest_Rate[current_Month] * current_Month / 1200) / N;
        }
        System.out.printf("%.4f", Math.pow(monthlypayed, -1));
    }
}
