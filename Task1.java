package Tasks;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.*;

public class Task1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(in);  // Задаем с клавиатуры размер массива
        out.println("Введите размер массива: ");
        int size = input.nextInt();
        int[] arr = new int[size]; // Инициализируем массив
        Random rnd = new Random(); // Задаем рандомный класс инициализации массива
        out.println("Наш массив: ");;

        for (int i = 0; i < size; i++) { // Пробегаюсь по элементам массива
            arr[i] = rnd.nextInt(10); // Задал рандом от 0 до 9
            out.print(arr[i] + " "); // Распечатываю полученный массив
        }
        int max = arr[0]; // Ввожу переменную мах
        int min = arr[0]; // Ввожу переменную мin
        for (int i = 0; i < arr.length; i++) { //Пробегаюсь по элементам массива
            if (arr[i] > max) { // Задал условие для мах
                max = arr[i];
            }
            if (arr[i] < min){ // Задал условие для мin
                min = arr[i];
            }
        }
        out.println("\n");
        out.println("Максимальный элемент массива = " + max); // Распечатываю max
        out.println("Минимальный элемент массива = " + min); // Распечатываю min
    }
}
