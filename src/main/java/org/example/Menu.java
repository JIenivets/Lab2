package org.example;

import java.util.Scanner;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);

    public static boolean Registration(){
        Registration.Registration();
        return true;
    }

    public static void Exit(){
        JSONParser.jsonWrite(Main.userData, Main.userDataPath);
        System.exit(0);
    }
}
