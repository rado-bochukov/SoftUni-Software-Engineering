package preExam2210;

import java.util.Scanner;

public class e01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int percentFats = Integer.parseInt(scanner.nextLine());
        int percentProteins = Integer.parseInt(scanner.nextLine());
        int percentCarbs = Integer.parseInt(scanner.nextLine());
        int totalCalories = Integer.parseInt(scanner.nextLine());
        int percentWater = Integer.parseInt(scanner.nextLine());

        double fatsGrams = (percentFats * totalCalories / 100.0) / 9;
        double proteinGrams = (percentProteins * totalCalories / 100.0) / 4;
        double carbsGrams = (percentCarbs * totalCalories / 100.0) / 4;

        double weightFood = fatsGrams + proteinGrams + carbsGrams;

        double caloriesPerGram = totalCalories / weightFood;
        double totalCaloriesFood = caloriesPerGram - (caloriesPerGram * percentWater / 100);

        System.out.printf("%.4f", totalCaloriesFood);

    }
}
