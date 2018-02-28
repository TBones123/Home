package Classwork_2030_lesson_collection;

public class Car {
    private String model;
    private int age;
    private String number;
    private String engine;
    private int wheelDiameter;

    public Car(String model, int age, String number, String engine, int wheelDiameter) {
        this.model = model;
        this.age = age;
        this.number = number;
        this.engine = engine;
        this.wheelDiameter = wheelDiameter;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getWheelDiameter() {
        return wheelDiameter;
    }

    public void setWheelDiameter(int wheelDiameter) {
        this.wheelDiameter = wheelDiameter;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", age=" + age +
                ", number='" + number + '\'' +
                ", engine='" + engine + '\'' +
                ", wheelDiameter=" + wheelDiameter +
                '}';
    }
}
