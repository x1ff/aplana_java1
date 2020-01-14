import java.util.Scanner;

/**
 *  Задача №12: Удаление всех пробелов в заданном тексте
 *  Для введенной с клавиатуры строки необходимо провести отсев пробелов.
 *  Результат в виде строки без пробелов вывести на экран. 
 */
public class FooString2 {
    private String str;
    private void enterStr(Scanner sc) {
        System.out.println("Enter string: ");
        str = sc.nextLine();
    }
    private void removeSpace() {
        str = str.replaceAll(" ", "");
    }
    private void printStr() {
        System.out.println("Print string \n" + str);
    }
    public static void main(String[] args) {
        FooString2 s = new FooString2();
        Scanner sc = new Scanner(System.in);
        s.enterStr(sc);
        s.removeSpace();
        s.printStr();
    }
}
