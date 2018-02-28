package Classwork_9november2017_Singleton.single;

public class Main {
    public static void main(String[] args) {
        Person person = Person.getSingleton();
        person.setName("oleg");
        person.setAge(24);
        System.out.println(person);
        Person person1 = Person.getSingleton();
        System.out.println(person1);
    }
}
