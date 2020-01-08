import java.util.Scanner;

public class FooArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length number: ");
        int length;
        try {
            length = sc.nextInt();
        } catch (java.util.InputMismatchException err) {
            System.out.println("ERR: введено не число " + err);
            return;
        }
        String[] arr = new String[length + 1];
        System.out.println("Enter " + length + " numbers");
        for (int i = 0; i <= length; i++) {
            arr[i] = sc.nextLine();
        }
        sc.close();
        System.out.println("\n Results");
        for (int i = 0; i <= length; i++) {
            System.out.println(arr[i]);
        }
    }
}
