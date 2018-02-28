package Homework_231017_extended;

public class Laptop extends Desktop {
    private String touchPud;

    public Laptop(String cpu, String ozu, String powerSupply, String HDD, String motherBoard, String videoCard, String systemUnit, String touchPud) {
        super(cpu, ozu, powerSupply, HDD, motherBoard, videoCard, systemUnit);
        this.touchPud = touchPud;
    }

    public String getTouchPud() {
        return touchPud;
    }

    public void setTouchPud(String touchPud) {
        this.touchPud = touchPud;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "touchPud='" + touchPud + '\'' +
                "} " + super.toString();
    }
}

