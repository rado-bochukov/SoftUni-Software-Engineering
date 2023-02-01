package w03ArraysExercise;

import java.util.Scanner;

public class e10LadyBug {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fieldSize = Integer.parseInt(scanner.nextLine());


        int[] initialField = new int[fieldSize];


        String indexesInitial = scanner.nextLine();
        String[] positions = indexesInitial.split("\\s+");
        int[] positionsIn = new int[positions.length];

        for (int i = 0; i < positions.length; i++) {
            positionsIn[i] = Integer.parseInt(positions[i]);

            if (positionsIn[i] < fieldSize && positionsIn[i]>=0) {
                initialField[positionsIn[i]] = 1;
            }

        }

        String input = scanner.nextLine();

        while (!input.equals("end")) {

            String[] move = input.split("\\s+");

            int lbIndex = Integer.parseInt(move[0]);
            String direction = move[1];
            int length = Integer.parseInt(move[2]);

            if (lbIndex < 0 || lbIndex >= initialField.length || initialField[lbIndex] !=1) {
                input = scanner.nextLine();
                continue;

            } else {
                int currentIndex = 0;
                switch (direction) {
                    case "right":
                        initialField[lbIndex] = 0;
                        currentIndex=lbIndex+length;
                        while (currentIndex<initialField.length&&currentIndex>=0){
                            if (initialField[currentIndex] == 0) {
                                initialField[currentIndex] = 1;
                                break;
                            } else {
                                currentIndex+=length;
                                continue;
                            }
                        }
                        break;
                    case "left":
                        initialField[lbIndex] = 0;
                        currentIndex=lbIndex-length;
                        while (currentIndex<initialField.length&&currentIndex>=0){
                            if (initialField[currentIndex] == 0) {
                                initialField[currentIndex] = 1;
                                break;
                            } else {
                                currentIndex-=length;
                                continue;
                            }
                        }
                        break;
                }
            }
            input=scanner.nextLine();
        }
        for (int i = 0; i < initialField.length; i++) {

            System.out.print(initialField[i]+" ");
        }
    }
}
