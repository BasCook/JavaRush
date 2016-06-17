package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] intMas = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++)
        {
            intMas[i] = Integer.parseInt(reader.readLine());
        }

        int i = 0;
        int temp;
        while (i < intMas.length/2)
        {
            temp = intMas[intMas.length-1-i];   //last element
            intMas[intMas.length-1-i] = intMas[i];  //
            intMas[i] = temp;
            i++;
        }
        for (int z = 0; z < intMas.length; z++)
        {
            System.out.println(intMas[z]);
        }

        //напишите тут ваш код

    }
}
