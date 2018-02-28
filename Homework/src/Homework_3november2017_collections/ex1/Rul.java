package Homework_3november2017_collections.ex1;

public class Rul {
    private boolean buttonRul;

    public Rul() {
    }

    public Rul(boolean buttonRul) {
        this.buttonRul = buttonRul;
    }

    public boolean isButtonRul() {
        return buttonRul;
    }

    public void setButtonRul(boolean buttonRul) {
        this.buttonRul = buttonRul;
    }

    @Override
    public String toString() {
        return "Rul{" +
                "buttonRul=" + buttonRul +
                '}';
    }
}
