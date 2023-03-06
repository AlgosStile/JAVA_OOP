package Stepik_OOP_DZ_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float a, b, result;

        a = in.nextFloat();
        b = in.nextFloat();
        result = a*b;
        System.out.printf("%.2f", (a*b));// "%.2f" - печатает число с точностью до 2-х знаков
        in.close();                      // после запятой.
    }
}
