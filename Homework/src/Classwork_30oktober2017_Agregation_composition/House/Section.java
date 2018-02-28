package Classwork_30oktober2017_Agregation_composition.House;

import java.util.Arrays;

public class Section {
    private Flat[] flats;

    public Section(Flat[] flats) {
        this.flats = flats;
    }

    public Flat[] getFlats() {
        return flats;
    }

    public void setFlats(Flat[] flats) {
        this.flats = flats;
    }

    @Override
    public String toString() {
        return "Section{" +
                "flats=" + Arrays.toString(flats) +
                '}';
    }
}
