import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;


public class Engine {
    public static HashMap<String, Object> inputValidation() {
        UserInput inputData = new UserInput();
        String[] arrayInput = inputData.input();
        StringBuilder sb = new StringBuilder();
        HashMap<String, Object> inputMap = new HashMap<>();

        for (String key : arrayInput) {
            if (key.matches("\\d{1,2}\\.\\d{1,2}\\.\\d{4}")) {
                SimpleDateFormat date = new SimpleDateFormat("dd.MM.yyyy");
                date.setLenient(false);
                try {
                    date.parse(key);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
                inputMap.put("birthDate", key);
            } else if (key.length() == 1) {
                if (key.equals("f") | key.equals("m")) {
                    inputMap.put("sex", key);
                } else {
                    try {
                        throw new SexException();
                    } catch (SexException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Ошибка! Введен некорректный формат пола.");
                        e.printStackTrace();
                        System.exit(1);
                    }
                }
            } else if (key.matches("[0-9+]+")) {
                if (key.length() == 12) {
                    inputMap.put("phone", key);
                } else {
                    try {
                        throw new PhoneException();
                    } catch (PhoneException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Ошибка! Введен некорректный формат номера телефона.");
                        e.printStackTrace();
                        System.exit(1);
                    }
                }
            } else {
                if (key.matches("[A-Za-z]+")) {
                    sb.append(key).append(" ");
                } else {
                    try {
                        throw new NameException();
                    } catch (NameException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Ошибка! Введен некорректный формат ФИО.");
                        e.printStackTrace();
                        System.exit(1);
                    }
                }
            }
        }
        String[] name = String.valueOf(sb).split(" ");
        inputMap.put("firstName", name[1]);
        inputMap.put("lastName", name[0]);
        inputMap.put("patronymic", name[2]);

        return inputMap;
    }

    public static void writeFile(String data, String path) {
        try (FileWriter fw = new FileWriter(path, true)) {
            fw.append(data);
            fw.append("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}