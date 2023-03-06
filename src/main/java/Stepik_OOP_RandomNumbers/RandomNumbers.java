package Stepik_OOP_RandomNumbers;

//Программа обрабатывает массив из 100 дробных чисел и
// выводит на экран max число min число и avg-среднее арифметическое.
public class RandomNumbers {
    public static void main(String[] args) {

        int n = 100; //объявляем массив
        double[] array = new double[n];//выделем место в памяти

        for (int i = 0; i<array.length; i++) {
            array[i] = Math.random(); // в этом цикле инициализируем случайными числами от 0 до 1
        }
        double max  = array[0]; // объявляем начальные значения
        double min  = array[0]; // объявляем начальные значения
        double avg  = array[0]; // объявляем начальные значения

        for (int i = 0; i < array.length; i++) { //в этом цикле считаем max min и avg
            if (max < array[i])
                max = array[i];
            if (min > array[i])
                min = array[i];
            avg = avg + array[i]; // считаем сумму чисел в этой переменной (avg)

        }
        avg = avg / array.length; // находим среднее арифметическое всех наших чисел
        System.out.println("max = "+max); // выводим max
        System.out.println("min = "+min); // выводим min
        System.out.println("avg = "+avg); // выводим avg
    }
}


