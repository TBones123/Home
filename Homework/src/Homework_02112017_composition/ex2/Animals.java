package Homework_02112017_composition.ex2;

public class Animals {
    private String name;
    private int age;

    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public static void ddstartVoice(){
        System.out.println("Gav Gav");
    }
    }

