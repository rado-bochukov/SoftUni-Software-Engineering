package w06MidExamPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class e03MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] streamOfElements = scanner.nextLine().split(" ");
        List<String> elements = new ArrayList<>();

        for (String streamOfElement : streamOfElements) {
            elements.add(streamOfElement);
        }
        String input = scanner.nextLine();
        int moves = 0;
        boolean turnedAll = false;

        while (!input.equals("end")) {
            String[] enteredIndexes = input.split(" ");
            int index1 = Integer.parseInt(enteredIndexes[0]);
            int index2 = Integer.parseInt(enteredIndexes[1]);
            moves++;

            if (!isValidIndexes(index1, index2, elements)) {

                processWrongindexes(elements, moves);

            } else {
                if (elements.get(index1).equals(elements.get(index2))) {
                    processIndexes(elements, index1, index2);
                } else {
                    System.out.println("Try again!");
                }
            }
            if (elements.size() < 2) {
                turnedAll = true;
                break;
            }
            input = scanner.nextLine();
        }
        if (turnedAll) {
            System.out.printf("You have won in %d turns!", moves);

        } else {
            System.out.println("Sorry you lose :(");
            for (String element : elements) {
                System.out.print(element + " ");
            }
        }
    }

    private static void processIndexes(List<String> elements, int index1, int index2) {
        System.out.printf("Congrats! You have found matching elements - %s!%n", elements.get(index1));

        if (index1 > index2) {
            elements.remove(index1);
            elements.remove(index2);
        } else {

            elements.remove(index2);
            elements.remove(index1);
        }
    }

    private static void processWrongindexes(List<String> elements, int moves) {
        elements.add(elements.size() / 2, "-" + moves + "a");
        elements.add(elements.size() / 2, "-" + moves + "a");

        System.out.println("Invalid input! Adding additional elements to the board");
    }

    private static boolean isValidIndexes(int index1, int index2, List<String> input) {
        if (index1 != index2 && index1 >= 0 && index1 < input.size() && index2 >= 0 && index2 < input.size()) {
            return true;
        }
        return false;
    }
}
