package com.mycompany.mavenproject1.classes;

public class AddMeth {
    public static void main(String[] args) {

        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

//        int range1, range2;

        minivan.passengers = 7;
        minivan.fuelcap = 12;
        minivan.mpg = 21;

        sportscar.passengers = 2;
        sportscar.fuelcap = 16;
        sportscar.mpg = 22;

        System.out.println("Мини-фypгoн может перевезти " + minivan.passengers + " пассажиров.");
        minivan.range();

        System.out.println("Спортивная машина может перевезти " + sportscar.passengers + " пассажиров.");
        sportscar.range();


    }
}
