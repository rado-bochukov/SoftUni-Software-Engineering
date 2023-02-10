package w06MidExamPractice;

import java.util.Scanner;

public class e02TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int queue = Integer.parseInt(scanner.nextLine());

        String[] currentStateLiftAsString = scanner.nextLine().split(" ");
        int[] currentStateLift = new int[currentStateLiftAsString.length];

        for (int i = 0; i < currentStateLiftAsString.length; i++) {
            currentStateLift[i] = Integer.parseInt(currentStateLiftAsString[i]);
        }
        boolean isFull = false;
        while (queue > 0) {
            if (isFull) {
                break;
            }
            int currentWagonCapacity = 0;

            for (int i = 0; i < currentStateLift.length; i++) {
                currentWagonCapacity = 4 - currentStateLift[i];
                if (queue < currentWagonCapacity) {
                    currentStateLift[i] += queue;
                    queue = 0;
                    break;
                }
                currentStateLift[i] = 4;
                queue -= currentWagonCapacity;

                if (i == currentStateLift.length - 1) {
                    isFull = true;
                    break;
                }
            }
            if(isFull&&queue==0) {
                for (int i : currentStateLift) {
                    System.out.print(i + " ");
                }
                return;
            }
        }

        if (isFull) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", queue);
            for (int i : currentStateLift) {
                System.out.print(i + " ");
            }
        }
        else{
            System.out.printf("The lift has empty spots!%n");
            for (int i : currentStateLift) {
                System.out.print(i + " ");
            }
        }
    }
}
