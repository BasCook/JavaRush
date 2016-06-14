package com.javarush.test.level07.lesson06.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая короткая строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> strMas = new ArrayList<String>();
        ArrayList<String> strMas2 = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        String temp;
        while(i < 5){
            strMas.add(reader.readLine());
            i++;
        }
        i = 0;
        while(i < strMas.size()){
            if(strMas.get(i).length() < strMas.get(i+1).length()){
                strMas2.add(strMas.get(i));
            }

        }
        //напишите тут ваш код

    }
}
