package com.javarush.test.level07.lesson06.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Удали последнюю строку и вставь её в начало
1. Создай список строк.
2. Добавь в него 5 строчек с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> strList = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;

        while (i < 5)
        {
            strList.add(reader.readLine());
            i++;
        }
        i = 0;
        while(i < 13)
        {
            strList.add(0, strList.get(strList.size()-1));
            strList.remove(strList.size()-1);
            i++;
        }
        i = 0;
        while(i < strList.size())
        {
            System.out.println(strList.get(i));
            i++;
        }

        //напишите тут ваш код

    }
}
