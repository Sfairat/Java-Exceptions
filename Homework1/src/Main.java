import Task.Task1;
import Task.Task2;
import Task.Task3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] testArray = {1,2,3,4,5,6,7,8,9,10,11,12};
        Task1.divError(10, 0);
        Task1.arrError(testArray,26);
        Task1.nullError(null);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину первого массива: ");
        int input1 = scanner.nextInt();
        System.out.println("Введите длину второго массива: ");
        int input2 = scanner.nextInt();

        int[] array1 = Task2.fillArray(input1);
        int[] array2 = Task2.fillArray(input2);
        int[] diffArray = Task2.diffArrays(array1, array2);
        System.out.println(Arrays.toString(diffArray));

        int[] array3 = Task3.fillArrayFromZero(input1);
        int[] array4 = Task3.fillArrayFromZero(input2);
        int[] divArray = Task3.divArrays(array3, array4);
        System.out.println(Arrays.toString(divArray));
    }

}