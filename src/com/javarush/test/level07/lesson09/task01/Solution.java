package com.javarush.test.level07.lesson09.task01;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Три массива
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));      //напишите тут ваш код
        ArrayList<Integer> x3 = new ArrayList<Integer>();
        ArrayList<Integer> x2 = new ArrayList<Integer>();
        ArrayList<Integer> xAll = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++)
        {
            int temp = Integer.parseInt(reader.readLine());
            if ( temp % 3 == 0 && temp % 2 == 0)
            {
                x3.add(temp);
                x2.add(temp);
                continue;
            }
            if (temp % 3 == 0){
                x3.add(temp);
                continue;
            }
            if (temp % 2 == 0)
            {
                x2.add(temp);
                continue;
            }
            xAll.add(temp);
        }

        printList(x3);
        printList(x2);
        printList(xAll);
    }

    public static void printList(List<Integer> list)
    {
        for ( int i = 0; i < list.size(); i++)
       System.out.println(list.get(i)); //напишите тут ваш код
    }
}
