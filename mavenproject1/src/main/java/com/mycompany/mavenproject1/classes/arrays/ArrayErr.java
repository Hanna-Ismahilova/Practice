package com.mycompany.mavenproject1.classes.arrays;

public class ArrayErr {
    public static void main(String[] args) {
        int sample[] = new int[10];
        int i;

        // Искусственно создать выход индекса за границы массива
        for (i = 0; i < 100; i = i+1)
            sample[i] = i;
    }
}
