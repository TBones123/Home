package Head_first_java.Homework_2030_collection;

import jdk.jfr.DataAmount;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZooClub {
    Map<List<Person>, List<PetClub>> personListMap = new HashMap<>();
    ArrayList<PetClub> petClubs = new ArrayList<>();
    ArrayList<Person> people = new ArrayList<>();

    public ZooClub() {
        this.zooclub_seed();
    }

    public void zooclub_seed() {
        personListMap.put(people, petClubs);
    }
//===========================
    public Person createPerson1(String name) {
        Person person = new Person(name);
        personListMap.put(people, petClubs);
        return person;
    }
    public Person createPerson(String name) {
        Person person = new Person(name);
        people.add(person);
        return person;
    }

    public PetClub createPetclub(String namePets) {
        PetClub petClub = new PetClub(namePets);
        petClubs.add(petClub);
        return petClub;
    }

//    public ZooClub(Map<Person, List<PetClub>> personListMap) {
//        this.personListMap = personListMap;
//    }
}
