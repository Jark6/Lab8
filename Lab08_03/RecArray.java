package Lab08_03;

import java.util.Arrays;
import java.util.Random;

public class RecArray {

    Random random = new Random(); // Создание объекта класса Random для генерации "случайного" числа
    private static int Size;
    private static int[] nums = new int[Size];

    public RecArray(int size) {
        this.Size = size;
    }


    public void SetRecArray(int size) {
        int i = size;
        if (i >= 0) {
            SetRecArray(i--);
            nums[i] = random.nextInt(200);
            System.out.println("Заведен элемент массива [" + i + "] = " + nums[i]); // Сообщение пользователю "для красоты и понимания"
        }
    }
        public void GetRecArray() {
            int j = Size;
            if (j >= 0) {
                SetRecArray(j--);
                System.out.println("Выведен элемент массива [" + j + "] = " + nums[j]); // Сообщение пользователю "для красоты и понимания"
            }

        }
    }


   /* for (int i = 0 ; i < nums.length ; i++ ){
        nums[i] = random.nextInt(200); // Присвоение i-тому элементу массива случайного значения
        System.out.println("Элемент массива ["+i+"] = " + nums[i]); // Сообщение пользователю "для красоты и понимания"
    }
        Arrays.sort(nums); // Сортировка массива по возрастанию его элементов
        System.out.println("Произведена сортировка массива"); // Сообщение пользователю "для красоты и понимания"
        for (int i = 0 ; i < nums.length ; i++ ){
        System.out.println("Элемент массива ["+i+"] после сортировки =" + nums[i]); //Сообщение пользователю для красоты и понимания*/


