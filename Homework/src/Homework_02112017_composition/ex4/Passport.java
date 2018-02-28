package Homework_02112017_composition.ex4;

public class Passport {
    private String serija;
    private String nomer;
    private String whereIssued;

    public Passport(String serija, String nomer, String whereIssued) {
        this.serija = serija;
        this.nomer = nomer;
        this.whereIssued = whereIssued;
    }

    public String getSerija() {
        return serija;
    }

    public void setSerija(String serija) {
        this.serija = serija;
    }

    public String getNomer() {
        return nomer;
    }

    public void setNomer(String nomer) {
        this.nomer = nomer;
    }

    public String getWhereIssued() {
        return whereIssued;
    }

    public void setWhereIssued(String whereIssued) {
        this.whereIssued = whereIssued;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "serija='" + serija + '\'' +
                ", nomer='" + nomer + '\'' +
                ", whereIssued='" + whereIssued + '\'' +
                '}';
    }
}
