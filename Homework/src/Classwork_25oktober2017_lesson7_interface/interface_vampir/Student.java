package Classwork_25oktober2017_lesson7_interface.interface_vampir;

public class Student implements Vampir{
    private String name;
    private String groupe;

    public Student(String name, String groupe) {
        this.name = name;
        this.groupe = groupe;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", groupe='" + groupe + '\'' +
                '}';
    }
    @Override
    public void superJump() {
        System.out.println("Прыгнуть"+groupe);

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
