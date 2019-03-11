/*
 * Цикл for, выполняющийся с отрицательным приращением переменной 
 */
package com.mycompany.mavenproject1;

public class DecreaseForLoop {

	public static void main(String[] args) {
		int x;
		
		for(x = 100; x > -100; x += 1) {
			System.out.println(x);
		}
	}
}