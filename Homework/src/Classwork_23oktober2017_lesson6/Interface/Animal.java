package Classwork_23oktober2017_lesson6.Interface;

public abstract class Animal {
    private int eyes;
    private  int legs;

    public Animal() {
    }

    public Animal(int eyes, int legs) {
        this.eyes = eyes;
        this.legs = legs;
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public abstract void roar();

    @Override
    public String toString() {
        return "Animal{" +
                "eyes=" + eyes +
                ", legs=" + legs +
                '}';
    }
}
