package Homework_02112017_composition.ex3;

import java.util.Arrays;

public class Company {
    private String nameCompany;
    private Departament[] departaments;

    public Company(String nameCompany, Departament[] departaments) {
        this.nameCompany = nameCompany;
        this.departaments = departaments;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public Departament[] getDepartaments() {
        return departaments;
    }

    public void setDepartaments(Departament[] departaments) {
        this.departaments = departaments;
    }

    @Override
    public String toString() {
        return "Company{" +
                "nameCompany='" + nameCompany + '\'' +
                ", departaments=" + Arrays.toString(departaments) +
                '}';
    }
}
