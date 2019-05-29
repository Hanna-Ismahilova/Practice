package com.mycompany.mavenproject1.classes.constructor;

public class MyClassConstructorDemo {
    public static void main(String[] args) {

        //Обращение к конктрутору без параметров
//        MyClass objectConstr1 = new MyClass();
//        MyClass objectConstr2 = new MyClass();
//        System.out.println(objectConstr1.x + " " + objectConstr2.x);

        //Обращение к конструктору с параметрами
        MyClass objectConstr1 = new MyClass(10);
        MyClass objectConstr2 = new MyClass(88);

        System.out.println(objectConstr1.x + " " + objectConstr2.x);
    }
}
