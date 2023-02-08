package w05ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class e09Pokemon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
            int sumRemoved = 0;

        while (numbers.size() > 0) {
            int index = Integer.parseInt(scanner.nextLine());
            int firstLast = 0;

            if (index < 0) {
                firstLast = numbers.get(0);
                sumRemoved += numbers.get(0);
                numbers.set(0, numbers.get(numbers.size() - 1));
                for (int i = 0; i < numbers.size(); i++) {

                    if (numbers.get(i) <= firstLast) {
                        numbers.set(i, numbers.get(i) + firstLast);
                    } else {
                        numbers.set(i, numbers.get(i) - firstLast);
                    }
                }
            } else if (index > numbers.size() - 1) {
                firstLast = numbers.get(numbers.size() - 1);
                sumRemoved += numbers.get(numbers.size() - 1);
                numbers.set(numbers.size() - 1, numbers.get(0));
                for (int i = 0; i < numbers.size(); i++) {

                    if (numbers.get(i) <= firstLast) {
                        numbers.set(i, numbers.get(i) + firstLast);
                    } else {
                        numbers.set(i, numbers.get(i) - firstLast);
                    }
                }

            } else {
                int valueOfIndex=numbers.get(index);
                sumRemoved += numbers.get(index);
                numbers.remove(index);
                for (int i = 0; i < numbers.size(); i++) {

                    if (numbers.get(i) <= valueOfIndex) {
                        numbers.set(i, numbers.get(i) + valueOfIndex);
                    } else {
                        numbers.set(i, numbers.get(i) - valueOfIndex);
                    }
                }
            }
        }
        System.out.println(sumRemoved);

    }
}
