package scraptest;

import java.util.Scanner;
import java.util.ArrayList;

public class EIUinrate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> answers = new ArrayList<>();
        long n = sc.nextLong();
        for (int i = 0; i < n; i++) {
            double N = sc.nextDouble();
            double L = sc.nextDouble();
            double M = sc.nextDouble();
            if (N >= M) {
                continue;
            }
            double month = (Math.log(M / N) / Math.log(1 + (L / 100)));
            answers.add(Math.ceil(month));
        }
        for (double e : answers) {
            System.out.println((long) e);
        }
        sc.close();
    }
}
