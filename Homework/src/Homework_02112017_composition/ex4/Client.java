package Homework_02112017_composition.ex4;

public class Client {
    private String serName;
    private String name;
    private String date;
    private Passport passport;

    public Client(String serName, String name, String date, Passport passport) {
        this.serName = serName;
        this.name = name;
        this.date = date;
        this.passport = passport;
    }

    public String getSerName() {
        return serName;
    }

    public void setSerName(String serName) {
        this.serName = serName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "Client{" +
                "serName='" + serName + '\'' +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", passport=" + passport +
                '}';
    }
}
