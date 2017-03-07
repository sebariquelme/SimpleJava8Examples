import java.util.*;

/**
 * Created by EternalEtulf on 7/3/2017.
 */

public class Main {

    private static List<Person> peopleList;

    public static void main(String[] args) {
        startUp();
        sortingPeopleForAgeLikeOldDays(peopleList);
        sortingPeopleForAgeWithJava8(peopleList);
        printingPeopleWithLikeOldDays(peopleList);
        printingPeopleWithJava8(peopleList);
        filterPeopleOver21YearsLikeOldDays(peopleList);
        filterPeopleOver21YearsWithJava8(peopleList);
    }

    private static void filterPeopleOver21YearsWithJava8(List<Person> people) {
        people.stream()
                .filter(p -> p.getAge() > 21)
                .forEach(System.out::println);
    }

    private static void filterPeopleOver21YearsLikeOldDays(List<Person> people) {
        List<Person> filtered = new LinkedList<>();
        for (Person p : people) {
            if (p.getAge() > 21) {
                filtered.add(p);
            }
        }
        for (Person p : filtered) {
            System.out.println(p.toString());
        }
    }

    private static void sumPeopleAge(List<Person> people) {
        System.out.println(people.stream()
                .mapToInt(Person::getAge)
                .sum());
    }

    private static void printingPeopleWithJava8(List<Person> people) {
        people.forEach(person -> System.out.println(person.getName()));
    }

    private static void printingPeopleWithLikeOldDays(List<Person> people) {
        for (Person p : people) {
            System.out.println(p.toString());
        }
    }

    private static void sortingPeopleForAgeWithJava8(List<Person> people) {
        people.sort(Comparator.comparingInt(Person::getAge));
    }

    private static void sortingPeopleForAgeLikeOldDays(List<Person> people) {
        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });
    }

    private static void startUp() {
        peopleList = new ArrayList<>();
        peopleList.add(new Person("Pedro", 15));
        peopleList.add(new Person("Natalia", 33));
        peopleList.add(new Person("Mauricio", 23));
        peopleList.add(new Person("Alice", 24));
        peopleList.add(new Person("Henry", 26));
        peopleList.add(new Person("Christina", 43));
        peopleList.add(new Person("Julieta", 53));
        peopleList.add(new Person("Patricia", 27));
        peopleList.add(new Person("Richard", 19));
        peopleList.add(new Person("Kristian", 13));
        peopleList.add(new Person("Alejandro", 28));
        peopleList.add(new Person("Camilo", 24));
    }
}


