package w03ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class e07MaxSequenceOfEqualsElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int longestSeq = 0;
        int currentSeq = 1;
        int digit = 0;

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] == numbers[i - 1]) {
                currentSeq++;

                if (currentSeq > longestSeq) {
                    longestSeq = currentSeq;
                    digit = numbers[i];
                }
            } else {
                currentSeq = 1;
            }
        }
        for (int i = 0; i < longestSeq; i++) {

            System.out.print(digit + " ");
        }
    }
}

