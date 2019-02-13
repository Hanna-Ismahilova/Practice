//Выведи на экран длину окружности, рассчитанную по формуле: L = 2 * Pi * radius.
//Результат - дробное число (тип double).
//В качестве значения Pi используй значение 3.14.

package com.mycompany.mavenproject1;

/**
 *
 * @author Hanna_Ismahilova
 */
public class Zadanie4 {
    public static void main(String[] args) {
        printCircleLength(255);
    }

    public static void printCircleLength(int radius) {
       double Pi = 3.14;
       double L = 2 * Pi * radius;
       System.out.println("Arround is " + L);
       
        //напишите тут ваш код
    }
}
