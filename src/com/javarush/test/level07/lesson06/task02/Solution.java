package com.javarush.test.level07.lesson06.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> str = new ArrayList<String>();
        for (int i = 0; i < 5; i++)
        {
            str.add(reader.readLine());
        }
        String temp = "";
        int z = 0;

        for (String a : str)
        {
            if (temp.length() < a.length())
            {
                temp = a;
            }


        }
        for (String t : str)
        {
            if (t.length() == temp.length())
            {
                z = z + 1;
            }
        }
        //напишите тут ваш код
        for (int n = 0; n < z; n++)
        System.out.println(temp);
    }
}
