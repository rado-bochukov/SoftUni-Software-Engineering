package w05Excersise;

import java.util.Scanner;

public class e04Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalSteps = 0;

        while (totalSteps <= 10000) {
            String input = scanner.nextLine();

            if (input.equals("Going home")) {
                input = scanner.nextLine();
                double lastWalk = Double.parseDouble(input);
                totalSteps += lastWalk;
                break;
            }
            double addedSteps = Integer.parseInt(input);
            totalSteps += addedSteps;


        }

        if (totalSteps < 10000) {
            System.out.printf("%.0f more steps to reach goal.", 10000 - totalSteps);
        } else {
            System.out.printf("Goal reached! Good job!%n");
            System.out.printf("%.0f steps over the goal!", totalSteps - 10000);
        }
    }
}
