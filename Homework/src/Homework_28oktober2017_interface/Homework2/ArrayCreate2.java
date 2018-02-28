package Homework_28oktober2017_interface.Homework2;

import java.util.Random;

public class ArrayCreate2 implements ArrayCreator {
    private int lenght;
    private int x;

    public ArrayCreate2(int lenght, int x) {
        this.lenght = lenght;
        this.x = x;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public int[] creator() {
        int[] crArray2 = new int[lenght];
        for (int i = 0; i < crArray2.length; i++) {
            Random random = new Random(50);
            crArray2[i] = new Random().nextInt(x);

        }
        return crArray2;
    }
}
