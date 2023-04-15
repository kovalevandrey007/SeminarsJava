package Task;

import java.lang.String;
public class Task2 {
    public static void main(String[] args) {

// Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd.

        String str = "aaaabbbcdddd";
        StringBuilder result = new StringBuilder();
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {

            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                if (count == 1) {
                    result.append(str.charAt(i));
                } else {
                    result.append(str.charAt(i)).append(count);
                    count = 1;
                }
            }
        }
        System.out.println(result.append(str.charAt(str.length() - 1)).append(count > 1 ? count : " ").toString());
    }
}
