package com.mycompany.mavenproject1;

public class LoopForWithoutBody {

	public static void main(String[] args) {
		int i;
		
		int sum = 0;
		for (i = 1; i <= 5; sum += i++); //в цикле отсутствует тело
		
		System.out.println("Сумма: " + sum);
	}
}
