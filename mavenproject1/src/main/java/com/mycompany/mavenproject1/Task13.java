//- Амиго, ты знал, что сила тяжести на Луне составляет примерно 17% от силы тяжести на Земле?
//- Нет.
//- Вот и я не знал. А теперь этой информацией нужно пользоваться часто, и, чтобы не считать каждый раз, реализуй метод getWeight(int), который принимает вес тела (в Ньютонах) на Земле, и возвращает, сколько это тело будет весить на Луне (в Ньютонах).
//Тип возвращаемого значения - double.
//
//Пример:
//Метод getWeight вызывается с параметром 888.
//
//Пример вывода:
//150.96
//
//Требования:
//Метод getWeight(int) должен быть публичным и статическим.
//Метод getWeight должен возвращать значение типа double.
//Метод getWeight не должен ничего выводить на экран.
//Метод getWeight должен правильно переводить вес тела в Ньютонах на Земле в вес этого же тела на Луне, и возвращать это значение.

package com.mycompany.mavenproject1;

public class Task13 {
    public static void main(String[] args) {
        System.out.println(getWeight(888));
    }

    public static double getWeight(int earthWeight) {
        
        double moon = (double) earthWeight / 100 * 17;
        return moon; //напишите тут ваш код
    }
}
