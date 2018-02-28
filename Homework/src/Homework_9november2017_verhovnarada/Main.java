package Homework_9november2017_verhovnarada;

import java.util.Scanner;

public class Main {
    static Fraction fraction = new Fraction();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        Fraction fraction = new Fraction();
//        System.out.println(fraction);

        loop: while(true) {
            printCommandList();
            System.out.println("Введите команду:");
            String command = scanner.next();

            switch (command){
                case "show_bribe":
                    bribe_deputy();
                    break;
                case "show_fraction":
                    System.out.println(fraction);
                    break;
                case "create_deputy":
                    createDeputy();
                    break;
                case "remove_deputy":
                    remove_deputy();
                    break;
                case "exit":
                    System.out.println("bye-bye");
                    break loop;
                default:
                    System.out.println("Я не знаю этой комманды, введите еще раз");
                    break;
            }
        }
    }

    private static void printCommandList(){
        System.out.println("========= Список комманд =========");
        System.out.println("show_bribe: показать взятоников");
        System.out.println("create_deputy: Создать депутата");
        System.out.println("show_fraction: список депутатов");
        System.out.println("remove_deputy: удалить депутата");
        System.out.println("exit: Выйти из приложения");
        System.out.println("==================================");
    }

    private static void createDeputy(){
        System.out.println("Введите вес депутата: ");
        double weight = scanner.nextDouble();

        System.out.println("Введите рост депутата: ");
        double growt = scanner.nextDouble();

        System.out.println("Введите имя депутата: ");
        String name = scanner.next();

        System.out.println("Введите фамилия депутата: ");
        String serRname = scanner.next();

        System.out.println("Введите возраст депутата: ");
        int age = scanner.nextInt();

        System.out.println("берет ли взятки [true/false]: ");
        boolean bribeD = scanner.next().equals(true);

        Deputy deputy = fraction.create(weight, growt, name, serRname, age, bribeD);
        System.out.println("Вы успешно создали депутата: ");
        System.out.println(deputy);
    }
    public static void remove_deputy(){
        System.out.println("Введите индекс депутата котого хотите удалить: ");
        int index = scanner.nextInt();
        fraction.remove(index);
    }
    public static void bribe_deputy(){
        System.out.println(fraction.getBribeDeputies());
    }
    private static void createFraction(){
        System.out.println("введите название фракции: ");
        String fraction = scanner.next();

    }
}
