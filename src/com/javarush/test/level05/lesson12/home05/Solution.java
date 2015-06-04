package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        int summa = 0;
        final String ggg  = "сумма";
        while(i < 10)
        {

            String str1 = reader.readLine();
            if (str1.equals(ggg))
            { i = 10;
                System.out.println(summa);
            }
            else
            {
                int result = Integer.parseInt(str1);
                summa = summa + result;
            }
        }
    }
}
