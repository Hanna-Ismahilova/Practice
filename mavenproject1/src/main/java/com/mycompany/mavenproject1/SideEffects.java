/*
 * Демонстрация роли побочных эффектов 
 * */
package com.mycompany.mavenproject1;

public class SideEffects {

	public static void main(String[] args) {
		int i; 
		
		i = 0;
		
		if(false & (++i < 100))
			System.out.println("Этa строка не будет отображаться");
		System.out.println("Oпepaтop if выполняется: " + i);// отображается 1 
		
		/* В данном случае значение переменной i не инкрементируется,
		 * поскольку второй операнд укороченного логического оператора не вычисляется, 
		 * а следовательно, инкремент пропускается */
		if(false && (++i < 100))
			System.out.println("Этa строка не будет отображаться");
		System.out.println("Oпepaтop if выполняется: " + i);//по-прежнему отображается 1 ! ! 
		
	}
}
