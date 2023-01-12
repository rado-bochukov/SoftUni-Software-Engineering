package w05Excersise;

import java.util.Scanner;

public class e05Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double change = Double.parseDouble(scanner.nextLine());


        double coins = change*100;

        int totalCoins = 0;

        while (coins != 0) {

            if (coins >=200) {
                totalCoins++;
                coins -=200;

            } else if (coins >= 100) {
                totalCoins++;
                coins -=100;

            } else if (coins >= 50) {
                totalCoins++;
                coins -=50;

            } else if (coins >= 20) {
                totalCoins++;
                coins -=20;

            } else if (coins >= 10) {
                totalCoins++;
                coins -=10;

            } else if (coins >= 5) {
                totalCoins++;
                coins -=5;

            } else if (coins >= 2) {
                totalCoins++;
                coins -=2;

            } else if(coins >=1) {
                totalCoins++;
                coins -=1;

            }else {
                break;
            }

        }
        System.out.println(totalCoins);
    }
}

