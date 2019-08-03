package com.mycompany.mavenproject1.classes.loop;

import com.sun.javaws.IconUtil;

public class ForEach {

    public static void main(String[] args) {
// Использование разновидности for-each цикла for
        int nums[] = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
// Использовать разновидность for-each цикла for
// для суммирования и отображения значений
        for (int x : nums)
        {
            System.out.println("Какой чудесный день: " + x);
            System.out.println("Какой чудесный пень: " + x);
            System.out.println("Какой чудесный я: " + x);
            System.out.println("И песенка моя: " + x);
            sum += x;
        }
        System.out.println("А вот и сумма готова к употреблению: " + sum);

    }
}
