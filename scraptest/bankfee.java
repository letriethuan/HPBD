package scraptest;

import java.util.Scanner;

public class bankfee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //
        double amount = sc.nextDouble();// Tien luonn la so thuc
        long number = sc.nextLong();
        //
        long[] account = { 500, 1999, 2000, 5000 };
        double[] monthly_fee = { 12.00, 7.5, 5.00, 0.0 };
        double[] feepc = { 0.20, 0.20, 0.10, 0.0 };
        double total_fee = 0;
        if (amount < account[0]) {
            total_fee = monthly_fee[0] + feepc[0] * (double) number;

        } else if (amount <= account[1] && amount >= account[0]) {
            total_fee = monthly_fee[1] + feepc[1] * (double) number;
        } else if (amount < account[3] && amount >= account[2]) {
            total_fee = monthly_fee[2] + feepc[2] * (double) number;
        } else if (amount >= account[3]) {
            total_fee = monthly_fee[3] + feepc[3] * (double) number;
        }
        System.out.println(total_fee);
        sc.close();
    }
}
