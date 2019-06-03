package com.mycompany.mavenproject1.classes.methodWith2Param;

public class IsFact {
    public static void main(String[] args) {
        Factor x = new Factor();

        //Передача двух аргументов методу isFactor ()
        if (x.isFactor(2,20)) System.out.println("2 - делитель");
        if (x.isFactor(3,20)) System.out.println("этa строка не будет выведена");
    }
}
