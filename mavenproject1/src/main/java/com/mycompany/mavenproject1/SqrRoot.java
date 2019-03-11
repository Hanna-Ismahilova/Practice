/*
 *  Вывод квадратных корней чисел от 1 до 99 
 *  вместе с ошибкой округления 
 */

package com.mycompany.mavenproject1;

public class SqrRoot {
	public static void main(String[] args) {
		double num, sroot, error;
		
		for(num = 1.0; num < 100; num++) {
			sroot = Math.sqrt(num);
			System.out.println("Kopeнь квадратный из " + num + " равен " + sroot);
			
			//вычислить ошибку округления 
			error = num - (sroot * sroot);
			System.out.println("0шибкa округления: " + error);
			System.out.println();
		}
	}

}
