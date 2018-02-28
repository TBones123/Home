package Classwork_25oktober2017_lesson7_interface;

public class KitchenKnife implements Knife {
    private int lenght;
    private double weight;
    private String type;

    public KitchenKnife() {
    }

    public KitchenKnife(int lenght, double weight, String type) {
        this.lenght = lenght;
        this.weight = weight;
        this.type = type;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "KitchenKnife{" +
                "lenght=" + lenght +
                ", weight=" + weight +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public void cut() {
        System.out.println("я беру "+ type + " нож длинной " + lenght + " его вес " + weight + " граммов");
    }
}
