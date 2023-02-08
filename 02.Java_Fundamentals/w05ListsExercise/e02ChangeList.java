package w05ListsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class e02ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = new ArrayList<>();
        String[] numbers = scanner.nextLine().split(" ");
        for (String num : numbers) {
            numbersList.add(Integer.parseInt(num));
        }

        while (true) {

            String[] action = scanner.nextLine().split(" ");

            if (action[0].equals("end")) {
                break;
            }

            if (action[0].equals("Delete")) {
                Integer numValue = Integer.parseInt(action[1]);

                while (numbersList.indexOf(numValue)!=-1) {

                    numbersList.remove(numValue);
                }
            } else if (action[0].equals("Insert")) {

                int numToAdd = Integer.parseInt(action[1]);
                int indexToAdd = Integer.parseInt(action[2]);
                numbersList.add(indexToAdd, numToAdd);
            }
        }

        for (Integer integer : numbersList) {
            System.out.print(integer+" ");

        }


    }
}
