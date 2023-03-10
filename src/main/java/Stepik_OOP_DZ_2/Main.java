/*
Напишите класс Dog (перед именем класса спецификатор доступа указывать не надо).
У этого класса определите три приватных поля (String breed, String size, int age) и конструктор
с тремя параметрами в таком же порядке (в конструкторе инициализацию полей класса делаете из
переданных конструктору значений). Добавьте в класс Dog метод getInfo без параметров,
который будет печать на экране значения полей объекта класса
следующим образом: breed:(значение поля breed), size:(значение поля size), age:(значение поля age).
Распечатывать без скобок, например: breed:Mastif, size:medium, age:5.
Добавьте метод eat с тремя параметрами (int carbohydrates, int squirrels, int fats),
значениями в граммах числа углеводов, белков, жиров, полученных с приемом пищи.
Этот метод будет возвращать целое число, количество калории, которые получит собака с приемом этой пищи.
Формула для вычисления калорий следующая: 1 грамм углеводов = 4 калории, 1 грамм белка = 4 калории,
1 грамм жира = 9 калорий.
Ваш класс будет тестироваться следующим классом Main:
*/

package Stepik_OOP_DZ_2;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Mastif", "big", 4);
        dog.getInfo();

        int calories = dog.eat(40,50,30);

        System.out.println(calories);
    }
}
