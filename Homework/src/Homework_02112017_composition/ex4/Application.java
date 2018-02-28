package Homework_02112017_composition.ex4;

public class Application {
    private int number;
    private String date;
    private Client client;

    public Application(int number, String date, Client client) {
        this.number = number;
        this.date = date;
        this.client = client;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Application{" +
                "number=" + number +
                ", date='" + date + '\'' +
                ", client=" + client +
                '}';
    }
}
