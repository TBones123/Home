package Classwork_23oktober2017_lesson6;

import java.util.Scanner;

public class Account {
    String username;
    String password;

    public Account() {
    }

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        System.out.println("enter name: ");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        if (line.equals("123")) {
            return this.username;

        }
        return "error!";
    }

    public void setUsername(String username) {
       if (username.isEmpty() || username.equals("loh")){
           System.out.println("error!");
       }else {
           this.username = username;
       }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return username + " " + password;
    }
}
