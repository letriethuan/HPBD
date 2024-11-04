package scraptest;

import java.util.ArrayList;
import java.util.Scanner;

public class salary2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> salary = new ArrayList<>();
        int people = sc.nextInt();
        double OT = 0;
        double Othours = 0;
        double OTaves = 0;
        double OF = 0;
        double Offhours = 0;
        double OFaves = 0;
        for (int i = 0; i < people; i++) {
            // 5 days of work with hours
            double[] hours = new double[6];
            // input the hour
            for (int j = 0; j < 5; j++) {
                hours[j] = sc.nextDouble();
            }
            hours[5] = sc.nextDouble();
            double wages = 0;
            // 5 days
            for (int j = 0; j < 5; j++) {
                if (hours[j] <= 8) {
                    wages += (hours[j] * hours[5]);
                    OF += (hours[j] * hours[5]);
                    Offhours += hours[j];
                } else {
                    wages += (8 * hours[5] + (hours[j] - 8) * hours[5] * 1.5);
                    OT += ((hours[j] - 8) * hours[5] * 1.5);
                    OF += (8 * hours[5]);
                    Offhours += 8;
                    Othours += (hours[j] - 8);
                }
            } // doing outside loop not inside loop/ after counting 5 days then count into the
              // array
            salary.add(wages);

        }
        OTaves = (Othours > 0) ? OT / Othours : 0;
        OFaves = (Offhours > 0) ? OF / Offhours : 0;

        for (double e : salary) {
            System.out.printf("%.2f", e);
            System.out.println(" ");
        }
        System.out.printf("%.2f", OFaves);
        System.out.println("");
        System.out.printf("%.2f", OTaves);
        sc.close();
    }
}