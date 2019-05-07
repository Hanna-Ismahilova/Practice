package com.mycompany.mavenproject1.vehicle;

/*main метод надо указывать в классе лишь в том случае, 
если выполнение программы начинается с данного класса. 
Кроме того, в некоторых приложениях Java, в том числе в 
аплетах, метод main () вообще не требуется. 
*/
public class Vehicle {
	
	//Следует также иметь в виду, что методы и переменные, составляющие класс, 
	//принято называть членами класса
	
	int passengers; // количество пассажиров
	int fuelcap; // емкость топливного бака. еще принято называть переменную как член класса
	int mpg; // потребление топлива в милях на галлон
	
	//Vehicle minivan = new Vehicle(); //создать объект minivan типа Vehicle
	
/*Всякий раз, когда вы создаете экземпляр класса, вы создаете объект, содержащий собственные 
 * копии всех переменных экземrmяра, определенных в классе. Иными словами, каждый объект типа 
 * Vehicle будет содержать свои копии переменных passengers, fuelcap и mpg. Для обращения к 
 * этим переменным используется так называемая точечная нотация, в соответствии с которой имя 
 * переменной указывается после имени объекта и отделяется от него точкой
 */
	//minivan.fuelcap = 16; //точечная нотация
	
	//Вообще говоря, точечной нотацией можно пользоваться для обращения как к переменным 
	//экземrmяра, так и к методам
	
	// Как правило, другие части программы взаимодействуют с классом посредством его методов. 
	//Метод состоит из одной или нескольких инструкций. В правильно написанной программе на Java каждый метод выполняет только одну функцию. 
	//У каждого метода имеется свое имя, которое используется для его вызова. 
	
	// method  - oтобразит дальность поездки
//	void range() {
//		System.out.println("Дaльнocть - " + fuelcap * mpg + " миль.");
//	}
	
	// Возврат значения . видоизменен метод range (). 
	int range() {
		return mpg * fuelcap;//Возврат даnьностн поездкн дпя заданноrо тронспортноrо средства
	}
//	
//	void myMeth() {
//		int i;
//		
//		for(i = 0; i < 10; i++) {
//			if(i == 5) return;
//			System.out.println();
//		}
//		
//	}

}
