package com.javarush.test.level07.lesson04.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

/* 2 массива
1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел. Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
       String[] strMas = new String[10];
       int[] strInt = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        while(i < strMas.length){
            strMas[i] = reader.readLine();
            strInt[i] = strMas[i].length();
            i++;
        }

        i = 0;
        while(i < strInt.length){
            System.out.println(strInt[i]);
            i++;
        }

        //напишите тут ваш код

    }
}
