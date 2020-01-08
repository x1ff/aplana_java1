import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        int length;
        try {
            length = sc.nextInt();
        } catch (java.util.InputMismatchException err) {
            System.out.println("ERR: Length should be integer  " + err);
            return;
        }
        System.out.println("Enter height: ");
        int height;
        try {
            height = sc.nextInt();
        } catch (java.util.InputMismatchException err) {
            System.out.println("ERR: height should be integer  " + err);
            return;
        }
        if (height <= 0 | length <= 0) {
            System.out.println("ERR: Dimension should be greater than zero");
            return;
        }
        int [][] arr = new int[height][length];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                System.out.println("Enter number ");
                try{
                    arr[i][j] = sc.nextInt();
                    System.out.println("Value recorded");
                } catch (java.util.InputMismatchException e) {
                    System.out.println("ERR: Value can't recorded: " + e);
                    return;
                }
            }
        }
        sc.close();
        System.out.println("\n Results");
        StringBuilder buff = new StringBuilder();
        for (int j = 0; j < length; j++) {
            buff.append(" ").append(3 * arr[0][j]);
        }
        System.out.println(buff);
    }
}
