package Classwork_30oktober2017_Agregation_composition.House;

import java.util.Arrays;

public class Flat {
    private int number;
    private Person[] person;

    public Flat(int number, Person[] person) {
        this.number = number;
        this.person = person;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Person[] getPerson() {
        return person;
    }

    public void setPerson(Person[] person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "number=" + number +
                ", person=" + Arrays.toString(person) +
                '}';
    }
}
