package Homework_3november2017_collections.ex3;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ArrayList<Driver> drivers = new ArrayList<>();
        drivers.add(new Driver(1, "Vasya", 29));
        drivers.add(new Driver(2, "Misha", 29));
        drivers.add(new Driver(3, "Kolya", 29));
        drivers.add(new Driver(4, "Petya", 29));



        HashMap<String, ArrayList<Driver>> transpsss = new HashMap<>();
        transpsss.put("ATP", drivers);



    }
}