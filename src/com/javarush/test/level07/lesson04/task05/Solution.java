package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        String[] strBig = new String[20];
        String[] strSmall = new String[10];
        String[] strSmall2 = new String[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        while (i < 20)
        {
            strBig[i] = reader.readLine();
            i++;
        }

        i = 0;
        while (i < strBig.length)
        {
            if (i < 10)
            {
                strSmall[i] = strBig[i];
            }

            else
            {
                strSmall2[i-10] = strBig[i];
                System.out.println(strSmall2[i-10]);
            }
            i++;
        }


    }
}
