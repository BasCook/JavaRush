package com.javarush.test.level07.lesson04.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Массив из строчек в обратном порядке
1. Создать массив на 10 строчек.
2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        String[] strMas = new String[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i =0;
        while (i < 10)
        {
            strMas[i]= null;
            i++;
        }
        i = 0;
        while (i < 8)
        {
            strMas[i] = reader.readLine();
            i++;
        }
        i = strMas.length-1;
        while (i >= 0)
        {
            System.out.println(strMas[i]);
            i--;
        }
    }
}