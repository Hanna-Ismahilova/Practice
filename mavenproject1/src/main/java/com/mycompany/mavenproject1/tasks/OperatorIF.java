/*
Демоснстрация применения опрератора if.
 */
package com.mycompany.mavenproject1.tasks;


public class OperatorIF {
    public static void main(String[] args){
    int a, b, c;
    a = 2;
    b = 3;
    
    if(a < b)
        System.out.println("a less than b");
    
    if(a == b)
        System.out.println("You shoule not see this text");
    System.out.println();
    
    c = a - b;// переменная "с" содержит значение -1 
    System.out.println("c contains -1");
    if(c >= 0)
        System.out.println("c - not negative digit");
    if(c < 0)
        System.out.println("c - negative digit");
    
    System.out.println("c contains 1");
    if(c >= 0)
        System.out.println("c - not negative digit");
    if(c < 0)
        System.out.println("c - negative digit");
    
    }
    
}
