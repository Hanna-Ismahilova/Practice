package com.mycompany.mavenproject1.string.String;

public class SubStr {

    public static void main(String[] args) {

        //Применение метода substring()
        String orgStr = "Java - двигатель Интернета.";

        //Сформировать подстроку
        String subStr = orgStr.substring(7,26);//Здесь создается новая строка, содержащая нужную подстроку

        System.out.println("orgStr: " + orgStr);
        System.out.println("subStr: " + subStr);

    }
}
