package scraptest;

import java.util.Scanner;

public class EIUVINBattery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long money = sc.nextLong();
        long battery_value = sc.nextLong();
        long month = sc.nextLong();
        double rate = sc.nextDouble() / 100;
        double pay = (money - battery_value) * Math.pow(1 + rate, month) * rate / (Math.pow(1 + rate, month) - 1);
        pay += battery_value * rate;
        System.out.println(Math.round(pay));
        sc.close();
    }
}
