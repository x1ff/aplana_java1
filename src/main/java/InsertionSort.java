import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Написать программу сортировки по возрастанию заданного пользователем массива чисел.
 * Пользователь программы должен задавать размер массива и наполнять его числами.
 * Использовать одну из следующих сортировок: прямого выбора, вставки, быстрая, Шелла.
 */
public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("INFO: Вводите размер массива");
        int ln;
        try{
            ln = Integer.parseInt(sc.nextLine());
            if(ln < 0) {
                System.out.println("ERR: размер массива должен быть больше 0");
                return;
            }
        } catch (InputMismatchException e) {
            System.out.println("INFO: длинна изадается целыми положительными числами");
            return;
        }
        System.out.println("INFO: Введите " + ln + " целых чисел в массив");
        for (int i = 0; i < ln; i++) {
            try{
                arr.add(Integer.parseInt(sc.nextLine()));
            } catch (NumberFormatException e) {
                System.out.println("ERR: ошибка формата данных: " + e);
                return;
            }
        }
        for(int i = 0; i < arr.size(); i ++) {
            int temp = arr.get(i);
            int j = i;
            while (j > 0 && temp < arr.get(j-1)) {
                arr.set(j, arr.get(j-1));
                j--;
            }
            arr.set(j, temp);
        }
        for(int i = 0; i < arr.size(); i ++) {
            System.out.println("INFO: "+ i + " element is " + arr.get(i));
        }
    }
}
