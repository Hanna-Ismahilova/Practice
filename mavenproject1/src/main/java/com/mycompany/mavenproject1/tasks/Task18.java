//Различия между  int и double

package com.mycompany.mavenproject1.tasks;

public class Task18 {
    public static void main(String[] args){
    int var = 10;
    double x = 10.0;
    System.out.println("The var = " + var);
    System.out.println("The x = " + x);
    System.out.println();
    
    //Значение числа после деления
    var = var / 4;//дробная часть теряется
    x = x / 4;//дробная часть сохраняется
    System.out.println("The value of the var after deviding: " + var);
    System.out.println("The value of the x after deviding: " + x);
    
    }
    
}
