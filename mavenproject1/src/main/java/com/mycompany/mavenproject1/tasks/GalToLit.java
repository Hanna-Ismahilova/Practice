//Преобразование галлонов в литры

package com.mycompany.mavenproject1.tasks;

public class GalToLit {
    public static void main(String[] args){
    double gallons;
    double liters;
    
    gallons = 10;
    liters = gallons * 3.7854;
    
    System.out.println(gallons + " gallons are equal to " + liters + " liters");
    
    } 
}
