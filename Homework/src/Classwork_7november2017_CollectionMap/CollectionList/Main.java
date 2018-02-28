package Classwork_7november2017_CollectionMap.CollectionList;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        ArrayList<String> strings = new ArrayList<>();
//        strings.add("one");
//        strings.add("three");
//        strings.add("two");
//        strings.add("five");
//        strings.add("four");
//        Collections.sort(strings);
//        System.out.println(strings);
//
//
//
//        ArrayList<Person> people = new ArrayList<>();
//        people.add(new Person("Vova", 10));
//        people.add(new Person("Petja", 20));
//        people.add(new Person("Misha", 15));


//        Collections.sort(people);



//        Collections.sort(people, new SortbyName());
//        System.out.println(people);
//        people.sort(new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge()-o2.getAge();
//            }
//        });
//        System.out.println(people);
//people.sort(new SortbyChoise().sortByChoice(1));
//        System.out.println(people);




//                                  лямда
//        people.sort(((o1, o2) -> o1.getName().compareTo(o2.getName())));
//        System.out.println(people);





        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Vova", 10));
        people.add(new Person("Petja", 20));
        people.add(new Person("Misha", 15));
        people.add(new Person("Kiril", 5));
//        System.out.println(people);
//        for (Person person : people) {
//            System.out.println(person);
//        }




//        Iterator<Person> iterator = people.iterator();
//        while (iterator.hasNext()) {
//            Person person = iterator.next();
//            System.out.println(person);
//            if (person.getName().equals("Misha")){
//                iterator.remove();
//            }
//        }
//        System.out.println(people);







        ListIterator<Person>listIterator = people.listIterator();
        while (listIterator.hasNext()) {
            Person person = listIterator.next();
        }
        System.out.println();
        listIterator.set(new Person("Koko", 1));
        while (listIterator.hasPrevious()) {
            Person person = listIterator.previous();
            System.out.println(person);
        }






















    }
}
