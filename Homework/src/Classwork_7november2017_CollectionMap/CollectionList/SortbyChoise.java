package Classwork_7november2017_CollectionMap.CollectionList;

import java.util.Comparator;

public class SortbyChoise {
    Comparator<Person> sortByChoice(int choice){
        switch (choice){
            case 1:
                return new Comparator<Person>() {
                    @Override
                    public int compare(Person o1, Person o2) {
                        return o1.getAge()-o2.getAge();
                    }
                };
            case 2:
                return new SortbyName();
                default:
                    return new SortbyName();
        }
    }
}
