package Homework_3november2017_collections.ex1;

public class Wheel {
    public Wheel() {
    }

    private double sizeWheel;

    public Wheel(double sizeWheel) {
        this.sizeWheel = sizeWheel;
    }

    public double getSizeWheel() {
        return sizeWheel;
    }

    public void setSizeWheel(double sizeWheel) {
        this.sizeWheel = sizeWheel;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "sizeWheel=" + sizeWheel +
                '}';
    }
}
