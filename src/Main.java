

//        Задание 2.2
//        Напишите программу, которая будет находить все пары положительных целых чисел,
//        произведение которых будет равно значению value.
//        Например, если ввести число 6, программа должна выдать следующий результат:
//        1*6
//        2*3
//        3*2
//        6*1
//        Рекомендации по выполнению:
//        Для написания программы используйте два цикла for — один, вложенный в другой.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите положительное целое число:");
        int value = new Scanner(System.in).nextInt();

        for (int a = 1; a <= value; a++) {

            for (int b = 1; b <= value; b++) {

                if (a * b == value) {
                    int result = value / a;
                    System.out.println("Пары целых чисел: " + a + "*" + result);
                }
            }
        }
    }
}