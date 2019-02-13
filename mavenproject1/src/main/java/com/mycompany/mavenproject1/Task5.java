//В методе public static void hackSalary(int a) увеличь зарплату на 100 и выведи на экран надпись: "Твоя зарплата составляет: <a+100> долларов в месяц."
//Где <a+100> - это зарплата увеличенная на 100.
//
//Пример вывода на экран для а = 700:
//Твоя зарплата составляет: 800 долларов в месяц.

package com.mycompany.mavenproject1;

/**
 *
 * @author Hanna_Ismahilova
 */
public class Task5 {
    public static void main(String[] args) {
        hackSalary(3000);
    }

    public static void hackSalary(int a) {
        int higherSalary = a + 100;
       System.out.println("Your salary is " + higherSalary + " $ per month in Barcelona");// напишите тут ваш код
    }
}
