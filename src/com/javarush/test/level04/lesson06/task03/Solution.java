package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        String[] snm = new String[3];
        int[] nnm = new int[3];
        int k = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for ( int i = 0; i < 3; i++)
        {
            snm[i] = reader.readLine();
            nnm[i] = Integer.parseInt(snm[i]);
        }

        for (int i = 0; i < 3; i++)
        {
            if ((i + 1) == 3) { i  = 0;}
            if (nnm[i] > nnm[i+1])
            {
                int temp = nnm[i];
                nnm[i] = nnm[i+1];
                nnm[i+1] = temp;
            }
            if (k > 4) {break;}
            else
            {
             k++;

            }
        }

        for ( int i = 2; i >= 0; i--){
            System.out.println(nnm[i]);
        }
    }
}
