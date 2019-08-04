package com.mycompany.mavenproject1.string.String;

public class Phone {

    public static void main(String[] args) {
        String numbers[][] = {
                {"Tom", "33-33-33"},
                {"Hanna", "44-44-44"},
                {"Dunka", "55-55-55"},
                {"Frunka", "66-66-66"}
        };
        int i;

        //Для того чтобы воспользоваться программой,
        //ей нужно передать один аргумент командной строки
        if (args.length != 1)
            System.out.println("Иcпoльзoвaниe: java Phone <Hanna>");
        else  {
            for (i = 0; i < numbers.length; i++){
                if (numbers[0][1].equals(args[0])){
                    System.out.println(numbers[i][0] + ": " + numbers[i][1]);
                    break;
                }
            }
            if (i == numbers.length)
                System.out.println("Имя не найдено.");
        }
    }
}
