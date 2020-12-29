package Lab08_03;

import java.util.Random;

public class RecArray {

    Random random = new Random(); // Создание объекта класса Random для генерации "случайного" числа
    private static int Size;
    private static int[]nums;

    public RecArray(int size) {
        Size = size;
        nums= new int[Size];
        System.out.println("ввод произвольных значений в одномерный массив");
        SetRecArray(Size);
        System.out.println("вывод значений из одномерного массива");
        GetRecArray(Size);
    }

    protected void SetRecArray(int x) {
        int i = x-1;
        if (x != 0) {
            SetRecArray(x - 1);
            nums[i] = random.nextInt(200);
            System.out.println("Заведен элемент массива [" + i + "] = " + nums[i]); // Сообщение пользователю "для красоты и понимания"
            if (i == nums.length-1){System.out.println("конец ввода\n");}
        }
    }
    protected void GetRecArray(int x) {
        int j = x-1;
        if (x != 0) {
            GetRecArray(x-1);
            System.out.println("Выведен элемент массива [" + j + "] = " + nums[j]); // Сообщение пользователю "для красоты и понимания"
            if (j == nums.length-1){System.out.println("конец массива\n");}
        }
    }
}