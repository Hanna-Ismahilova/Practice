package com.mycompany.mavenproject1.classes.vehicle;

public class VehConstructorDemo {
    public static void main(String[] args) {

        //Полностью сконструировать объекты транспортных средств
        Vehicle minivan = new Vehicle(7,12,23);
        Vehicle sportscar = new Vehicle(2,14,24);

        double gallons;
        int dist = 252;

        gallons = minivan.fuelneeded(dist);
        System.out.println("Для преодоления " + dist + " миль мини-фургону требуется " + gallons + " галлонов топлива");

        gallons = sportscar.fuelneeded(dist);
        System.out.println("Для преодоления " + dist + " миль спортивному автомобилю требуется " + gallons + " галлонов топлива");
    }
}
