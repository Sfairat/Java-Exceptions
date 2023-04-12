//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
//Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

package Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static Object secondTestException() {
        String input;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите строку: ");
        try {
            input = reader.readLine();
            if(input.equals("")) throw new RuntimeException("Введена пустая строка");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    return input;
    }
}
