import java.util.Scanner;

/**
 * Итоговая задача №3
 * Напишите программу конвертер валют.
 * Программа должна переводить рубли в доллары по текущему курсу.
 * Пользователь вводит текущий курс и количество рублей.
 * Итоговое значение должно быть округлено до двух знаков после запятой.
 * (Пример для теста работы программы:
 * Курс доллара = 67,55, Количество рублей: 1000, Итого: 14,80 долларов)
 */
public class MoneyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double course;
        double ruCount;
        try{
            System.out.println("INFO: Введите текущий курс");
            course = Double.parseDouble(sc.nextLine().replace(',','.'));
            if (course <= 0) {
                System.out.println("ERR: курс должен быть больше нуля");
                return;
            }
            System.out.println("INFO: Введите количество рублей");
            ruCount = Double.parseDouble(sc.nextLine().replace(',','.'));
            System.out.printf("INFO: Итого: %.2f долларов %n", ruCount/course);
        } catch (NumberFormatException e) {
            System.out.println("ERR: ошибка формата данных");
        }
        sc.close();
    }
}
