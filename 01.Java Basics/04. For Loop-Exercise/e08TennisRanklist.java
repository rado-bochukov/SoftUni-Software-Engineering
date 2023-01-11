package w04Excersise;

import java.util.Scanner;

public class e08TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tours = Integer.parseInt(scanner.nextLine());
        int initialPoints = Integer.parseInt(scanner.nextLine());

        int pointsW = 0;
        int pointsF = 0;
        int pointsSF = 0;

        for (int i = 1; i <= tours; i++) {
            String place = scanner.nextLine();

            switch (place) {
                case "W":
                    pointsW += 2000;
                    break;
                case "F":
                    pointsF += 1200;
                    break;
                case "SF":
                    pointsSF += 720;
                    break;
            }

        }
        double finalPoints = initialPoints + pointsW + pointsF + pointsSF;
        double averagePoints = Math.floor((pointsW + pointsF + pointsSF) / tours);
        double percentW = ((pointsW / 2000.0) / tours) * 100;

        System.out.printf("Final points: %.0f%n", finalPoints);
        System.out.printf("Average points: %.0f%n", averagePoints);
        System.out.printf("%.2f%%", percentW);


    }
}
