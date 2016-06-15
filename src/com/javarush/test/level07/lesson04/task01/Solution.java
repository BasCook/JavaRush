package com.javarush.test.level07.lesson04.task01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Collections;

/* Максимальное среди массива на 20 чисел
1. В методе initializeArray():
1.1. Создайте массив на 20 чисел
1.2. Считайте с консоли 20 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }
    public static int[] initializeArray() throws IOException {
        int[] list = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i =0; i < 20; i++)
        {
            list[i] = Integer.parseInt(reader.readLine());
        }
        //Инициализируйте (создайте и заполните) массив тут
        return list;
    }

    public static int max(int[] array) {
        int z = 0;
        int i = 0;
        while ( i < array.length)
        {
            if (z < array[i])
            {
               z = array[i];
            }
            i++;
        }
        //Найдите максимальное значение в этом методе
        return z;
    }
}
