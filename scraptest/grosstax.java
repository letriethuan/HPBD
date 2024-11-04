package scraptest;

import java.util.Scanner;
import java.util.ArrayList;

public class grosstax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> vals = new ArrayList<>();
        long n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            double num = sc.nextDouble();

            double tax_payed = num / 0.9;
            double tax = tax_payed - num;

            vals.add(tax);
        }
        for (double e : vals) {
            System.out.println(e);// định dạng cho kết quả
        }
        sc.close();
    }
}
