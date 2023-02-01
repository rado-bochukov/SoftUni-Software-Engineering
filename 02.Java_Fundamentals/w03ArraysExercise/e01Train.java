package w03ArraysExercise;

import java.util.Scanner;

public class e01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countWagons = Integer.parseInt(scanner.nextLine());

        int [] wagonPassengers = new int[countWagons];
        int sum = 0;
        String arrayPass="";

        for (int i = 0; i <countWagons ; i++) {

            wagonPassengers[i] = Integer.parseInt(scanner.nextLine());
            arrayPass+=wagonPassengers[i]+" ";
            sum+=wagonPassengers[i];

        }
        System.out.println(arrayPass);

        System.out.println(sum);

    }
}
