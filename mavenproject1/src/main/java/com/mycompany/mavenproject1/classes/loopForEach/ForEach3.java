package com.mycompany.mavenproject1.classes.loopForEach;

public class ForEach3 {

    public static void main(String[] args) {
        //Использование расширенного цикла for
        // для обработки двумерного массива
        int sum = 0;
        int nums[][][] = new int[3][5][10];

        //Ввести ряд значений в массив nums
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 5; j++)
                for (int b = 0; b < 10; b++)
                    nums[i][j][b] = (i + 1) * (j + 1) * (b + 1);

        //Использовать разновидность for-each цикла for
        //для суммирования и отображения значений.
        //Обратите внимание на объявление переменной х.

        for (int x[][]: nums
        ) {
            for (int y[] : x
            ) {
                for (int c : y
                ) {
                    System.out.println("Знaчeниe: " + c);
                    sum += c;
                }
            }
        }
        System.out.println("Сумма: " + sum);
    }
}
