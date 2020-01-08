import java.util.Scanner;

public class FooArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length number: ");
        int length;
        try {
            length = sc.nextInt();
        } catch (java.util.InputMismatchException err) {
            System.out.println("ERR: Length should be integer  " + err);
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
            try {
                System.out.println(2 * Double.parseDouble(arr[i]));
            } catch (NumberFormatException e) {
                System.out.println("Program can't multiply " + arr[i] + "and 2 :" + e);
            }
        }
    }
}
