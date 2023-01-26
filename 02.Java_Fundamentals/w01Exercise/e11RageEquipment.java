package w01Exercise;

import java.util.Scanner;

public class e11RageEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        double sumTrashedHeadset = 0;
        int counterTrashedHeadset = 0;

        double sumTrashedMouse = 0;
        int counterTrashedMouse = 0;

        double sumTrashedKeyboard = 0;
        int counterTrashedKeyboard = 0;

        double sumTrashedDisplay = 0;

        for (int i = 1; i <= lostGames; i++) {

            if (i % 2 == 0) {
                sumTrashedHeadset += headsetPrice;
                counterTrashedHeadset++;
            }
            if (i % 3 == 0) {
                sumTrashedMouse += mousePrice;
                counterTrashedMouse++;
            }
            if (i % 6 == 0) {
                sumTrashedKeyboard += keyboardPrice;
                counterTrashedKeyboard++;
            }
            if (i % 12 == 0) {
                sumTrashedDisplay += displayPrice;
            }
        }
        double totalLoss = sumTrashedHeadset + sumTrashedMouse + sumTrashedKeyboard + sumTrashedDisplay;

        System.out.printf("Rage expenses: %.2f lv.", totalLoss);

    }
}
