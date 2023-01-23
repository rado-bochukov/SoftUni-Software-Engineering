package exam20and21April2019;

import java.util.Scanner;

public class e03PaintingEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String size = scanner.nextLine();
        String color = scanner.nextLine();
        int packs = Integer.parseInt(scanner.nextLine());

        int income = 0;

        switch (size) {
            case "Large":
                switch (color) {
                    case "Red":
                        income = packs * 16;
                        break;
                    case "Green":
                        income = packs * 12;
                        break;
                    case "Yellow":
                        income = packs * 9;
                        break;
                }
                break;
            case "Medium":
                switch (color) {
                    case "Red":
                        income = packs * 13;
                        break;
                    case "Green":
                        income = packs * 9;
                        break;
                    case "Yellow":
                        income = packs * 7;
                        break;
                }
                break;
            case "Small":
                switch (color) {
                    case "Red":
                        income = packs * 9;
                        break;
                    case "Green":
                        income = packs * 8;
                        break;
                    case "Yellow":
                        income = packs * 5;
                        break;
                }
                break;
        }
        double profit = 0.65*income;
        System.out.printf("%.2f leva.",profit);
    }
}
