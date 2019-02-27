/*
 * Демонстрация использования логических значений 
 **/
package com.mycompany.mavenproject1;

public class Boolean {
	
	public static void main(String[] args) {
		
		boolean b;
		
		b = false;
		System.out.println("Значение b: " + b);
		
		b = true;
		System.out.println("Значение b: " + b);
		
		//Логическое значение можно использовать для
		//управления условным оператором if
		if(b)
			System.out.println("Эта инструкция вьполняется");
		
		b = false;
		if(b)
			System.out.println("Эта инструкция не вьполняется");
		
		//В результате выполнения сравнения
		//получается логическое значение 
		System.out.println("Peзyльтaт сравнения 10 > 9: " + (10 > 9));
	}

}
