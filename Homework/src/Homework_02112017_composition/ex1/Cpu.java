package Homework_02112017_composition.ex1;

public class Cpu {
    private String name;
    private int gb;

    public Cpu(String name, int gb) {
        this.name = name;
        this.gb = gb;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGb() {
        return gb;
    }

    public void setGb(int gb) {
        this.gb = gb;
    }

    @Override
    public String toString() {
        return "Cpu{" +
                "name='" + name + '\'' +
                ", gb=" + gb +
                '}';
    }
}
