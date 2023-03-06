package Stepik_OOP_TestArrayList;

import java.util.ArrayList;
import java.util.Iterator;
//Создаем динамический массив. Узнаем как его создавать, как объявлять

public class TestArrayList {
    public static void main(String[] args) {

        System.out.println("Hello ArrayList");

        ArrayList<Float> mas = new ArrayList<>();//объявляем динамический массив через ArrayList
// типы в ArrayList могут бытьк как примитивные так и сложные любые классы


        int size = Integer.valueOf(args[0]);// конвертируем строку в Integer

        for (int i = 0; i < size; i++) {
            float num = (float)Math.random();

            mas.add(num);//так можно добавить элемент массива

            System.out.println(mas.get(i));
            
        }

        Iterator<Float> iter = mas.iterator();//объявляем итератор массива mas.iterator(),
            //который изначально стартует с нуля 0.
        System.out.println("Hello Iterator");
        while (iter.hasNext()) { // hasNext() - говорит нам есть ли следующий элемент или нет

            System.out.println(iter.next());//так как мы используем метод next,
            // то каждый раз здесь будет использоваться новое значение.
        }


    }
}
