package w05ListsExercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class e08Anonymous {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> initialLines = new ArrayList<>();

        String[] lines = scanner.nextLine().split("\\s+");
        for (String line : lines) {
            initialLines.add(line);
        }
        while (true) {
            String input = scanner.nextLine();

            if (input.equals("3:1")) {
                break;
            }
            String[] action = input.split("\\s+");

            switch (action[0]) {
                case "merge":
                    int startIndex = Math.max(0, Integer.parseInt(action[1]));
                    int endIndex = Math.min(Integer.parseInt(action[2]), initialLines.size() - 1);
                    String mergedIndexes = "";
                    for (int i = startIndex; i <= endIndex; i++) {
                        mergedIndexes += "" + initialLines.get(startIndex);
                        if (i == endIndex) {
                            initialLines.set(startIndex, mergedIndexes);
                            break;
                        }
                        initialLines.remove(startIndex);
                    }
                    break;
                case "divide":
                    int index = Integer.parseInt(action[1]);
                    int partitions = Integer.parseInt(action[2]);
                    String indexAsArray = initialLines.get(index);
                    List<String> sublist = new ArrayList<>();
                    int symbols = indexAsArray.length() / partitions;

                    if (indexAsArray.length() % partitions == 0) {

                        for (int i = 0; i < partitions; i++) {
                            sublist.add(indexAsArray.substring(0, symbols));
                            indexAsArray = indexAsArray.substring(symbols);
                        }
                    } else {
                        for (int i = 0; i < partitions; i++) {
                            if (i == partitions - 1) {
                                sublist.add(indexAsArray);
                            } else {
                                sublist.add(indexAsArray.substring(0, symbols));
                                indexAsArray = indexAsArray.substring(symbols);
                            }
                        }
                    }
                    initialLines.remove(index);
                    initialLines.addAll(index, sublist);
                    break;
            }
        }
        for (String s : initialLines) {
            System.out.print(s + " ");
        }
    }
}
