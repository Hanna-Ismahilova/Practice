package com.mycompany.mavenproject1.tasks;

//Применение оператора continue 
public class ContDemo {

	public static void main(String[] args) {
		int i;
		
		// Вывести четные числа в пределах от О до 100
		for(i = 0; i <= 100; i++) {
			if ((i%2) != 0) continue;
		System.out.println(i);
	}
}
}
