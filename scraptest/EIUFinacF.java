package scraptest;

import java.util.Scanner;

public class EIUFinacF {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rate = sc.nextDouble() / 100;
        double inflation = sc.nextDouble() / 100;
        long withdraw = sc.nextLong();
        long month = sc.nextLong();

        double sum = 0;
        for (int i = 0; i < month - 1; i++) {
            sum += Math.pow((1 + rate), month - 1 - i) * Math.pow(1 + inflation, i);
        }
        double money = withdraw * sum / Math.pow(1 + rate, month);
        System.out.printf("%.4f", money);
        sc.close();
    }
}