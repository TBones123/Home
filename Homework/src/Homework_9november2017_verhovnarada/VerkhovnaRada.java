package Homework_9november2017_verhovnarada;

import java.util.ArrayList;

public class VerkhovnaRada extends Fraction {

    private static Fraction singleton;
ArrayList<Fraction> fractions = new ArrayList<Fraction>();

    private VerkhovnaRada() {
    }

//    public Fraction fractionCreate(String nameFraction){
//    Fraction fraction = new Fraction (nameFraction);
//    return fraction;
//    }


    public static Fraction getSingleton() {
        if (singleton == null) {
            singleton = new Fraction();
        }
        return singleton;
    }
}
