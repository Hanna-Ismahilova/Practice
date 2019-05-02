package com.mycompany.mavenproject1.classes;

import java.sql.SQLOutput;

public class Vehicle {

    int passengers;//количество пассажиров
    int fuelcap;//емкость топливного бака
    int mpg;//потребление топлива в милях на галлон

    //Vehicle minivan = new Vehicle();//создать объект minivan типа Vehicle

   // minivan.fuelcap = 16; //точечная нотация. объект слева а член (переменная, метод) справа после точки


    //Определить дальность поездки транспортного средства
    void range(){
        System.out.println("Дальность " + fuelcap * mpg + " миль");
    }

    void myMeth() {
        int i;

        for (i = 0; i <10; i++){
            if (i == 5) return;
            System.out.println("Цикл выполнен");
        }
    }

    //Возврат дальности поездки.
    int range3(){
        return fuelcap * mpg;
    }

    //расчет объема топлива, необходимого для преодоления заданного расстояния.
    double fuelneeded(int miles){
        return (double) miles / mpg;
    }


}
