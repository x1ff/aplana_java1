import java.util.Scanner;

/**
 *  Итоговая задача №1
 *  Ввести с консоли число в бинарном формате.
 *  Перевести его в десятичный формат, записать в переменную int и вывести на экран.
 *  Необходимо использовать циклы, нельзя использования готовые методы языка Java,
 *  для перевода числа из одной системы счисления в другую.
 */
public class FinalBinaryNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("INFO: Enter binary number");
        System.out.println("INFO: for negative number 32nd bit should be 1");
        char [] number = sc.nextLine().toCharArray();
        sc.close();
        if (number.length > 32) {
            System.out.println("ERR: number is too big number.length = " + number.length);
            System.out.println("INFO: Integer type has 32 bit, and you can enter 32 symbols or less");
            return ;
        }
        int tempNumber = 0;
        for(int i = 1; i <= number.length; i++){
            int currentBit = Character.getNumericValue(number[number.length - i]);
            if (currentBit < 2 && Character.isDigit(number[number.length - i])) {
                if( (i == 32) && (currentBit == 1) ) {
                    tempNumber = tempNumber*(-1);
                } else {
                    tempNumber = (int) (tempNumber + currentBit * Math.pow(2, i - 1));
                }
            } else {
                System.out.println("ERR: is not valid binary");
                System.out.println("INFO: You can use only two symbols '0' and '1'");
                return;
            }
        }
        System.out.println("INFO: number is " + tempNumber);
    }
}