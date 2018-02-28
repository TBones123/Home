package Classwork_30oktober2017_Agregation_composition;

public class Engine {
    private int hp;
    private int volume;

    public Engine(int hp, int volume) {
        this.hp = hp;
        this.volume = volume;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "hp=" + hp +
                ", volume=" + volume +
                '}';
    }
//    public static void startEngine(){
//        System.out.println("drrrRRrr");
//    }
}
