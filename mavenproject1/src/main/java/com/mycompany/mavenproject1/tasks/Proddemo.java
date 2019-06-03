package com.mycompany.mavenproject1.tasks;

public class Proddemo {
	public static void main(String[] args) {
		byte b;
		int i;
		
		b = 10;
		i = b * b;//Приведение типов не требуется, так как тнn уже nовыwен да int 
		
		b = 10;
		b = (byte) (b * b);
		
		System.out.println("i and b: " + i + " " + b);//Здесь дnя присваивания значения int переменной типа byte  требуется приведение тнnовl
		
	}

}
