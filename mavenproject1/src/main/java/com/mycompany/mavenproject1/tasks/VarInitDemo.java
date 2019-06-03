package com.mycompany.mavenproject1.tasks;

public class VarInitDemo {
	
	public static void main(String[] args) {
		 
		int x;
		
		for(x = 0; x < 6; x ++) {
			int y = -1;// переменная у инициализируется при каждом входе в блок 
			System.out.println("y: " + y);//всегда выводится значение -1 
			y = 100;
			System.out.println("Измeнeннoe значение у: " + y);
		}
		
	}

}
