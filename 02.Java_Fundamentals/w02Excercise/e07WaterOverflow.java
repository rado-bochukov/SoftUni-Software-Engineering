package w02Excercise;

import java.util.Scanner;

public class e07WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int litersFilled = 0;

        for (int i = 1; i <=n ; i++) {

            int currentLitres = Integer.parseInt(scanner.nextLine());

            if (litersFilled+currentLitres>255) {
                System.out.println("Insufficient capacity!");
                continue;
            }
            litersFilled+=currentLitres;

        }
        System.out.printf("%d",litersFilled);
    }
}
