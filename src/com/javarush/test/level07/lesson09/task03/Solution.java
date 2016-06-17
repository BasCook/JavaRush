package com.javarush.test.level07.lesson09.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* Слово «именно»
1. Создай список из слов «мама», «мыла», «раму».
2. После каждого слова вставь в список строку, содержащую слово «именно».
3. Используя цикл for вывести результат на экран, каждый элемент списка с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> str = new ArrayList<String>();
        str.add("мама");
        str.add("мыла");
        str.add("раму");
        //int temp = str.size();
        for (int i = 1; i < str.size()+1; i = i +2)
        {
            str.add(i, "именно");
            if (str.size() > 7)
            {
                break;
            }
        }
        for (int i = 0; i < str.size(); i++)
        {
            System.out.println(str.get(i));
        }
        //напишите тут ваш код

    }
}
