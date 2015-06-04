package com.javarush.test.level04.lesson16.home02;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        String[] str = new String[3];
        int[] mas = new int[3];
        int k = 0;
        for (int i = 0; i < 3; i++){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            str[i] = reader.readLine();
            mas[i] = Integer.parseInt(str[i]);
        }
        for (int i = 0; i < 3; i++)
        {
            if (i+1 == 3) {i = 0;}
            if (mas[i] < mas[i+1]){

                int temp = mas[i];
                mas[i] = mas[i+1];
                mas[i+1] = temp;
            }
            else{
                k++;
                if (k == 12){break;}
            }
        }
        System.out.print(mas[1]);   //Напишите тут ваш код
    }
}
