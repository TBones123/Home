package Homework_25oktober2017_interface;

public class Pencil implements Write {
    private String color;
    private String thickness;

    public Pencil() {
    }

    public Pencil(String color, String thickness) {
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
    public String toString() {
        return "Pencil{" +
                "color='" + color + '\'' +
                ", thickness='" + thickness + '\'' +
                '}';
    }

    @Override
    public void toWrite() {
        System.out.println("я беру "+color+ " карандаш и провожу "+thickness+" линию");
    }
}

