package com.mycompany.mavenproject1.string.String;

public class StringSwitch {

    public static void main(String[] args) {

        String comand = "cancel";

        switch (comand){
            case"connect":
                System.out.println("Подключение");
                break;
            case"cancel":
                System.out.println("Отмена");
                break;
            case"disconnect":
                System.out.println("Отключение");
                break;
            default:
                System.out.println("Неверная команда");
                 break;
        }
    }
}
