package w05ListsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class e01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagonsWithPassengers = nextLineOfInt(scanner);
        int capacity = Integer.parseInt(scanner.nextLine());

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            String[] update = input.split(" ");
            if (update[0].equals("Add")) {
                wagonsWithPassengers.add(Integer.parseInt(update[1]));
            } else {
                int newPassengers = Integer.parseInt(update[0]);
                for (int i = 0; i < wagonsWithPassengers.size(); i++) {
                    if (wagonsWithPassengers.get(i) + newPassengers <= capacity) {
                        wagonsWithPassengers.set(i, wagonsWithPassengers.get(i) + newPassengers);
                        break;

                    }
                }
            }
        }
        for (Integer passenger : wagonsWithPassengers) {
            System.out.print(passenger + " ");
        }
    }

    private static List<Integer> nextLineOfInt(Scanner scanner) {
        List<Integer> numbers = new ArrayList<>();
        String input = scanner.nextLine();
        String[] arrayAsString = input.split(" ");
        for (String s : arrayAsString) {
            numbers.add(Integer.parseInt(s));
        }
        return numbers;
    }
}
