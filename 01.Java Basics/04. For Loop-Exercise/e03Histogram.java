package w04Excersise;

import java.util.Scanner;

public class e03Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;

        for (int i = 1; i <= count; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num < 200) {
                p1 += 1;
            } else if (num < 400) {
                p2 += 1;
            } else if (num < 600) {
                p3 += 1;
            } else if (num < 800) {
                p4 += 1;
            } else {
                p5 += 1;
            }


        }
        double percent1 = p1 / count* 100;
        double percent2 = p2 / count * 100;
        double percent3 = p3 / count * 100;
        double percent4 = p4 / count * 100;
        double percent5 = p5 / count * 100;

        System.out.printf("%.2f%% %n", percent1);
        System.out.printf("%.2f%% %n", percent2);
        System.out.printf("%.2f%% %n", percent3);
        System.out.printf("%.2f%% %n", percent4);
        System.out.printf("%.2f%% %n", percent5);
    }
}
