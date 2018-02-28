package Classwork_23oktober2017_lesson6.Interface;

public class Cat extends Animal {
    private String poroda;

    public Cat() {
//        super(3, 3);
    }

    @Override
    public void roar() {
        System.out.println("meeoooow!");
    }

    public Cat(int eyes, int legs, String poroda) {
        super(eyes, legs);
        this.poroda = poroda;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "poroda='" + poroda + '\'' +
                "} " + super.toString();
    }
//    @Override
//    public String toString() {
//        return poroda + " " + super.getEyes() + " " + super.getLegs();
//    }
}

