package preExam2210;

import java.util.Scanner;

public class e02DeerOfSanta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysOff = Integer.parseInt(scanner.nextLine());
        int foodProvided = Integer.parseInt(scanner.nextLine());
        double foodFirstDeer = Double.parseDouble(scanner.nextLine());
        double foodSecondDeer = Double.parseDouble(scanner.nextLine());
        double foodThirdDeer = Double.parseDouble(scanner.nextLine());

        double totalFoodFirstDeer = foodFirstDeer*daysOff;
        double totalFoodSecondDeer = foodSecondDeer*daysOff;
        double totalFoodThirdDeer = foodThirdDeer*daysOff;

        double totalFoodNeeded = totalFoodFirstDeer+totalFoodSecondDeer+totalFoodThirdDeer;

        if (totalFoodNeeded<=foodProvided) {
            System.out.printf("%.0f kilos of food left.", Math.floor(foodProvided-totalFoodNeeded));
        }else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(totalFoodNeeded-foodProvided));
        }
    }
}
