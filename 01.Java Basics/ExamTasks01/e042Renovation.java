package ExamTasks01;

import java.util.Scanner;

public class e042Renovation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int percentNotIncluded = Integer.parseInt(scanner.nextLine());


        double totalArea = height * width * 4;
        double areaForPainting = Math.ceil(totalArea - (percentNotIncluded * totalArea / 100));
        double paintedArea = 0;
        boolean done = false;

        String input = scanner.nextLine();

        while (!input.equals("Tired!")) {

            int litresPaint = Integer.parseInt(input);

            paintedArea += litresPaint;

            if (paintedArea > areaForPainting) {
                System.out.printf("All walls are painted and you have %.0f l paint left!", Math.abs(paintedArea - areaForPainting));
                done=true;
                break;
            } else if (paintedArea == areaForPainting) {
                System.out.println("All walls are painted! Great job, Pesho!");
                done=true;
                break;
            }

            input = scanner.nextLine();
        }

        if(!done) {
            System.out.printf("%.0f quadratic m left.",areaForPainting-paintedArea);
        }
    }
}
