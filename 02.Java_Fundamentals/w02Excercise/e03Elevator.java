package w02Excercise;

import java.util.Scanner;

public class e03Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        double courses = Math.ceil((people*1.0)/(capacity*1.0));

        System.out.printf("%.0f",courses);

    }
}
