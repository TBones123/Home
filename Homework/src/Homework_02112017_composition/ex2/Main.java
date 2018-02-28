package Homework_02112017_composition.ex2;
public class Main {
    public static void main(String[] args) {
        Mail mail = new Mail("Andrey", "415286");
        Animals animals = new Animals("Sara", 3);
        Persons persons = new Persons("Vasya", "Petkin", 28, mail, animals);
        System.out.println(persons);
        System.out.println(mail);
        persons.ddstartMeVoice();
        persons.startMailMe();
    }
}
