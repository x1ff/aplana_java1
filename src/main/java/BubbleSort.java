import java.util.ArrayList;
import java.util.Scanner;

/**
 * Задача №15: Сортировка данных в массиве
 * Написать программу сортировки по возрастанию заданного пользователем массива чисел.
 * Использовать пузырьковый метод сортировки.
 */
public class BubbleSort {
    public static void main(String[] args) {
        String RETURN_CONDITION = "stop";
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("INFO: Вводите целые числа в массив, для завершения ввода введите  stop");
        String buff;
        do {
            buff = sc.nextLine();
            if (buff.equals(RETURN_CONDITION) ) {
                break;
            } else {
                try{
                    arr.add(Integer.parseInt(buff));
                } catch (NumberFormatException e) {
                    System.out.println("ERR: ошибка формата данных: " + e);
                }
            }
        } while (true);
        for(int i = 0; i < arr.size(); i ++) {
            for(int j = 1; j < arr.size() - i; j++){
                if(arr.get(j-1) > arr.get(j)) {
                    int temp = arr.get(j - 1);
                    arr.set(j - 1, arr.get(j));
                    arr.set(j, temp);
                }
            }
        }
        for(int i = 0; i < arr.size(); i ++) {
            System.out.println("INFO: "+ i + " element is " + arr.get(i));
        }
    }
}
