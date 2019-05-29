package com.mycompany.mavenproject1.classes.methodWith2Param;

public class Factor {

    boolean isFactor(int a, int b){

        if ((b % a) == 0) return true;//Этот метод имеет два параметра
        else return false;
    }
}
