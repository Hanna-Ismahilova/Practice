package com.mycompany.mavenproject1.classes.arrays.arraySorting;

public class Bubble {
    public static void main(String[] args) {

        int nums[] = {99, -10, 1000123, 18, -978,
                5623, 456, -9, 287, 49};

        int a, b, t;
        int size;
        size = 10; //--количество сортируемых элементов--//

        // --Отобразить исходный массив--//
        System.out.println("Исходный массив (или таблица): ");
        for (int i = 0; i < size; i++)
            System.out.println(" " + nums[i]);
        System.out.println();

        // --Реализовать алгоритм пузырьковой сортировки--//
        for (a = 1; a < size; a++)
            for (b = size - 1; b >= a; b--){
                if (nums[b-1] > nums[b]){ // если требуемый порядок
                                         // следования не соблюдается,
                                        // поменять элементы местами
                    t = nums[b-1];
                    nums[b-1] = nums[b];
                    nums[b] = t;
                }
            }
        System.out.println("Отсортированный массив: ");
            for (int i = 0; i < size; i++)
                System.out.println(" " + nums[i]);
        System.out.println();
    }
}
