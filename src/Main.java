import java.util.Comparator;
import java.util.LinkedList;

import static java.util.Comparator.comparing;

/**
 * Created by EternalEtulf on 7/3/2017.
 */

public class Main {

    private static LinkedList peopleList;

    public static void main(String[] args) {
        peopleList = startUp();
        SortingPeopleForAgeLikeOldDays((LinkedList<People>) peopleList.clone());
        SortingPeopleForAgeWithJava8((LinkedList<People>) peopleList.clone());
        PrintingPeopleWithLikeOldDays((LinkedList<People>) peopleList.clone());
        PrintingPeopleWithJava8((LinkedList<People>) peopleList.clone());
    }


    private static void PrintingPeopleWithJava8(LinkedList<People> people) {
        people.forEach(System.out::println);
    }

    private static void PrintingPeopleWithLikeOldDays(LinkedList<People> people) {
        for(People p : people){
            System.out.println(p.toString());
        }
    }

    private static void SortingPeopleForAgeLikeOldDays(LinkedList<People> people) {
        people.sort(new Comparator<People>() {
            @Override
            public int compare(People o1, People o2) {
                return o1.getAge() - o2.getAge();
            }
        });

    }

    private static void SortingPeopleForAgeWithJava8(LinkedList<People> people){
        people.sort(comparing(People::getAge));

    }

    private static LinkedList startUp() {
        peopleList = new LinkedList<>();
        peopleList.add(new People("Pedro", 15, 'M'));
        peopleList.add(new People("Natalia", 33, 'F'));
        peopleList.add(new People("Mauricio", 23, 'M'));
        peopleList.add(new People("Alice", 24, 'F'));
        peopleList.add(new People("Henry", 26, 'M'));
        peopleList.add(new People("Christina", 43, 'F'));
        peopleList.add(new People("Julieta", 53, 'F'));
        peopleList.add(new People("Patricia", 27, 'F'));
        peopleList.add(new People("Richard", 19, 'M'));
        peopleList.add(new People("Kristian", 13, 'M'));
        peopleList.add(new People("Alejandro", 28, 'M'));
        peopleList.add(new People("Camilo", 24, 'M'));
        return peopleList;
    }
}


