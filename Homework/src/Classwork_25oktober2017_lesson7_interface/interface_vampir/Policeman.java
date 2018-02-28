package Classwork_25oktober2017_lesson7_interface.interface_vampir;

public class Policeman implements Vampir {
    private String name;
    private  String department;

    public Policeman(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Policeman{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    @Override
    public void superJump() {
        System.out.println("Прыгнуть");

    }

    @Override
    public void suckBlood() {
        System.out.println("выпить кровь");
    }

    @Override
    public void bite() {
        System.out.println("укусить");
    }

    @Override
    public void fly() {
        System.out.println("лететь");
    }
}
