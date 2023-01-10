package w03Excersice;

import java.util.Scanner;

public class l03NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flower = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        int budged = Integer.parseInt(scanner.nextLine());

        double cost = 0;

        switch (flower) {

            case "Roses":
                if (count <=80) {
                    cost = count * 5;
                } else {
                    cost = count * 5 - count * 5 * 0.1;
                }
                break;
            case "Dahlias":
                if (count <=90) {
                    cost = count * 3.8;
                } else {
                    cost = count * 3.8 - count * 3.8 * 0.15;
                }
                break;
            case "Tulips":
                if (count <=80) {
                    cost = count * 2.8;
                } else {
                    cost = count * 2.8 - count * 2.8 * 0.15;
                }
                break;
            case "Narcissus":
                if (count >= 120) {
                    cost = count * 3;
                } else {
                    cost = count * 3 + count * 3 * 0.15;
                }
                break;
            case "Gladiolus":
                if (count >= 80) {
                    cost = count * 2.5;
                } else {
                    cost = count * 2.5 + count * 2.5 * 0.2;
                }
                break;
            default:
                cost = 0;


        }
        double difference = Math.abs(cost - budged);

        if (cost == 0) {
            System.out.println("");
        } else if (cost <= budged) {

            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", count, flower, difference);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", difference);
        }
    }
}
