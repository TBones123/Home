package Homework_28oktober2017_interface.Homework2;

import java.util.Random;

public class ArrayCreate1 implements ArrayCreator {
    int lenght;

    public ArrayCreate1() {
    }

    public ArrayCreate1(int lenght) {
        this.lenght = lenght;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public int[] creator() {
        int[] crArray1 = new int[lenght];
        for (int i = 0; i < crArray1.length; i++) {
            Random random = new Random(100);
            crArray1[i]=new Random().nextInt(kol);
        }
        return crArray1;
    }
}
