//Написать функцию, которая возвращает минимум из двух чисел.
//
//Подсказка:
//Нужно написать тело существующей функции min.
//
//Требования:
//Программа должна выводить текст на экран.
//Метод min не должен выводить текст на экран.
//Метод main должен вызвать метод min три раза.
//Метод main должен выводить на экран результат работы метода min. Каждый раз с новой строки.
//Метод min должен возвращать минимальное значение из чисел a и b.
package com.mycompany.mavenproject1;


public class Task15 {
    public static int min(int a, int b) {
        int c = a;
        int d = b;
        int m2;
        if (c < d)
        m2 = c;
        else
        m2 = d;
        
        return m2;
        //напишите тут ваш код
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(12, 33));
        System.out.println(min(-20, 0));
        System.out.println(min(-10, -20));
    }
}
