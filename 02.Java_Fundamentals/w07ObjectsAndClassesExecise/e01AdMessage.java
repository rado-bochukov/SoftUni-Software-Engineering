package w07ObjectsAndClassesExecise;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class e01AdMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count=Integer.parseInt(scanner.nextLine());

        List<String>phrases=new ArrayList<>();

        phrases.add("Excellent product.");
        phrases.add("Such a great product.");
        phrases.add("Best product of its category.");
        phrases.add("Exceptional product.");
        phrases.add("I can’t live without this product.");

        List<String>events=new ArrayList<>();

        events.add("Now I feel good.");
        events.add("I have succeeded with this product.");
        events.add("Makes miracles. I am happy of the results!");
        events.add("I cannot believe but now I feel awesome.");
        events.add("Try it yourself, I am very satisfied.");
        events.add("I feel great!");

        List<String>authors=new ArrayList<>();

        authors.add("Diana");
        authors.add("Petya");
        authors.add("Stella");
        authors.add("Elena");
        authors.add("Katya");
        authors.add("Iva");
        authors.add("Annie");
        authors.add("Eva");

        List<String>cities=new ArrayList<>();

        cities.add("Burgas");
        cities.add("Sofia");
        cities.add("Plovdiv");
        cities.add("Varna");
        cities.add("Ruse");


        for (int i = 0; i <count ; i++) {

            printAdMessage(phrases,events,authors,cities);

        }
    }

    private static void printAdMessage(List<String> phrases, List<String> events, List<String> authors, List<String> cities) {

        List<String>message=new ArrayList<>();

        Random rnd = new Random();

        message.add(phrases.get(rnd.nextInt(phrases.size())));
        message.add(events.get(rnd.nextInt(events.size())));
        message.add(authors.get(rnd.nextInt(authors.size())));
        message.add(cities.get(rnd.nextInt(cities.size())));

        System.out.printf("%s %s %s - %s.%n",message.get(0),message.get(1),message.get(2),message.get(3));
    }
}
