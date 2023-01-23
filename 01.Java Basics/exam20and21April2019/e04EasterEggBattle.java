package exam20and21April2019;

import java.util.Scanner;

public class e04EasterEggBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eggsFirst = Integer.parseInt(scanner.nextLine());
        int eggsSecond = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        boolean outOfEggs = false;

        while (!input.equals("End")) {
            String winner = input;

            if (winner.equals("one")) {
                eggsSecond--;
            } else if (winner.equals("two")) {
                eggsFirst--;
            }

            if (eggsFirst == 0) {
                System.out.printf("Player one is out of eggs. Player two has %d eggs left.", eggsSecond);
                outOfEggs = true;
                break;
            } else if (eggsSecond == 0) {
                System.out.printf("Player two is out of eggs. Player one has %d eggs left.", eggsFirst);
                outOfEggs = true;
                break;
            }
            input = scanner.nextLine();
        }
        if (!outOfEggs) {
            System.out.printf("Player one has %d eggs left.%n", eggsFirst);
            System.out.printf("Player two has %d eggs left.%n", eggsSecond);
        }
    }
}
