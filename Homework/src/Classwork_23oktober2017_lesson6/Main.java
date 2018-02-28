package Classwork_23oktober2017_lesson6;

public class Main {
    public static void main(String[] args) {
        Account account = new Account("ddd", "ddd");
        System.out.println(account);
        account.setUsername("qweqweqe");
        System.out.println(account.getUsername());
    }
}
