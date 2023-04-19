import java.util.Arrays;
import java.util.Scanner;

public class UserInput {
    public String[] input() {
        Scanner scanner = new Scanner(System.in);
        boolean inputValidation = false;
        String[] arrayInput = new String[0];
        while (!inputValidation) {
            System.out.println("Введите через пробел  Ф.И.О, дату рождения в формате дд.мм.гггг, номер телефона (пример: +79991112233), пол (m/f)): ");
            String input = scanner.nextLine();
            arrayInput = input.split(" ");
            if (arrayInput.length > 6) {
                System.out.println("Введено больше данных, чем требуется.");
            } else if (arrayInput.length < 6) {
                System.out.println("Введено не достаточно данных.");
            } else {
                inputValidation = true;
            }
        }
        return arrayInput;
    }
}