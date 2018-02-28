package Classwork_3november2017_collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(new Integer(10));
        list.add(new Integer(-10));
        list.add(new Integer(110));
        list.add(new Integer(310));
        list.add(new Integer(30));
        System.out.println(list);
        System.out.println(list.get(1));
        list.size();
        List<Integer> objects = Arrays.asList(10, -10);
        boolean b = list.containsAll(objects);
        System.out.println(b);
        list.addAll( 1 ,objects);
//        System.out.println(list);
//        list.remove(5);
//        System.out.println(list);
//        System.out.println(list);
//        list.remove(new Integer(10));
        System.out.println("+++++");
        int i = list.lastIndexOf(list);
        System.out.println(i);
        System.out.println("++++");
        boolean empty = list.isEmpty();
        System.out.println(empty);
        Integer set = list.set(1, 2000);
        System.out.println(list);
        List<Integer> list1 = list.subList(0, 4);
        System.out.println(list1);
//
//        -----------------------------
        List<Integer>integers= new LinkedList<>();
        integers.addAll(list);
//
//
// ----------------------------------------------------
//        Set<String> strings = new HashSet<>();
        Set<String> strings = new LinkedHashSet<>();
        strings.add("hello");
        strings.add("world");
        strings.add("oktenwtb");
        strings.add("owu.com.ua");
        strings.add("owu.com.ua");
        System.out.println(strings);
//        System.out.println(strings);
//        for (String string : strings) {
//            System.out.println(strings.hashCode());
//        }
//        Iterator<String> iterator = strings.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next().hashCode() == 1231);
//        }
// HashSet<Person> people = new HashSet<>();
//        LinkedHashSet<Person> people = new LinkedHashSet<>();
        TreeSet<Person> people = new TreeSet<>();
        Person vasya = new Person(1, "Vasya");
        Person kolya = new Person(3, "Kolya");
        Person kolya3 = new Person(2, "andriy");
        people.add(vasya);
        people.add(kolya);
        people.add(kolya3);
        System.out.println(people);


    }
}
