package org.example;

import java.util.Scanner;

public class LogIn {
    private static String login, pasword;
    private static Scanner scanner = new Scanner(System.in);


    static boolean LogIn(){

        System.out.print("Введите логин: ");
        login = scanner.nextLine();
        if(!Main.userData.containsKey(login)){
            System.out.print("Такого пользователся нет!\n\n1. Зарегистрироваться\n0. Выход\n => ");

            switch (scanner.nextLine()){
                case "1":
                    return Menu.Registration();
                case "0":
                    Menu.Exit();
                default:
                    System.out.println("Неизвестная команда!");
                    Menu.Exit();
            }
        }

        System.out.print("Введите пароль: ");
        pasword = scanner.nextLine();
        if (!Main.userData.get(login).getPassword().equals(pasword)) {
            System.out.println("Неверный пароль!");
            return false;
        }
        Main.onlineUser = Main.userData.get(login);
        return true;
    }

}
