package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //int maximum = 0;
        int maximum = Integer.MIN_VALUE; //Минимальное значение типа данных int
        int sum = Integer.parseInt(reader.readLine());
        if (sum > 0)
        {
            int i = 0;
            while (i < sum)
            {
                int temp = Integer.parseInt(reader.readLine());
                if (temp > maximum)
                {
                    maximum = temp;
                }
                i++;
            }
            System.out.println(maximum);
        }
        //напишите тут ваш код

        else
        {

        }



    }
}
