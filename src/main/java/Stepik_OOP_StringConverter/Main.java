/*Напишите класс StringConverter (перед именем класса спецификатор доступа
указывать не надо). У этого класса определите  методы: convertToUpperCase
(получает строку на вход и переводит ее в верхний регистр,
возвращает полученную строку), convertToLowerCase
(получает строку на вход и переводит ее в нижний регистр, возвращает полученную строку).
Напишите класс Main, в нем функцию main в которой создается объект класса
StringConverter и принимается на вход от пользователя строка с клавиатуры,
затем вызывается для нее метод convertToUpperCase у объекта StringConverter
и печатается результат на экран, затем вызывается для нее метод convertToLowerCase
у объекта StringConverter и печатается результат на экран.
Для ввода строки с консоли используйте класс Scanner.
За основу используйте заготовку кода, представленную в поле для сдачи решения.
Русские символы при тестировании вводится с клавиатуры не будут (только англйиские).*/
package Stepik_OOP_StringConverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ConverterString converter = null;
        String str, strUpper, strLower;
        str = in.nextLine();
        strUpper = str.toLowerCase();
        strLower = str.toLowerCase();

        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
    }
}
