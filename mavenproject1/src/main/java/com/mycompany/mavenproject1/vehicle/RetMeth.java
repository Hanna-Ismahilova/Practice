package com.mycompany.mavenproject1.vehicle;

public class RetMeth {
	public static void main(String[] args) {
		Vehicle minivan = new Vehicle();
		Vehicle sportscar = new Vehicle();
		
		int range1, range2;
		
		//Присвоить значения полям в объекте miniva
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		
		
		//Присвоить значения полям в объекте sportscar
		sportscar.passengers = 2;
		sportscar.fuelcap = 14;
		sportscar.mpg = 12;
		
		//Получить дальности поездки для разных транспортных средств
		//Прнсвоенне переменной эночення, возвращаемого методом 
		range1 = minivan.range();
		range2 = sportscar.range();
		
		System.out.println("Мини-фypгoн может перевезти " + minivan.passengers + " " + "пассажиров на расстояние " + range1 + " миль");
		System.out.println("Мини-фypгoн может перевезти " + sportscar.passengers + " " + "пассажиров на расстояние " + range2 + " миль");
		
	}

}
