package org.example;

import java.util.*;

public class Main {
    static String userDataPath = "users.json";
    static Scanner scanner = new Scanner(System.in);
    static Map<String, User> userData = JSONParser.jsonRead(userDataPath);
    static User onlineUser;

    public static void main(String[] args) {
        String choise = "-1";


        if (!Menu.LogIn()){
            Menu.Exit();
        }
        while (!choise.equals("0")){
            System.out.print("\nМеню:\n" +
                    "1. Вывод данных\n" +
                    "2. Добавить объект\n" +
                    "3. Удалить объект\n" +
                    "4. Редактировать объект\n" +
                    "0. Выход\n" +
                    " => ");
            choise = scanner.nextLine();

            switch (choise){
                case "1":
                    onlineUser.printTrainsData();
                    break;
                case "2":
                    Menu.AddNewItem();
                    break;
                case "3":
                    Menu.RemoveItem();
                    break;
                case "4":
                    Menu.EditItem();
                    break;
                case "0":
                    Menu.Exit();
                    break;
                default:
                    System.out.println("Неизвестная команда!\n");
                    break;
            }
        }






        System.out.println("Hello, World!");
    }
}