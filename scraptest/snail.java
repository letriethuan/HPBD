package scraptest;

import java.util.Scanner;

public class snail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long V = sc.nextLong();
        double total = A - B;
        double days = (V - A) / total;// Chung gia tri
        days = Math.ceil(days);
        System.out.println((int) (days + 1));
        sc.close();
    }
}
