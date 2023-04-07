//Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

package Task;

public class Task1 {
    public static void divError(int firstNum, int secondNum) {
        try {
            int result = firstNum / secondNum;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("Ошибка! Деление на ноль.");
        }
    }

    public static void arrError(int[] array, int index){
        try {
            array[index] = 76;
            System.out.println(array[26]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.out.println("Ошибка! Элемент с таким индексом отсутствует.");
        }
    }

    public static void nullError(String str) {
        try {
            System.out.println(str.toLowerCase());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            System.out.println("Ошибка! Передано пустое значение.");
        }
    }
}