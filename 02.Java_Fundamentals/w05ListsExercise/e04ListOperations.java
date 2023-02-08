package w05ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class e04ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> initialArray = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        while (true) {

            String[] action = scanner.nextLine().split("\\s+");
            if (action[0].equals("End")) {
                break;
            }
            switch (action[0]) {
                case "Add":
                    Integer numToAdd = Integer.parseInt(action[1]);
                    initialArray.add(numToAdd);
                    break;
                case "Insert":
                    int numToInsert = Integer.parseInt(action[1]);
                    int indexToInsert = Integer.parseInt(action[2]);
                    if (indexToInsert < 0 || indexToInsert > initialArray.size() - 1) {
                        System.out.println("Invalid index");
                    } else {
                        initialArray.add(indexToInsert, numToInsert);
                    }
                    break;
                case "Remove":
                    int indexToRemove = Integer.parseInt(action[1]);
                    if (indexToRemove < 0 || indexToRemove > initialArray.size() - 1) {
                        System.out.println("Invalid index");
                    } else {
                        initialArray.remove(indexToRemove);
                    }
                    break;
                case "Shift":
                    if (action[1].equals("left")) {
                        int countLeft = Integer.parseInt(action[2]);
                        for (int i = 0; i < countLeft; i++) {
                            Integer x = initialArray.get(0);
                            initialArray.add(x);
                            initialArray.remove(0);
                        }
                    } else if (action[1].equals("right")) {
                        int countRight = Integer.parseInt(action[2]);
                        for (int i = 0; i < countRight; i++) {
                            Integer y = initialArray.get(initialArray.size() - 1);
                            initialArray.add(0, y);
                            initialArray.remove(initialArray.size() - 1);
                        }
                    }
                    break;
            }
        }
        for (Integer integer : initialArray) {
            System.out.print(integer + " ");
        }

    }
}
