/*
 * Нельзя объявлять переменную с одним и тем же именем в разных блоках
 * */
package com.mycompany.mavenproject1;

public class NestVar {
	public static void main(String[] args) {
		int count;
		
		for(count = 0; count < 1; count++) {
			System.out.println("Знaчeниe count: " + count);
			
			//int count;/ / Недопустимо!!!! Нельзя объявлять переменную count поскольку ранее она уже была объявлена
			System.out.println("B этой программе есть ошибка в 13 строке и она закометирована! "
					+ "\nНельзя объявлять переменную count поскольку ранее она уже была объявлена");
		}
	}

}
