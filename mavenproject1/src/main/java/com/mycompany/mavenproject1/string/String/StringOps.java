package com.mycompany.mavenproject1.string.String;

public class StringOps {

    public static void main(String[] args) {

        // Некоторые операции над строками
        String str1 = new String("Java - лидер интернета!");
        String str2 = new String(str1);
        String str3 = "Строки Java эффективны!";

        int result, idx;
        char ch;

        System.out.println("Длина str1: " + str1.length());

        //Отобразить строку strl посимвольно
        for (int i = 0; i < str1.length(); i++) {
            System.out.println(str1.charAt(i));
            System.out.println();
        }
        if (str1.equals(str2))
            System.out.println("strl эквивалентна str2");
        else
            System.out.println("strl не эквивалентна str2");

        if (str1.equals(str3))
            System.out.println("strl эквивалентна str3");
        else
            System.out.println("strl не эквивалентна str3");

        result = str1.compareTo(str3);

        if (result == 0)
            System.out.println("str1 и str3 равны");
        else if (result < 0)
            System.out.println("str1 меньше str3");
        else
            System.out.println("str1 больше str3");

        // Присвоить переменной str2 новую строку
        str2 = "One Two Three One";

        idx = str2.indexOf("One");
        System.out.println("Индeкc первого вхождения One: " + idx);
        idx = str2.lastIndexOf("One");
        System.out.println("Индeкc последнего вхождения One: " + idx);

    }
}
