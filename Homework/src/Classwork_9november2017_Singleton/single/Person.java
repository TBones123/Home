package Classwork_9november2017_Singleton.single;

public class Person {
    private String name;
    private int age;
    private static Person singleton;

    private Person() {
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
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public static Person getSingleton(){
        if (singleton==null){
            singleton = new Person();
        }
        return singleton;
    }
}
