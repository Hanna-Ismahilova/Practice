package com.mycompany.mavenproject1.classes.queue;

public class QDemo {

    public static void main(String[] args) {

        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(11);

        char ch;
        int i;

        System.out.println("Использование очереди bigQ для сохранение алфавита");

        // Поместить буквенные символы в очередь bigQ
        for (i = 0; i < 26; i++)
            bigQ.put((char) ('A' + i));

        //Извлечь буквенные символы из очереди ЬigQ и отобразить
        System.out.println("Coдepжимoe очереди ЬigQ: ");
        for (i = 0; i < 26; i++){
            ch = bigQ.get();
            if (ch != (char) 0) System.out.println(ch);
        }
        System.out.println("\n");

        System.out.println("Иcпoльзoвaниe очереди srnallQ\n" +
                "для генерации ошибок");

        //Использовать очередь srnallQ для генерации ошибок
        for (i = i; i < 10; i++){
            System.out.println("Пoпыткa сохранения " + (char) ('Z' - i));

            smallQ.put((char) ('Z' - i));

            System.out.println();
        }
        System.out.println();

        //Дополнительные ошибки при обращении к очереди srnallQ
        System.out.println("Coдepжимoe srnallQ: ");
        for (i = 0; i < 10; i++){
            ch = smallQ.get();
            if (ch != (char) 0) System.out.println(ch);
        }
    }
}
