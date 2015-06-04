package com.javarush.test.level05.lesson12.home03;

/* Создай классы Dog, Cat, Mouse
Создай классы Dog, Cat, Mouse. Добавь по три поля в каждый класс, на твой выбор. Создай объекты для героев мультика Том и Джерри. Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse(“Jerry”, 12 , 5), где 12 - высота в см, 5 - длина хвоста в см.
*/

import com.javarush.test.level05.lesson05.task03.Dog;

public class Solution
{
    public static void main(String[] args)
    {
        Mouse jerryMouse = new Mouse("Jerry", 12 , 5);
        Cat tomCat = new Cat("Tom", 14, 2);
        Dog qDog = new Dog("Redm", 20, 22);

        //Напишите тут ваш код
    }

    public static class Mouse
    {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
    public static class Dog
    {
        String name;
        int weight;
        int qpun;

        public Dog(String name, int weight, int qpun)
        {
            this.name = name;
            this.weight = weight;
            this.qpun = qpun;
        }
    }
    public static class Cat
    {
        String name;
        int deight;
        int hail;

        public Cat(String name, int deight, int tail)
        {
            this.name = name;
            this.deight = deight;
            this.hail = hail;
        }
    }
    //Напишите тут ваши классы

}
