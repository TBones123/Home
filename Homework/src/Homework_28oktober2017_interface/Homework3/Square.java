package Homework_28oktober2017_interface.Homework3;

public class Square implements AreaFigur {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public void square() {
        System.out.println("площадь квадрата: " + Math.pow(a, 2));
    }
}
