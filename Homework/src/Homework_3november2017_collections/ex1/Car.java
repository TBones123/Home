package Homework_3november2017_collections.ex1;

public class Car {
    Wheel wheel;
    Kuzov kuzov;
    Rul rul;

    public Car() {
    }

    public Car(Wheel wheel, Kuzov kuzov, Rul rul) {
        this.wheel = wheel;
        this.kuzov = kuzov;
        this.rul = rul;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Kuzov getKuzov() {
        return kuzov;
    }

    public void setKuzov(Kuzov kuzov) {
        this.kuzov = kuzov;
    }

    public Rul getRul() {
        return rul;
    }

    public void setRul(Rul rul) {
        this.rul = rul;
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheel=" + wheel +
                ", kuzov=" + kuzov +
                ", rul=" + rul +
                '}';
    }
}
