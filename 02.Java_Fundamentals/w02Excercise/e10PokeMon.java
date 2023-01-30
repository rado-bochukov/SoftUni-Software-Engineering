package w02Excercise;

import java.util.Scanner;

public class e10PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePowerN = Integer.parseInt(scanner.nextLine());
        int distanceM = Integer.parseInt(scanner.nextLine());
        int exhaustionY = Integer.parseInt(scanner.nextLine());

        int pokeCounter=0;
        int currentPower=pokePowerN;

        while (currentPower>=distanceM) {
            currentPower-=distanceM;
            pokeCounter++;

            if (pokePowerN/2==currentPower && exhaustionY!=0) {
                currentPower/=exhaustionY;
            }
        }
        System.out.println(currentPower);
        System.out.println(pokeCounter);
    }
}
