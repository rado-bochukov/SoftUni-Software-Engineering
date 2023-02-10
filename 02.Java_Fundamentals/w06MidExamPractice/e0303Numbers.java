package w06MidExamPractice;

import java.util.*;
import java.util.stream.Collectors;

public class e0303Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int sumOfNumbers = 0;
        double averageNumber = 0;

        for (Integer number : numbers) {
            sumOfNumbers += number;
        }
        averageNumber = 1.0 * sumOfNumbers / numbers.size();
        List<Integer> greaterNums = new ArrayList<>();
        Integer currentValue = 0;

        for (int i = 0; i < numbers.size(); i++) {
            currentValue = numbers.get(i);

            if (currentValue > averageNumber) {
                greaterNums.add(currentValue);
            }
        }
        if (greaterNums.size() == 0) {
            System.out.println("No");
        }

        Collections.sort(greaterNums);
        Collections.reverse(greaterNums);

        for (int i = 0; i < Math.min(5, greaterNums.size()); i++) {
            System.out.print(greaterNums.get(i) + " ");
        }

    }
}
