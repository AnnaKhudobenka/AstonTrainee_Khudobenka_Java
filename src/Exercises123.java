import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Exercises123 {
    public static void main(String[] args) {
        int[] array = IntStream.rangeClosed(1, 15).toArray();

        isValueGreaterThanSeven();
        isNameVyacheslav();
        isElementMultipleOfThree(array);
    }

    /** 1. Составить алгоритм: если введенное число больше 7, то вывести “Привет” */

    public static void isValueGreaterThanSeven() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        if (scanner.hasNextInt()) {
            int value = scanner.nextInt();
            if (value > 7) {
                System.out.println("Привет");
            } else {
                System.out.println("Вы ввели число меньше 7");
            }
        } else {
            System.out.println("Вы ввели не число");
        }
    }

        /** 2. Составить алгоритм: если введенное имя совпадает с Вячеслав,
         то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени" */

    public static void isNameVyacheslav() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = scanner.next();
        if (name.equalsIgnoreCase("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }

    /** 3. Составить алгоритм: на входе есть числовой массив,
         необходимо вывести элементы массива кратные 3 */

    public static void isElementMultipleOfThree(int[] arr) {
        System.out.println("Полученный массив: " + Arrays.toString(arr));
        System.out.print("Элементы массива, кратные 3: ");
        for (int j : arr) {
            if (j % 3 == 0) {
                System.out.print(j + " ");
            }
        }
    }
}