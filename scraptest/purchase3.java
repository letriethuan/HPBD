package scraptest;

import java.util.Scanner;

public class purchase3 {

    public static double calculateActualInterest(long P, long M, long N, double R) {
        double remainingDebt = P - M;
        double monthlypayed = (remainingDebt * R * Math.pow(1 + R, N)) / (Math.pow((1 + R), N) - 1);
        return monthlypayed;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long P = scanner.nextLong();
        long M = scanner.nextLong();

        long N = scanner.nextLong();
        double R = scanner.nextDouble();

        double result = calculateActualInterest(P, M, N, R);

        System.out.println(Math.ceil(result));

        scanner.close();
    }
}
