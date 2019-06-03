package com.mycompany.mavenproject1.vehicle;

public class VehiclesTwo {
	public static void main(String[] args) {
		 
		Vehicle minivan = new Vehicle();
		Vehicle sportscar = new Vehicle();
		
		int range1, range2;
		
		// Присвоит ь значения полям в объекте minivan 
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		
		// Присвоить значения полям в объекте sportscar 
		sportscar.passengers = 2;
		sportscar.fuelcap = 14;
		sportscar.mpg = 12;
		
		// Рассчитат ь даль ность поездки при полном баке 
		range1 = minivan.fuelcap * minivan.mpg;
		range2 = sportscar.fuelcap * sportscar.mpg;
		
		System.out.println("Mини-фypгoн может перевезти " + minivan.passengers + " пассажиров на расстояние " + range1 + " миль");
		System.out.println("Cпopтивный автомобиль может перевезти " + sportscar.passengers + " пассажиров на расстояние " + range2 + " миль");
	
	}
	

}
