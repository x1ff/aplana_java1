import java.util.Scanner;

/**
 *  Задача №14: Преобразование типов
 *  Необходимо написать программу, которая будет реализовывать следующие действия:
 *  1. Ввод числа с клавиатуры и запись его в строковую переменную S
 *  2. Конвертация строковой переменной S в числовую переменную X типа int
 *  3. Конвертация числа X типа int в число Y типа double
 *  Все три числа разных типов необходимо в столбик вывести на экран
 */
public class TypeConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        try {
            System.out.println("Введите число");
            int X = Integer.parseInt(S);
            double Y = (double) X;
            System.out.println(S + "\n" + X + "\n" + Y);
        } catch (NumberFormatException e) {
            System.out.println("ERR: ошибка  конвертации: " + e);
        }

  }
}
