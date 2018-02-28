package Homework_02112017_composition.ex3;

public class Main {
    public static void main(String[] args) {
        Departament[] departaments = new Departament[1];

        Worker[] workers = new Worker [1];
        Worker person1 = new Worker("Vasya","Pypkin", "3goda", "fasovshik");
        workers[0] = person1;
        Departament f1 = new Departament("Pervaja", workers);
        departaments[0]= f1;
        Company company = new Company("ABK", departaments);
        System.out.println(company);












    }
}
