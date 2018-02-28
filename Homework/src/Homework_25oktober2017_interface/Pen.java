package Homework_25oktober2017_interface;

public class Pen implements Write {
    private String color;
    private String thickness;

    public Pen() {
    }

    public Pen(String color, String thickness) {
        this.color = color;
        this.thickness = thickness;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getThickness() {
        return thickness;
    }

    public void setThickness(String thickness) {
        this.thickness = thickness;
    }
    @Override
    public void toWrite() {
        System.out.println("я беру "+color+ " ручку и провожу "+thickness+" линию");
    }
    @Override
    public String toString() {
        return "Pen{" +
                "color='" + color + '\'' +
                ", thickness='" + thickness + '\'' +
                '}';
    }
}
