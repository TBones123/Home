package Classwork_25oktober2017_lesson7_interface.interface_vampir;

public class Main {
    public static void main(String[] args) {
        Vampir vampir = new Student("vasya", "202a");
        vampir.bite();
        Policeman policeman = new Policeman("Vasiliy", "303");
        System.out.println(policeman);
        Policeman policeman2 = new Policeman("Kolya", "304");
        System.out.println(policeman2);

    }
}
