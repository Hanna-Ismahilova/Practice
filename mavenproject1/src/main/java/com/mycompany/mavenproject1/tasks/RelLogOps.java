/*
 *  Демонстрация использования операций сравнения и логических операций 
 * */

package com.mycompany.mavenproject1.tasks;

public class RelLogOps {
	public static void main(String[] args) {
		int i, j;
		boolean b1, b2;
		
		i = 10;
		j = 11;
		if(i < j) System.out.println("i < j");
		if(i <= j) System.out.println("i <= j");
		if(i != j) System.out.println("i != j");
		if(i == j) System.out.println("Этo не будет выполнено");
		if(i >= j ) System.out.println("Этo не будет выполнено");
		if(i > j) System.out.println("Этo не будет выполнено");
		
		b1 = true;
		b2 = false;
		if(b1 & b2) System.out.println("Этo не будет выполнено");
		if(! (b1 & b2)) System.out.println("!(Ы & Ь2): true");
		if(b1 | b2) System.out.println("b1 | Ь2: true");
		if(b1 ^ b2) System.out.println("b1 ^ b2: true");
				
		
	}

}
