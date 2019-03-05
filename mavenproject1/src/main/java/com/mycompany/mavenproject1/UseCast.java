/*
 * Приведение типов для правильного вычисления выражения 
 * */
package com.mycompany.mavenproject1;

public class UseCast {
	public static void main(String[] args) {
		int i;
		
		for(i = 0; i < 2; i ++) {
			System.out.println(i + " / 3: " + i / 3);
			System.out.println(i + " / 3 с дробной частью: " + (double) i / 3);
			System.out.println();
		}
	}

}
