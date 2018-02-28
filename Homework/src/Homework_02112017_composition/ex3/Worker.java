package Homework_02112017_composition.ex3;

public class Worker {
    private String name;
    private String serName;
    private String staj;
    private String doljnost;

    public Worker(String name, String serName, String staj, String doljnost) {
        this.name = name;
        this.serName = serName;
        this.staj = staj;
        this.doljnost = doljnost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSerName() {
        return serName;
    }

    public void setSerName(String serName) {
        this.serName = serName;
    }

    public String getStaj() {
        return staj;
    }

    public void setStaj(String staj) {
        this.staj = staj;
    }

    public String getDoljnost() {
        return doljnost;
    }

    public void setDoljnost(String doljnost) {
        this.doljnost = doljnost;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", serName='" + serName + '\'' +
                ", staj='" + staj + '\'' +
                ", doljnost='" + doljnost + '\'' +
                '}';
    }
}
