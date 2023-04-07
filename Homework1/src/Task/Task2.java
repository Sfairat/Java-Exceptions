//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
//и возвращающий новый массив, каждый элемент которого равен разности элементов
//двух входящих массивов в той же ячейке. Если длины массивов не равны,
//необходимо как-то оповестить пользователя.

package Task;

import java.util.Random;

public class Task2 {
    public static int[] diffArrays(int[] firstArray, int[] secondArray) {
        if(firstArray.length != secondArray.length) throw new RuntimeException("Длины массивов не равны!");
        int[] resultArray = new int[firstArray.length];
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = firstArray[i] - secondArray[i];
        }
        return resultArray;
    }

    public static int[] fillArray(int length){
        int[] array = new int[length];
        Random rnd = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = rnd.nextInt(1,20);
        }
        return array;
    }
}
