package Homework_3november2017_collections.ex1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car(new Wheel(13.1), new Kuzov("red"), new Rul(true)));
        cars.add(new Car(new Wheel(17.1), new Kuzov("yello"), new Rul(false)));
        cars.add(new Car(new Wheel(14.3), new Kuzov("yello"), new Rul(true)));
        cars.add(new Car(new Wheel(13.5), new Kuzov("red"), new Rul(false)));
        cars.add(new Car(new Wheel(4.1), new Kuzov("white"), new Rul(false)));
        cars.add(new Car(new Wheel(16.5), new Kuzov("white"), new Rul(true)));
        cars.add(new Car(new Wheel(10.1), new Kuzov("blue"), new Rul(false)));
//        wheelSize(cars);
//        wheelSizeKuzov(cars);
//        changeKuzov(cars);


    }

    static void wheelSize(ArrayList<Car> cars) {
        System.out.println("Введите диаметр колеса: ");
        Scanner scanner = new Scanner(System.in);
        double line = scanner.nextDouble();
        Iterator<Car> iterator = cars.iterator();
        while (iterator.hasNext()) {
            Car car = iterator.next();
            if (car.getWheel().getSizeWheel() == line) {
                System.out.println(car);
            }
        }
    }
        static void wheelSizeKuzov(ArrayList<Car> cars) {
            System.out.println("введите диаметр");
            Scanner scanner = new Scanner(System.in);
            double line = scanner.nextDouble();
            System.out.println("введите цвет");
            Scanner scanner1 = new Scanner(System.in);
            String line1 = scanner1.nextLine();
            Iterator<Car> iterator = cars.iterator();
            while (iterator.hasNext()) {
                Car car = iterator.next();
                if (car.getKuzov().getColorKuzov().equals(line1) && car.getWheel().getSizeWheel() == line){
                    System.out.println(car);
                }
            }
    }
    static void changeKuzov(ArrayList<Car> cars) {
        Iterator<Car> iterator = cars.iterator();
        while (iterator.hasNext()) {
            Car car = iterator.next();
            if (car.getKuzov().getColorKuzov().equals("red")){
                car.rul.setButtonRul(false);
                System.out.println(cars);
            }
        }
    }
    static void changeWheel(ArrayList<Car> cars) {
        Iterator<Car> iterator = cars.iterator();
        while (iterator.hasNext()) {
            Car car = iterator.next();
            if (car.getRul().isButtonRul() == true){
                car.getWheel().setSizeWheel(car.getWheel().getSizeWheel()*2);
            }
        }
    }
//    static ArrayList<Car>  changeWheelDown(ArrayList<Car> cars) {
//        ArrayList<Car> carArrayList = new ArrayList<>();
//        ListIterator<Car> listIterator = carArrayList.listIterator();
//        System.out.println("Please insert diameter" + "\n" + "cars with smaller diameter will be replaced");
//        Scanner sc = new Scanner(System.in);
//        double diameter = sc.nextDouble();
//
//        System.out.println("enter new wheel");
//        Scanner nModel = new Scanner(System.in);
//        Double newModel = nModel.nextDouble();
//
//        System.out.println("enter new color");
//        Scanner newCar = new Scanner(System.in);
//        String newColor = newCar.nextLine();
//
//        System.out.println("enter new rul");
//        Scanner newH = new Scanner(System.in);
//        String newHelm = newH.nextLine();
//
//        while (listIterator.hasNext()) {
//            Car car = listIterator.next();
//            if (car.getWheel().getSizeWheel()<diameter){
//                listIterator.set(new Car(new Wheel(newModel), new Kuzov(newColor)));
//            }
        }










