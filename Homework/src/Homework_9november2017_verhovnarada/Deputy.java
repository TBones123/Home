package Homework_9november2017_verhovnarada;

import java.util.Scanner;

public class Deputy extends Person {
    private String name;
    private String serName;
    private int age;
    private boolean bribeDeputy;
    private int bribe1;

    public Deputy(double weight, double growth, String name, String serName, int age, boolean bribeDeputy) {
        super(weight, growth);
        this.name = name;
        this.serName = serName;
        this.age = age;
        this.bribeDeputy = bribeDeputy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSerName() {
        return serName;
    }

    public void setSerName(String serName) {
        this.serName = serName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isBribeDeputy() {
        return bribeDeputy;
    }

    public void setBribeDeputy(boolean bribeDeputy) {
        this.bribeDeputy = bribeDeputy;
    }

    public int getBribe1() {
        return bribe1;
    }

    public void setBribe1(int bribe1) {
        this.bribe1 = bribe1;
    }

    @Override
    public String toString() {
        return "\nDeputy{" +
                "name='" + name + '\'' +
                ", serName='" + serName + '\'' +
                ", age=" + age +
                ", bribeDeputy=" + bribeDeputy +
                "} " + super.toString() + "\n";
    }

    public void takeBribe() {
        if (bribeDeputy) {
            Scanner scanner = new Scanner(System.in);
            Integer bribe = scanner.nextInt();
            if (bribe >= 5000) {
                System.out.println("Милиция посадила взяточника");
            }else {
                setBribe1(bribe);
            }
        }
    }
}





