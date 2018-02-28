package Classwork_7november2017_CollectionMap.CollectionMap;

public class Coctail {
    private String nameOfCoctail;

    public Coctail(String nameOfCoctail) {
        this.nameOfCoctail = nameOfCoctail;
    }

    public String getNameOfCoctail() {
        return nameOfCoctail;
    }

    public void setNameOfCoctail(String nameOfCoctail) {
        this.nameOfCoctail = nameOfCoctail;
    }

    @Override
    public String toString() {
        return "Coctail{" +
                "nameOfCoctail='" + nameOfCoctail + '\'' +
                '}';
    }
}
