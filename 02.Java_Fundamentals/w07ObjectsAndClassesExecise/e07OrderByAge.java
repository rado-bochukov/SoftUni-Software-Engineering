package w07ObjectsAndClassesExecise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class e07OrderByAge {
    static class Person{
        String name;
        String id;
        int age;
        public String getName() {
            return name;
        }
        public String getId() {
            return id;
        }
        public int getAge() {
            return age;
        }
        Person(String name, String id, int age) {

            this.name = name;
            this.id = id;
            this.age = age;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Person> people=new ArrayList<>();

        while(!input.equals("End")){

            String[]info=input.split("\\s+");
            String name = info[0];
            String id = info[1];
            int age = Integer.parseInt(info[2]);

            people.add(new Person(name,id,age));

            input=scanner.nextLine();
        }

        List<Person> sorted=getSortedPeople(people);

        for (Person person : sorted) {
            System.out.printf("%s with ID: %s is %d years old.%n",person.getName(),person.getId(),person.getAge());
        }
    }
    private static List<Person> getSortedPeople(List<Person> people) {
        List<Person> sortedByAge=people;
        sortedByAge.sort(Comparator.comparing(Person::getAge));
        return sortedByAge;
    }
}
