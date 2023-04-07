//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
//и возвращающий новый массив, каждый элемент которого равен частному
//элементов двух входящих массивов в той же ячейке.
//Если длины массивов не равны, необходимо как-то оповестить пользователя.
//Важно: При выполнении метода единственное исключение, которое пользователь может увидеть
//- RuntimeException, т.е. ваше.

package Task;

import java.util.Random;

public class Task3 {
    public static int[] divArrays(int[] firstArray, int[] secondArray) {
        if (firstArray.length != secondArray.length) throw new RuntimeException("Ошибка! Длины массивов не равны.");
        int[] resultArray = new int[firstArray.length];
        for (int i = 0; i < resultArray.length; i++) {
            if (secondArray[i] == 0) throw new RuntimeException(("Ошибка! Деление на ноль."));
            resultArray[i] = firstArray[i] / secondArray[i];
        }
        return resultArray;
    }

    public static int[] fillArrayFromZero(int length){
        int[] array = new int[length];
        Random rnd = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = rnd.nextInt(0,20);
        }
        return array;
    }
}
