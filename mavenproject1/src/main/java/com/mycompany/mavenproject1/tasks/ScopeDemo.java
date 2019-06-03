package com.mycompany.mavenproject1.tasks;

public class ScopeDemo {
	
	public static void main(String[] args) {
		
		int x;// Эта переменная доступна для всего кода в методе main
		
		x = 10;
		if(x == 10) {// Начало новой области действия
			
			int y = 20;// Эта переменная доступна только в данном блоке 
			// Обе переменные, "х" и "у", доступны в данном кодовом блоке 
			
			System.out.println("x and у: " + x + " " + y);
			x = y * 2;
			
		}
		
		//y = 100;// Ошибка! В этом месте переменная "у" недоступна - находится вне своей обnасти действия 
		
		// А переменная "х" по-прежнему доступна
		System.out.println("x is " + x);
			
	}

}
