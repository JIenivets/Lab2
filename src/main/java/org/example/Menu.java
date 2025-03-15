package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);

    public static void AddNewItem(){
        String name, tripName;
        Integer carriageCout = null;

        System.out.print("Введите имя поезда: ");
        name = scanner.nextLine();
        while (carriageCout == null) {
            System.out.print("Введите кол-во вагонов: ");
            try {
                carriageCout = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: введите целое число.");
                scanner.nextLine();
            }
        }
        scanner.nextLine();
        System.out.print("Введите номер рейса: ");
        tripName = scanner.nextLine();

        Main.onlineUser.addTrain(name, carriageCout, tripName);
    }

    public static void RemoveItem() {
        Integer itemIndex = null;

        while (itemIndex == null) {
            System.out.print("Введите индекс элемента, который хотите удалить: ");
            try {
                itemIndex = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: введите целое число.");
                scanner.nextLine();
            }
        }
        scanner.nextLine();
        Main.onlineUser.removeTrain(itemIndex);
    }

    public static void EditItem() {
        String newName, newTripName;
        Integer newCarriageCout = null;
        Integer itemIndex = null;

        while (itemIndex == null) {
            System.out.print("Введите индекс элемента, который хотите удалить: ");
            try {
                itemIndex = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: введите целое число.");
                scanner.nextLine();
            }
        }
        scanner.nextLine();
        System.out.print("Введите новое имя поезда: ");
        newName = scanner.nextLine();
        while (newCarriageCout == null) {
            System.out.print("Введите новое кол-во вагонов: ");
            try {
                newCarriageCout = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: введите целое число.");
                scanner.nextLine();
            }
        }
        scanner.nextLine();
        System.out.print("Введите новый номер рейса: ");
        newTripName = scanner.nextLine();

        Main.onlineUser.EditTrain(itemIndex, newName, newCarriageCout, newTripName);
    }

    public static boolean LogIn(){
        return LogIn.LogIn();
    }

    public static boolean Registration(){
        return Registration.Registration();
    }

    public static void Exit(){
        JSONParser.jsonWrite(Main.userData, Main.userDataPath);
        System.exit(0);
    }
}
