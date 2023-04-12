//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и
//возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
//вместо этого, необходимо повторно запросить у пользователя ввод данных.

package Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static Object testException() {
        boolean floatNum = false;
        float input = 0f;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (!floatNum) {
            System.out.println("Введите число: ");
            try {
                input = Float.parseFloat(reader.readLine());
                floatNum = true;
            } catch (IOException | NumberFormatException e) {
                System.out.println(e.getMessage());
                System.out.println("Ошибка! Введите число.");
            }
        }
        return input;
    }
}
