package Homework_02112017_composition.ex3;

import java.util.Arrays;

public class Departament {
    private String nameDepartament;
    private Worker[] workers;

    public Departament(String nameDepartament, Worker[] workers) {
        this.nameDepartament = nameDepartament;
        this.workers = workers;
    }

    public String getNameDepartament() {
        return nameDepartament;
    }

    public void setNameDepartament(String nameDepartament) {
        this.nameDepartament = nameDepartament;
    }

    public Worker[] getWorkers() {
        return workers;
    }

    public void setWorkers(Worker[] workers) {
        this.workers = workers;
    }

    @Override
    public String toString() {
        return "Departament{" +
                "nameDepartament='" + nameDepartament + '\'' +
                ", workers=" + Arrays.toString(workers) +
                '}';
    }
}
