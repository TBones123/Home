package Homework_02112017_composition.ex1;

import java.util.Arrays;

public class PC {
   private Keyboard keyboard;
   private Mouse mouse;
   private SystemUnit systemUnit;

    public PC(Keyboard keyboard, Mouse mouse, SystemUnit systemUnit) {
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.systemUnit = systemUnit;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public SystemUnit getSystemUnit() {
        return systemUnit;
    }

    public void setSystemUnit(SystemUnit systemUnit) {
        this.systemUnit = systemUnit;
    }

    @Override
    public String toString() {
        return "PC{" +
                "keyboard=" + keyboard +
                ", mouse=" + mouse +
                ", systemUnit=" + systemUnit +
                '}';
    }
}
