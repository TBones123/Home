package Homework_28oktober2017_interface.Homework3;

public class Triangle implements AreaFigur{
    private double a;
    private double b;

    public Triangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public void square() {
        System.out.println("Площадь прямоугольного треугольника: " + (0.5*(a*b)));
    }
}
