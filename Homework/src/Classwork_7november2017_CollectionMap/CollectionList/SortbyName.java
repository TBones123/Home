package Classwork_7november2017_CollectionMap.CollectionList;

import java.util.Comparator;

public class SortbyName implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
