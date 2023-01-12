package w05Excersise;

import java.util.Scanner;

public class e07Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sideA = Integer.parseInt(scanner.nextLine());
        int sideB = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int totalVolume = sideA * sideB * height;

        boolean isThereMoreBoxes = true;

        while (totalVolume > 0) {
            String input = scanner.nextLine();

            if (input.equals("Done")) {
                isThereMoreBoxes = false;
                break;
            }
            int boxesVolume = Integer.parseInt(input);

            totalVolume -= boxesVolume;
        }
        if (isThereMoreBoxes) {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(totalVolume));
        } else {
            System.out.printf("%d Cubic meters left.", totalVolume);
        }
    }
}
