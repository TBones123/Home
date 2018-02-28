package Classwork_2030_lesson_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("bmw", 2004, "vlc-333", "lex1", 33));
        cars.add(new Car("mers", 2007, "vlc-101", "lex2", 60));
        cars.add(new Car("lada", 2006, "vlc-101", "lex3", 45));
        cars.add(new Car("kalina", 2005, "vlc-101", "lex4", 42));
        cars.add(new Car("kalina", 1999, "vlc-555", "lex5", 33));
        cars.sort(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getAge() - o2.getAge();
            }
        });
//        creatWeel(cars);
        createEngine(cars);
    }

    static void creatWeel(ArrayList<Car> cars) {
        Iterator<Car> carIterator = cars.iterator();
        while (carIterator.hasNext()) {
            Car car = carIterator.next();
            if (car.getAge() < 2000) {
                car.setWheelDiameter(car.getWheelDiameter() - 2);
            }
            System.out.println(car);
        }
    }

    static void createEngine(ArrayList<Car> cars) {
        int max = 0;
        int min = 0;
        Car min_car = null;
        Car max_car = null;
        Iterator<Car> carIterator = cars.iterator();
        while (carIterator.hasNext()) {
            Car car = carIterator.next();
            for (int i = 0; i < car.getAge(); i++) {
                if (car.getAge() >= max) {
                    max = car.getAge();
                    max_car = car;
                    car.getEngine().equals(min_car);
                }
                if (car.getAge() <= min)
                    min = car.getAge();
                min_car = car;
                car.getEngine().equals(max_car);
            }
            min_car.setAge(max);
            max_car.setAge(min);
            System.out.println(max_car);
        }
    }
}



