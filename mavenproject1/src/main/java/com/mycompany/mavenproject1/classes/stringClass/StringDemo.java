package com.mycompany.mavenproject1.classes.stringClass;

public class StringDemo {

    public static void main(String[] args) {

        String str = new String("B Java строки - объекты.");
        String str2 = "Их можно создавать разными способами.";
        String str3 = new String(str2);


        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
    }
}
