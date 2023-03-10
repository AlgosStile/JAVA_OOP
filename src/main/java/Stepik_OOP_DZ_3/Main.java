/*Предыдущее задание + это:
Добавьте в класс Dog еще одно приватное поле (float weight) для него используйте значение по умолчанию
при инициализации объекта 5.0 (килограмм). Добавьте еще один конструктор,
который четвертым параметром принимает значение weight. Метод getInfo менять не требуется.
Добавьте метод checkCalories с одним параметром (int calories).
Этот метод вызывается после метода eat и получает вычисленное методом eat значение калорий.
Исходя из веса собаки и количества калорий метод checkCalories возвращает:
слово "good" (если число калорий в интервале +-30 от нужного значения), либо "bad"
(если число калорий больше чем на 30 пунктов меньше нормы), либо "overate"
(если число калорий больше чем на 30 пунктов больше нормы).
Нормативом для собаки будем считать 535 калорий на 10 кг веса за один прием пищи.
Используем простую линейную формулу для определения нормы для текущего веса.
Например если собака весит 16.5 килограмм то норма для нее: (535/10)*16.5=882.75.
*/
//
package Stepik_OOP_DZ_3;

public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Mastif", "big", 4, 16.5f );

        Dog dog2 = new Dog("lapdog", "small", 3, 2.5f );
        dog1.getInfo();

        int calories;
        String result;
        calories = dog1.eat(40,50,30);
        result = dog1.checkCalories(calories);

        System.out.println(result);

        calories = dog2.eat(6,6,8);
        result = dog2.checkCalories(calories);

        System.out.println(result);
    }
}
