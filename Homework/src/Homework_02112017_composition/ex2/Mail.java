package Homework_02112017_composition.ex2;

import java.util.Scanner;

public class Mail {
    private String login;
    private String password;

    public Mail(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
    public String logIN(){
        System.out.println("введите пароль:");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        if (line.equals("415286") ){
//            return this.login;
            return "Вы залогинены!";
        }
        return "error!";
    }
}
