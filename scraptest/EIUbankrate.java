package scraptest;

import java.util.Scanner;

public class EIUbankrate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        double d = n * (1 + m * 0.0075);
        System.out.println(d);
        sc.close();
    }
}
