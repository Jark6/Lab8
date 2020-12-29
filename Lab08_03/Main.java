/*
Создать приложение, позволяющее ввести и вывести одномерный массив целых чисел.
Для ввода и вывода массива разработать рекурсивные методы вместо циклов for.
 */

package Lab08_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int Size = id.nextInt();
        System.out.println("Размер массива равен "+ Size); // Сообщение пользователю "для красоты и понимания"

        RecArray RA1 = new RecArray(Size);
    }
}