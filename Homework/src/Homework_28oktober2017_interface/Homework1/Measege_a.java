package Homework_28oktober2017_interface.Homework1;

public class Measege_a implements toMessege {
    private String measege = "aaaaaaa!";

    public Measege_a() {
    }

    public Measege_a(String measege) {
        this.measege = measege;
    }

    @Override
    public String toString() {
        return "Measege_a{" +
                "measege='" + measege + '\'' +
                '}';
    }

    @Override
    public void scream() {
        System.out.println(measege);
    }
}
