package w02Excercise;

import java.util.Scanner;

public class e11Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int count = Integer.parseInt(scanner.nextLine());

         double currentValue = 0;
         int maxSnowballSnow=0;
         int maxSnowballTime=0;
         int maxSnowballQuality=0;
         double maxValue=0;

        for (int i = 1; i <=count ; i++) {

            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            currentValue=Math.pow((snowballSnow/snowballTime),snowballQuality);

            if (currentValue>maxValue) {
                maxSnowballSnow=snowballSnow;
                maxSnowballQuality=snowballQuality;
                maxSnowballTime=snowballTime;
                maxValue=currentValue;
            }

        }
        System.out.printf("%d : %d = %.0f (%d)",maxSnowballSnow,maxSnowballTime,maxValue,maxSnowballQuality);
    }
}
