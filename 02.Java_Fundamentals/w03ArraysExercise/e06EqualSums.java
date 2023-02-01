package w03ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class e06EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int totalArraySum = 0;
        boolean found = false;

        for (int index = 0; index < numbers.length; index++) {

            totalArraySum += numbers[index];

        }
        int sumLeft = 0;
        int sumRight = 0;
        for (int index = 0; index < numbers.length; index++) {


            if (index == 0) {
                sumRight = totalArraySum - numbers[index];

            } else if (index == numbers.length - 1) {
                sumLeft = totalArraySum - numbers[index];
                sumRight=0;
            } else {
                sumLeft += numbers[index - 1];
                sumRight = totalArraySum - sumLeft - numbers[index];
            }
            if (sumLeft == sumRight) {
                System.out.println(index);
                found=true;
            }

        }
        if(!found) {
            System.out.println("no");
        }
    }
}
