package org.example;

import java.util.Scanner;

public class Registration {
    private static Scanner scanner = new Scanner(System.in);

    public static boolean Registration(){
        String name, login, password;

        System.out.print("Введите имя: ");
        name = scanner.nextLine();
        System.out.print("Введите логин: ");
        login = scanner.nextLine();
        System.out.print("Введите пароль: ");
        password = scanner.nextLine();

        Main.userData.put(login , new User(name, login, password));

        JSONParser.jsonWrite(Main.userData, Main.userDataPath);
        Main.onlineUser = Main.userData.get(login);
        return true;
    }
}
