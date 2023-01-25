package ExamTasks01;

import java.util.Scanner;

public class e05FootballStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String club = scanner.nextLine();
        int matches = Integer.parseInt(scanner.nextLine());

        int points = 0;
        int countW = 0;
        int countD = 0;
        int countL = 0;

        if (matches < 1) {
            System.out.printf("%s hasn't played any games during this season.", club);

        } else {

            for (int i = 1; i <= matches; i++) {

                String result = scanner.nextLine();

                switch (result) {
                    case "W":
                        points += 3;
                        countW++;
                        break;
                    case "D":
                        points += 1;
                        countD++;
                        break;
                    case "L":
                        countL++;
                        break;
                }
            }
            double winRate = 1.0*countW/matches*100;
            System.out.printf("%s has won %d points during this season.%n",club,points);
            System.out.printf("Total stats:%n");
            System.out.printf("## W: %d%n",countW);
            System.out.printf("## D: %d%n",countD);
            System.out.printf("## L: %d%n",countL);
            System.out.printf("Win rate: %.2f%%",winRate);

        }
    }
}
