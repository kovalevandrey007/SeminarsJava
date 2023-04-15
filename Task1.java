package Task;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

// Дано четное число N (>0) и символы c1 и c2.
// Написать метод, который вернет строку длины N,
// которая состоит из чередующихся символов c1 и c2, начиная с c1.

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите длину строки: ");
            int num = scanner.nextInt();
            StringBuilder sb = new StringBuilder();
            String a = "c1";
            String b = "c2";
            for (int i = 0; i < num; i++) {
                if (i % 2 == 0) {
                    sb.append(a);
                } else {
                    sb.append(b);
                }
            }
            System.out.println(sb.toString());
        }
    }
