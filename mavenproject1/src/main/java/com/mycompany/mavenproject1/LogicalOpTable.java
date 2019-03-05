/*
 * Отображение таблицы истинности для логических операций 
 * */
package com.mycompany.mavenproject1;

public class LogicalOpTable {

	public static void main(String[] args) {
		boolean p, q, and, or, xor, not;
		
		System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
		
		p = true; q = true; and = true; or = true; xor = false; not = false;
		System.out.println(p + "\t" + q + "\t" + and + "\t" + or + "\t" + xor + "\t" + not + "\t");
//		System.out.println((p & q) + "\t" + (p | q) + "\t");
//		System.out.println((p ^ q) + "\t" + (!p) + "t");
		
		p = true; q = false; and = false; or = true; xor = true; not = false;
		System.out.println(p + "\t" + q + "\t" + and + "\t" + or + "\t" + xor + "\t" + not + "\t");
	
		p = false; q = true; and = false; or = true; xor = true; not = true;
		System.out.println(p + "\t" + q + "\t" + and + "\t" + or + "\t" + xor + "\t" + not + "\t");
		
		p = false; q = false; and = false; or = false; xor = false; not = true;
		System.out.println(p + "\t" + q + "\t" + and + "\t" + or + "\t" + xor + "\t" + not + "\t");
		
		
	}
}
