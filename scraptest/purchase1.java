package scraptest;

import java.util.Scanner;

public class purchase1 {

    public static double calculateActualInterest(long V, long T, long N, long M) {
        double remainingDebt = V - N;

        // Thiết lập tìm kiếm nhị phân cho lãi suất hàng tháng r
        double low = 0;
        double high = 0.09;
        double precision = 1e-7;

        while (high - low > precision) {
            double r = (low + high) / 2;
            double debt = remainingDebt;

            // Cập nhật dư nợ qua từng tháng với lãi suất hiện tại r
            for (int i = 0; i < T; i++) {
                debt = debt * (1 + r) - M;
            }

            // Kiểm tra kết quả dư nợ cuối kỳ để điều chỉnh r
            if (debt > 0) {
                high = r; // r cần cao hơn
            } else {
                low = r; // r cần thấp hơn
            }
        }

        return (low + high) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long V = scanner.nextInt();
        long T = scanner.nextInt();

        long N = scanner.nextInt();
        long M = scanner.nextInt();

        double result = calculateActualInterest(V, T, N, M);

        System.out.println(result);

        scanner.close();
    }
}
