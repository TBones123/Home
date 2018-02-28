package Homework_3november2017_collections.ex1;

public class Kuzov {
    private String colorKuzov;

    public Kuzov() {
    }

    public Kuzov(String colorKuzov) {
        this.colorKuzov = colorKuzov;
    }

    public String getColorKuzov() {
        return colorKuzov;
    }

    public void setColorKuzov(String colorKuzov) {
        this.colorKuzov = colorKuzov;
    }

    @Override
    public String toString() {
        return "Kuzov{" +
                "colorKuzov='" + colorKuzov + '\'' +
                '}';
    }
}
