//Метод convertCelsiumToFahrenheit(int celsium) принимает значение в градусах Цельсия. Метод должен переводить температуру и возвращать значение в градусах Фаренгейта.
//Температура по Цельсию TC и температура по Фаренгейту TF связаны следующим соотношением:
//TC = (TF - 32) * 5/9
//
//Пример:
//В метод convertCelsiumToFahrenheit на вход подается значение 41.
//
//Пример вывода:
//105.8
package com.mycompany.mavenproject1;

/**
 *
 * @author Hanna_Ismahilova
 */
public class Zadanie7 {
    public static void main(String[] args) {
        System.out.println(convertCelsiumToFahrenheit(41));
    }

    public static double convertCelsiumToFahrenheit(int celsium) {
        double fahrenheit = ((double) celsium * 9/5) + 32;
        //напишите тут ваш код
        return fahrenheit;
    }
}
