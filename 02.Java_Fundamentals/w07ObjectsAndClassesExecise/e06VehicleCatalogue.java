package w07ObjectsAndClassesExecise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class e06VehicleCatalogue {

    static class Vehicle {

        private String type;
        private String model;
        private String color;
        private int horsePower;

        public String getType() {
            return type;
        }

        public String getModel() {
            return model;
        }

        public String getColor() {
            return color;
        }

        public int getHorsePower() {
            return horsePower;
        }

        Vehicle(String type, String model, String color, int horsePower) {

            this.type = type;
            this.model = model;
            this.color = color;
            this.horsePower = horsePower;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Vehicle> vehicles = new ArrayList<>();

        while (!input.equals("End")) {

            String[] info = input.split("\\s+");
            String type = info[0];
            String model = info[1];
            String color = info[2];
            int hp = Integer.parseInt(info[3]);

            vehicles.add(new Vehicle(type, model, color, hp));

            input = scanner.nextLine();
        }

        String requestedModel = scanner.nextLine();

        while (!requestedModel.equals("Close the Catalogue")) {

            printRequestedModelInfo(requestedModel, vehicles);

            requestedModel = scanner.nextLine();
        }

        double carsAverageHP = getCarsHP(vehicles);
        double trucksAverageHP = getTrucksHP(vehicles);

        System.out.printf("Cars have average horsepower of: %.2f.%n", carsAverageHP);
        System.out.printf("Trucks have average horsepower of: %.2f.%n", trucksAverageHP);


    }

    private static double getTrucksHP(List<Vehicle> vehicles) {
        double totalHP = 0;
        int truckCounter = 0;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getType().equals("truck")) {
                totalHP += vehicle.getHorsePower();
                truckCounter++;
            }
        }
        if(truckCounter==0){
            return totalHP;
        }
        return totalHP / truckCounter;
    }

    private static double getCarsHP(List<Vehicle> vehicles) {
        double totalHP = 0;
        int carCounter = 0;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getType().equals("car")) {
                totalHP += vehicle.getHorsePower();
                carCounter++;
            }

        }
        if (carCounter==0){
            return totalHP;
        }
        return totalHP / carCounter;

    }

    private static void printRequestedModelInfo(String requestedModel, List<Vehicle> vehicles) {

        for (Vehicle vehicle : vehicles) {
            if (vehicle.getModel().equals(requestedModel)) {
                System.out.println("Type: " + vehicle.getType().substring(0,1).toUpperCase()+vehicle.getType().substring(1).toLowerCase());
                System.out.println("Model: " + vehicle.getModel());
                System.out.println("Color: " + vehicle.getColor());
                System.out.println("Horsepower: " + vehicle.getHorsePower());
            }

        }

    }
}
