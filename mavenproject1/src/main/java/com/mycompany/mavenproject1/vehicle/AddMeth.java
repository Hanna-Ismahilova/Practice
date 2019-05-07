package com.mycompany.mavenproject1.vehicle;

public class AddMeth {
	public static void main(String[] args) {
		Vehicle minivan = new Vehicle();
		Vehicle sportscar = new Vehicle();
		
		int range1, range2;
		
		//Присвоить значения полям в объекте minivan 
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg =21;
		
		//Присвоить значения полям в объекте sportscar
		sportscar.passengers = 2;
		sportscar.fuelcap = 14;
		sportscar.mpg = 12;
		
		System.out.println("Мини-фypгoн может перевезти " + minivan.passengers + " пассажиров. ");
		minivan.range(); //отобразить дальность поездки мини-фургона 
		
		System.out.println("Cпopтивный автомобиль может перевезти " + sportscar.passengers + " пассажиров.");
		sportscar.range();//отобразить дальность поездки спортивного автомобиля 
		
		minivan.myMeth();
		
	}

}
