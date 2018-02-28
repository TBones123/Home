package Classwork_7november2017_CollectionMap.CollectionMap;

public class Liquid {
    private String nameOfLiquid;

    public Liquid(String nameOfLiquid) {
        this.nameOfLiquid = nameOfLiquid;
    }

    public String getNameOfLiquid() {
        return nameOfLiquid;
    }

    public void setNameOfLiquid(String nameOfLiquid) {
        this.nameOfLiquid = nameOfLiquid;
    }

    @Override
    public String toString() {
        return "Liquid{" +
                "nameOfLiquid='" + nameOfLiquid + '\'' +
                '}';
    }
}
