package com.mycompany.mavenproject1.classes.queue;

public class Queue {
    char q[]; //массив для хранения элементов очереди
    int putloc, getloc; //индексы для вставки и извлечения
    // элементов очереди

    //Конструктор класса Queue создает очередь заданного размера
    public Queue(int size) {
        q = new char[size + 1];//вьшелить память для очереди
        putloc = getloc = 0;
    }

    //Метод put (), помещающий элемент в очередь
    public void put(char ch){
        if ( putloc==q.length-1){
            System.out.println(" - Очередь заполнена");
            return;
        }

        putloc++;
        q[putloc] = ch;
    }

    //Для извлечения элементов из очереди служит метод get ()
    public char get(){
        if (getloc == putloc){
            System.out.println(" - Очередь заполнена");
            return (char) 0;
        }

        getloc++;
        return q[getloc];
    }


}
