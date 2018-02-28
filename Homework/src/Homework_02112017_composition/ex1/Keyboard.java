package Homework_02112017_composition.ex1;

public class Keyboard {
    private String name;

    public Keyboard(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "name='" + name + '\'' +
                '}';
    }
}
