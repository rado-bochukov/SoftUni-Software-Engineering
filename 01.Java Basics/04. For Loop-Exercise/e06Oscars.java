package w04Excersise;

import java.util.Scanner;

public class e06Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actor = scanner.nextLine();
        double basePoints = Double.parseDouble(scanner.nextLine());
        int juryCount = Integer.parseInt(scanner.nextLine());

        double pointsFromJury = 0;
        double totalPoints = 0;


        for (int i = 1; i <= juryCount; i++) {

            String juryName = scanner.nextLine();
            double points = Double.parseDouble(scanner.nextLine());

            int nameLenght = juryName.length();
            pointsFromJury += nameLenght * points / 2;
            totalPoints = basePoints + pointsFromJury;


            if (totalPoints >= 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actor, totalPoints);
                break;
            }

        }
        double diff = 1250.5 - totalPoints;
        if (totalPoints < 1250.5) {
            System.out.printf("Sorry, %s you need %.1f more!", actor, diff);


        }


    }
}
