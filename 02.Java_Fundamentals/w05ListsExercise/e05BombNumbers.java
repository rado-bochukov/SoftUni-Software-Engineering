package w05ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class e05BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int[] bombAndPower = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        int specialNumber = bombAndPower[0];
        int power = bombAndPower[1];

        while (numbers.contains(specialNumber)) {
            int indexOfBomb = numbers.indexOf(specialNumber);
            int startIndex = Math.max(0, indexOfBomb - power);
            int endIndex = Math.min(indexOfBomb + power, numbers.size() - 1);
            for (int i = startIndex; i <= endIndex; i++) {
                numbers.remove(startIndex);
            }
        }
        int sum=0;
        for (Integer number : numbers) {
            sum+=number;

        }
        System.out.println(sum);

    }
}
