package Classwork_25oktober2017_lesson7_interface;

public class HunterKnife implements Knife {
    private int lenght;
    private double weight;
    private String handle;

    public HunterKnife() {
    }

    public HunterKnife(int lenght, double weight, String handle) {
        this.lenght = lenght;
        this.weight = weight;
        this.handle = handle;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }
    @Override
    public void cut() {
        System.out.println("я беру "+ handle + " нож длинной " + lenght + " его вес " + weight + " граммов");
    }
    @Override
    public String toString() {
        return "HunterKnife{" +
                "lenght=" + lenght +
                ", weight=" + weight +
                ", handle='" + handle + '\'' +
                '}';
    }
}
