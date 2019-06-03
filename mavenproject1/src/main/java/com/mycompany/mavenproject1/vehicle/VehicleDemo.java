package com.mycompany.mavenproject1.vehicle;

//В этом классе объявляется объект типа Vehicle 
public class VehicleDemo {
	public static void main(String[] args) {
		
		Vehicle minivan = new Vehicle();
		int range;
		
		//Обратите аннманне но нспопьзоаонне точечной 
		//нотацнн для доступа к nеременнwм экземnnяра 
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 7;
		
		range = minivan.fuelcap * minivan.mpg;
		System.out.println("Mини-фypгoн может перевезти " + minivan.passengers + " пассажиров на расстояние " + range + " миль");
	}

}
