package exam18and19July2020;

import java.util.Scanner;

public class e05BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int mostGoals = 0;
        String bestPlayer = "";
        boolean hatTrick = false;

        while (!input.equals("END")) {

            String player=input;

            int goals = Integer.parseInt(scanner.nextLine());

            if (goals > mostGoals) {
                mostGoals = goals;
                bestPlayer = player;
            }

            if (mostGoals >= 10) {
                hatTrick = true;
                break;

            } else if (mostGoals >= 3) {
                hatTrick = true;
            }
            input = scanner.nextLine();
        }
        System.out.printf("%s is the best player!%n", bestPlayer);

        if (hatTrick) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!", mostGoals);
        } else {
            System.out.printf("He has scored %d goals.", mostGoals);
        }
    }
}
