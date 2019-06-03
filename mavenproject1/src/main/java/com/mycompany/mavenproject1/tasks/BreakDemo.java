package com.mycompany.mavenproject1.tasks;

public class BreakDemo {
	public static void main(String[] args) {
		int num;
		
		num = 100;
		
		// Выполнять цикл до тех пор, пока квадрат значения 
		// переменной i меньше значения переменной numv
		
		for (int i = 0; i < num; i ++) {
			if (i * i >+ num) break;// прекратить цикл, если i*i >= 100
			System.out.println(i + " ");
		}
		System.out.println("Цикл завершен.");
		
	}

}
