/*Ниже приведен пример программы, в которой блок кода используется для того, 
 * чтобы предотвратить деление на нуль. 
*/

package com.mycompany.mavenproject1;

public class DeniedDevideOnNull {
	public static void main(String[] args) {
		double i, j, d;
		
		i = 5;
		j = 10;
		
		//Телом этого оператора if является целый блок кода. 
		if(i != 0) {
			//Теnом оператора if явnяется весь бnок 
			System.out.println("i не равно нулю");
			d = j / i;
			System.out.println("j / i равно " + d);
		}
	}

}
