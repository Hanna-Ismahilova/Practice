package com.mycompany.mavenproject1.classes;

//В этой программе создаются два объекта класса Vehicle

public class TwoVehicles {
    public static void main(String[] args) {

        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        int range1, range2;

        // Присвоить значения полям в объекте minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // Присвоить значения полям в объекте sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        range1 = minivan.fuelcap * minivan.mpg;
        range2 = sportscar.fuelcap * sportscar.mpg;

        System.out.println("Mини-фypгoн может перевезти " + minivan.passengers
                + " пассажиров на расстояние " + range1 + " миль");

        System.out.println("Mини-фypгoн может перевезти " + sportscar.passengers
                + " пассажиров на расстояние " + range2 + " миль");

    }
}
