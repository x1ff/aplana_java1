import java.util.Scanner;
    /*
     * Задача №13: Сравнение двух строк
     * Необходимо провести сравнение длины двух строк, которые были введены с клавиатуры и записаны в соответствующие переменные.
     * Вывести на экран строку с наибольшей длиной.
     * Если длины равны, вывести соответствтующее сообщение.
     */
public class ComparisonStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи Str1");
        String str1 = sc.nextLine();
        System.out.println("Введи Str2");
        String str2 = sc.nextLine();
        if (str1.length() > str2.length()) {
            System.out.println("INFO: Строка с наибольшей длиной" + str1);
        } else if (str1.length() < str2.length()) {
            System.out.println("INFO: Строка с наибольшей длиной" + str2);
        } else System.out.println("INFO: Длины строк равны");
        sc.close();
    }
}
