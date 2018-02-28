package Homework_9november2017_verhovnarada;

import java.util.*;

public class Fraction {
    ArrayList<Deputy> deputies = new ArrayList<Deputy>();
    private String nameFraction;

    public Fraction(){
        this.fraction_seed();
    }

    public String getNameFraction() {
        return nameFraction;
    }

    public void setNameFraction(String nameFraction) {
        this.nameFraction = nameFraction;
    }

    public void fraction_seed(){
        deputies.add(new Deputy(10.1, 10.1, "Andrey", "Radushev", 19, true));
        deputies.add(new Deputy(16.1, 13.1, "Ivan", "sveeen", 19, true));
        deputies.add(new Deputy(15.1, 12.1, "Dima", "Madddd", 19, false));
        deputies.add(new Deputy(18.1, 15.1, "Anton", "trand", 19, true));
        deputies.add(new Deputy(17.1, 14.1, "Sergey", "cheh", 19, false));
    }

    public Deputy create(double weight, double growth, String name, String serName, int age, boolean bribeDeputy){
        Deputy deputy = new Deputy(weight, growth, name, serName, age, bribeDeputy);
        deputies.add(deputy);
        return deputy;
    }

    public void remove(int index){
        deputies.remove(index);
    }

    public  ArrayList<Deputy> getBribeDeputies() {
        ArrayList<Deputy> deputiesWithBribe = new ArrayList<>();
        Iterator<Deputy> iterator = deputies.iterator();
        while (iterator.hasNext()) {
            Deputy deputy = iterator.next();
            if (deputy.isBribeDeputy()){
                deputiesWithBribe.add(deputy);
            }
        }
//        for (Deputy deputy : deputies) {
//            if (deputy.isBribeDeputy()) {
//                deputiesWithBribe.add(deputy);
//            }
//        }
        return deputiesWithBribe;
    }

//
//    public Deputy getMaxBribeDeputy(){


    public void removeAll(){
        deputies = new ArrayList<Deputy>();
    }

    //    public static ArrayList<Deputy> createNewDeputy() {
//        ArrayList<Deputy> deputiesList = new ArrayList<>();
//        ListIterator<Deputy> listIterator = deputiesList.listIterator();
//
//        System.out.println("Введите вес депутата: ");
//        Scanner scannerWeight = new Scanner(System.in);
//        double weight = scannerWeight.nextDouble();
//
//        System.out.println("Введите рост депутата: ");
//        Scanner scannerGrowt = new Scanner(System.in);
//        double growt = scannerGrowt.nextDouble();
//
//        System.out.println("Введите имя депутата: ");
//        Scanner scannerName = new Scanner(System.in);
//        String name = scannerName.nextLine();
//
//        System.out.println("Введите фамилия депутата: ");
//        Scanner scannerSerName = new Scanner(System.in);
//        String serRname = scannerSerName.nextLine();
//
//        System.out.println("Введите возраст депутата: ");
//        Scanner scannerAge = new Scanner(System.in);
//        Integer age = scannerAge.nextInt();
//
//        System.out.println("берет ли взятки: ");
//        Scanner scannerBribe = new Scanner(System.in);
//        boolean bribeD = scannerBribe.nextLine().equals("true");
//
//        deputiesList.add(new Deputy(weight, growt, name, serRname, age, bribeD));
//        return deputiesList;
//    }

}
