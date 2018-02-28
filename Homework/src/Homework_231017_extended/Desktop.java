package Homework_231017_extended;

import jdk.jshell.spi.ExecutionControl;

public class Desktop extends PersonalComputer {
    private String monitor;
    private String systemUnit;
    private String mouseKeyboard;

    public Desktop(String cpu, String ozu, String powerSupply, String HDD, String motherBoard, String videoCard, String monitor, String systemUnit, String mouseKeyboard) {
        super(cpu, ozu, powerSupply, HDD, motherBoard, videoCard);
        this.monitor = monitor;
        this.systemUnit = systemUnit;
        this.mouseKeyboard = mouseKeyboard;
    }

    public Desktop(String cpu, String ozu, String powerSupply, String HDD, String motherBoard, String videoCard, String systemUnit) {
        super(cpu, ozu, powerSupply, HDD, motherBoard, videoCard);
        this.systemUnit = systemUnit;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public String getSystemUnit() {
        return systemUnit;
    }

    public void setSystemUnit(String systemUnit) {
        this.systemUnit = systemUnit;
    }

    public String getMouseKeyboard() {
        return mouseKeyboard;
    }

    public void setMouseKeyboard(String mouseKeyboard) {
        this.mouseKeyboard = mouseKeyboard;
    }

    @Override
    public String toString() {
        return "Desktop{" +
                "systemUnit='" + systemUnit + '\'' +
                "} " + super.toString();
    }
}
