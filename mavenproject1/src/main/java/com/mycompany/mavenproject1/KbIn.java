/*
 * Чтение символа с клавиатуры 
 * */
package com.mycompany.mavenproject1;

public class KbIn {
	public static void main(String[] args) throws java.io.IOException {
		char ch;
		
		System.out.println("Haжмитe нужную клавишу, а затем клавишу ENTER: ");
		ch = (char) System.in.read();//получить символ
		
		System.out.println("Bы нажали клавишу " + ch);
	}

}
