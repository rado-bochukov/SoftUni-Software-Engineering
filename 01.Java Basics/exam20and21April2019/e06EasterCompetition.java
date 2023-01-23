package exam20and21April2019;

import java.util.Scanner;

public class e06EasterCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cakesCount = Integer.parseInt(scanner.nextLine());

        int maxScore = 0;
        String winner="";

        for (int i = 1; i <= cakesCount; i++) {

            String baker = scanner.nextLine();
            String input = scanner.nextLine();

            int currentScore = 0;

            while (!input.equals("Stop")) {
                int score = Integer.parseInt(input);
                currentScore += score;
                input=scanner.nextLine();
            }
            System.out.printf("%s has %d points.%n", baker, currentScore);

            if(currentScore>maxScore) {
                System.out.printf("%s is the new number 1!%n",baker);
                winner=baker;
                maxScore=currentScore;
            }
            currentScore=0;
        }
        System.out.printf("%s won competition with %d points!",winner,maxScore);
    }
}
