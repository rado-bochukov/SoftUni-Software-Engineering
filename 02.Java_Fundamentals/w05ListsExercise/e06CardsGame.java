package w05ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class e06CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> hand1 = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> hand2 = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        while (true) {
            if (hand1.size() == 0 || hand2.size() == 0) {
                break;
            }
            if (hand1.get(0) > hand2.get(0)) {
                hand1.add(hand1.get(0));
                hand1.add(hand2.get(0));
                hand1.remove(0);
                hand2.remove(0);
            } else if (hand2.get(0) > hand1.get(0)) {
                hand2.add(hand2.get(0));
                hand2.add(hand1.get(0));
                hand2.remove(0);
                hand1.remove(0);
            } else {
                hand2.remove(0);
                hand1.remove(0);
            }
        }
        int sum = 0;

        if (hand1.size() == 0) {
            for (Integer integer : hand2) {
                sum += integer;
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        }else {
            for (Integer integer : hand1) {
                sum+=integer;
            }
            System.out.printf("First player wins! Sum: %d", sum);
        }
    }
}
