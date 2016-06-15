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
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i;
        int maximum = 0;
        if(N <= 0)
            System.out.println("Введите положительное число");
        else
        {
            int[]mass = new int[N];
            for (i = 0; i < N; i++)
            {
                mass[i] = sc.nextInt();
                if (mass[i] > maximum)
                    maximum = mass[i];
            }
        }
        System.out.println(maximum);
    }
    }
}
