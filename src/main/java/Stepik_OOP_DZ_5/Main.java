/*Напишите программу на языке java8, которая принимает
на вход целое число n (int) количество чисел, после этого принимает от пользователя n чисел типа double.
Вычисляет минимальное и максимальное из введенных чисел и выводит их на экран.
Точность вывода числе double корректировать не требуется.
 */


package Stepik_OOP_DZ_5;

import java.util.Scanner;//
import java.util.Arrays;//

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        double[] nums = new double[amount];
        for (int i = 0; i < nums.length; i++) {
            scanner.nextLine();
            nums[i] = scanner.nextDouble();
        }
        Arrays.sort(nums);
        System.out.println(nums[0] + "\n" + nums[nums.length - 1]);
    }
}
