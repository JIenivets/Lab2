package org.example;

import java.util.*;

public class Main {
    static String userDataPath = "users.json";
    static Scanner scanner = new Scanner(System.in);
    static Map<String, User> userData = JSONParser.jsonRead(userDataPath);

    public static void main(String[] args) {
        String choise = "-1";


        if (!LogIn.LogIn(userData)){
            Menu.Exit();
        }
        while (!choise.equals("0")){
            System.out.print("Меню:\n" +
                    "1. Вывод данных\n" +
                    "2. Добавить объект\n" +
                    "3. Удалить объект\n" +
                    "4. Редактировать объект\n" +
                    "0. Выход\n" +
                    " => ");
            choise = scanner.nextLine();

            switch (choise){
                case "0":
                    Menu.Exit();
                default:
                    System.out.println("Неизвестная команда!\n");
            }
        }





//        userData.put("kaF", new User("Fak", "kaF", "Bfweb12"));
//        userData.put("alax228", new User("Alax", "alax228", "1234"));
//        userData.put("gera15SM", new User("German", "gera15SM", "veob@#!73"));
//        userData.put("dai_manky", new User("Vosya", "dai_manky", "ven1q2u@"));
//        JSONParser.jsonWrite(userData, "users.json");
        System.out.println("Hello, World!");
    }
}