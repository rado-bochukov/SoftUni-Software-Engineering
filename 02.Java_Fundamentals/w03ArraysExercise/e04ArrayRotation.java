package w03ArraysExercise;

import java.util.Scanner;

public class e04ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] flow = scanner.nextLine().split("\\s+");

        int rotationsCount = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= rotationsCount; i++) {
            String[] rotatedFlow = new String[flow.length];
            for (int index = 0; index < flow.length; index++) {

                if (index == flow.length - 1) {
                    rotatedFlow[index] = flow[0];
                } else {
                    rotatedFlow[index] = flow[index + 1];
                }
            }
            flow = rotatedFlow;
        }
        for (int i = 0; i < flow.length; i++) {

            System.out.print(flow[i] + " ");
        }

    }
}

