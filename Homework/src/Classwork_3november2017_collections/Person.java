package Classwork_3november2017_collections;

import java.util.Objects;

public class Person implements Comparable<Person> {
    private int id;
    private  String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


//    public boolean equals(Object obj) {
//        Person person = (Person) obj;
//        if (this.id == person.id){
//            return true;
//
//        }
//        return false;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }

    @Override
    public int compareTo(Person o) {
//        int res = this.id - o.id;
        int res = this.name.compareTo(o.name);
        return res;
    }
}
