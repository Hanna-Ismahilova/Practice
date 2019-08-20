package com.mycompany.mavenproject1.classes.loopForEach;

public class Search {

    public static void main(String[] args) {
// Поиск в массиве с использованием расширенного цикла for
        int nums[] = {6, 8, 3, 7, 5, 6, 1, 4};
        int val = 5;
        boolean found = false;
// Использовать цикл for-each для поиска значения
// переменной val в массиве nums
        for (int x : nums
             ) {
            if (x == val) {
                found = true;
                break;
            }
        }
        if (found)
            System.out.println("Значение найдено!");

    }
}
