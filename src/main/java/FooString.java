import java.util.Scanner;

public class FooString {
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
        FooString s = new FooString();
        Scanner sc = new Scanner(System.in);
        s.enterStr(sc);
        s.removeSpace(); //task12
        s.printStr();    //task11
    }
}
