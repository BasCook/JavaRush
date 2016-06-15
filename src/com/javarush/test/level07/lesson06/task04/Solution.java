package com.javarush.test.level07.lesson06.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 10 строчек в начало списка
1. Создай список строк в методе main.
2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> strMas = new ArrayList();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        while (i < 10)
        {
            strMas.add(0, reader.readLine());
            i++;
        }
        i = 0;
        while (i < strMas.size())
        {
            System.out.println(strMas.get(i));
            i++;
        }

    }
}
