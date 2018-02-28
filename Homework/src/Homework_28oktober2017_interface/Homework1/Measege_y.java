package Homework_28oktober2017_interface.Homework1;

public class Measege_y implements toMessege{
    private String measege = "yyyyyy!";

    public Measege_y() {
    }

    public Measege_y(String measege) {
        this.measege = measege;
    }

    @Override
    public String toString() {
        return "Measege_y{" +
                "measege='" + measege + '\'' +
                '}';
    }

    @Override
    public void scream() {
        System.out.println(measege);
    }
}
