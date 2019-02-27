/*
 * С символьными переменными можно обращаться, как с целочисленными 
 * */
package com.mycompany.mavenproject1;

public class CharArithDemo {

	public static void main(String[] args) {
		char ch;
		
		ch = 'X';
		System.out.println("ch содержит " + ch);
		
		ch++;
		System.out.println("тenepь ch содержит " + ch);//Переменную типа char можно инкрементировать 
		
		ch = 90;//После этого переменной ch присваивается значение 90, 
		//представляющее букву z в наборе символов ASCII 
		//(и в Unicode)
		System.out.println("тenepь ch содержит " + ch);//Переменной типа char можно присвоить целочисленное значение
		
	}
}
