package Homework_02112017_composition.ex4;

public class Main {
    public static void main(String[] args) {
        Passport passport = new Passport(
                "EH",
                "123123",
                "Lugansl");
        Client client = new Client(
                "Pypkin",
                "Vasya",
                "28/11/91", passport
                );
        Application application1 = new Application(
                123,
                "11/11/2017",
                client);
        System.out.println(application1.getClient().getPassport().getNomer());
    }
}
