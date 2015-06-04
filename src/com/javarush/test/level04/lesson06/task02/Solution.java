package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int k = 0;
        String[] nas = new String[4];
        int[] mas = new int[4];
        for (int i = 0; i < 4; i++)
        {
            nas[i] = reader.readLine();
            mas[i] = Integer.parseInt(nas[i]);

        }
        for ( int i = 0; i < 4; i++){
            if ( i == 3) {i = 0;}
            if (mas[i] > mas[i+1]){
                int temp = mas[i];
                mas[i] = mas[i+1];
                mas[i+1] = temp;
            }
            else {
                k++;
                if (k == 5) {break;}
            }
        }
        System.out.print(mas[3]);
    }
}
