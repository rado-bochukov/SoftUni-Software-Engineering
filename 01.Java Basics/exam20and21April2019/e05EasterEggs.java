package exam20and21April2019;

import java.util.Scanner;

public class e05EasterEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eggs = Integer.parseInt(scanner.nextLine());

        int redCount = 0;
        int orangeCount = 0;
        int blueCount = 0;
        int greenCount = 0;
        int maxCount = 0;
        String maxEggs="";

        for (int i = 1; i <= eggs; i++) {

            String color = scanner.nextLine();
            switch (color) {
                case "red":
                    redCount++;
                    if (redCount > maxCount) {
                        maxCount = redCount;
                        maxEggs=color;
                    }
                    break;
                case "orange":
                    orangeCount++;
                    if (orangeCount > maxCount) {
                        maxCount = orangeCount;
                        maxEggs=color;
                    }
                    break;
                case "blue":
                    blueCount++;
                    if (blueCount > maxCount) {
                        maxCount = blueCount;
                        maxEggs=color;
                    }
                    break;
                case "green":
                    greenCount++;
                    if (greenCount > maxCount) {
                        maxCount = greenCount;
                        maxEggs=color;
                    }
                    break;
            }
        }
        System.out.printf("Red eggs: %d%n", redCount);
        System.out.printf("Orange eggs: %d%n", orangeCount);
        System.out.printf("Blue eggs: %d%n", blueCount);
        System.out.printf("Green eggs: %d%n", greenCount);
        System.out.printf("Max eggs: %d -> %s", maxCount,maxEggs);
    }
}
