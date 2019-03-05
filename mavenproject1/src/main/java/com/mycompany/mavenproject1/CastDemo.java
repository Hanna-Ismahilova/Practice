/*
 * Демонстрация приведения типов 
 * */
package com.mycompany.mavenproject1;

public class CastDemo {

	public static void main(String[] args) {
		double x, y; 
		byte b;
		int i;
		char ch;
		
		x = 10.0;
		y = 3.0;
		//8 данном сnучае теряется дробная часть чисnа 
		i = (int) (x/y); // привести тип douЫe к типу int
		System.out.println("Цeлoчиcлeнный результат деления х/ у: " + i);
		
		i = 100;
		b = (byte) i; //привести тип douЫe к типу int
		System.out.println("Знaчeниe Ь: " + b);
		
		i = 257;
		b = (byte) i;//На этот роз информацня теряются. Тип byte не может содержать значение 257 
		System.out.println("Знaчeниe Ь: " + b);
		
		b = 88;// Представление символа Х в коде ASCII 
		ch = (char) b;//Явное приведение несовместимых типов 
		System.out.println("ch: " + ch);
		
		
		
		
	}
}
