package first_practice_test;

import java.util.Scanner;

public class tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double aftax_money = sc.nextDouble();
        double beftax_money = aftax_money / 0.9;
        double tax = beftax_money - aftax_money;
        System.out.println(tax);
        sc.close();
    }
}
