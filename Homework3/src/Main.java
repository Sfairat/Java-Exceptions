import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String fileName;

        HashMap<String, Object> inputData = Engine.inputValidation();

        fileName = inputData.get("lastName") + ".txt";
        StringBuilder sb = new StringBuilder();
        for (String str : inputData.keySet()) {
            sb.append(inputData.get(str));
            sb.append(" ");
        }

        String filePath = fileName;
        Engine.writeFile(String.valueOf(sb), filePath);
        System.out.println("Файл с контактом создан.");
    }
}