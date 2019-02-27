/*
 * Определение длины гипотенузы, исходя из длины катетов, по теореме Пифагора 
 */
package com.mycompany.mavenproject1;

public class Hypot {
	
	public static void main(String[] args) {
		
		double x, y, z;
		
		x = 3; 
		y = 4;
		
		z = Math.sqrt(x * x + y * y);
		System.out.println("Длинa гипотенузы: " + z);
	}

}
