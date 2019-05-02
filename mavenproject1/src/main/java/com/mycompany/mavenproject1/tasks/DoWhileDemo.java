//Демонстрация использования цикла do-while 
package com.mycompany.mavenproject1.tasks;


public class DoWhileDemo {
	public static void main(String[] args) throws java.io.IOException {
		
		char ch;
		
		do {
			System.out.print("Нажмите нужную клавишу, а затем клавишу <ENTER>: ");
			ch = (char) System.in.read(); // получить символ с клавиатуры
		} while (ch != 'q');
	}

}
