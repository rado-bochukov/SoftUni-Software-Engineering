package w03ArraysExercise;

import java.util.Scanner;

public class e03ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        String[] array1 = new String[lines];
        String[] array2 = new String[lines];

        for (int i = 1; i <= lines; i++) {

            String currentFlow = scanner.nextLine();
            String[] currentNums = currentFlow.split("\\s+");

            if (i % 2 != 0) {
                array1[i - 1] = currentNums[0];
                array2[i - 1] = currentNums[1];

            } else {
                array2[i - 1] = currentNums[0];
                array1[i - 1] = currentNums[1];
            }
        }
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        for (int j = 0; j < array2.length; j++) {
            System.out.print(array2[j] + " ");

        }
    }
}
