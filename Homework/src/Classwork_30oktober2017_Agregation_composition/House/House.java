package Classwork_30oktober2017_Agregation_composition.House;

import java.util.Arrays;

public class House {
    private Adress adress;
    private Section[] sections;

    public House(Adress adress, Section[] sections) {
        this.adress = adress;
        this.sections = sections;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public Section[] getSections() {
        return sections;
    }

    public void setSections(Section[] sections) {
        this.sections = sections;
    }

    @Override
    public String toString() {
        return "House{" +
                "adress=" + adress +
                ", sections=" + Arrays.toString(sections) +
                '}';
    }
}
