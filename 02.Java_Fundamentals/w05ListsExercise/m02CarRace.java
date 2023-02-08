package w05ListsExercise;

import java.util.*;
import java.util.stream.Collectors;

public class m02CarRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> right = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> left = new ArrayList<>();
        left.addAll(right);
        Collections.reverse(right);

        double timeLeft = getTimeToFinish(left);
        double timeRight = getTimeToFinish(right);

        if(timeLeft<=timeRight){
            System.out.printf("The winner is left with total time: %.1f",timeLeft);
        }else {
            System.out.printf("The winner is right with total time: %.1f",timeRight);
        }

    }

    private static double getTimeToFinish(List<Integer> numbers) {
        double time = 0;

        for (int i = 0; i < numbers.size() / 2; i++) {
            if (numbers.get(i) == 0) {
                time *= 0.8;

            } else {
                time += numbers.get(i);
            }
        }
        return time;
    }
}

