import java.util.Scanner;

/**
 *  Задание №9: Ввод/вывод данных для массива
 *  Произведите ввод данных с клавиатуры в массив, а после этого произведите вывод массива на экран,
 *  где каждый элемент массива умножается на 2.
 *  Размер массива задается пользователем.
 */
public class FooArray {
    private int length;
    private double [] array;

    private void enterLength (Scanner sc) throws NumberFormatException {
        System.out.println("Enter length number: ");
        length = Integer.parseInt(sc.nextLine());
        array = new double[length];
    }
    private void enterValues (Scanner sc) throws NumberFormatException {
        for (int i = 0; i < length; i++) {
            System.out.println("Enter " + i + " el of array");
            array[i] = Double.parseDouble(sc.nextLine());
        }
    }
    private void printValues () {
        System.out.println("\n Results");
        for (int i = 0; i < length; i++) {
            System.out.println(2 * array[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FooArray arr = new FooArray();
        try {
            arr.enterLength(sc);
            arr.enterValues(sc);
        } catch (NumberFormatException err) {
            System.out.println("ERR: Length or values should be integer  " + err);
            return;
        }
        sc.close();
        arr.printValues();
    }
}
