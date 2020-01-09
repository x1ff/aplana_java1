import java.util.Scanner;
public class Matrix {
    private static int length;
    private static int height;
    private int [][] arr;

    private void enterDimension(Scanner sc) throws java.util.InputMismatchException {
        System.out.println("Enter length: ");
        length = sc.nextInt();
        System.out.println("Enter height: ");
        height = sc.nextInt();
        if (height <= 0 | length <= 0) {
            System.out.println("ERR: Dimension should be greater than zero");
            return;
        }
        arr = new int[height][length];
    }
    private void enterValues(Scanner sc) throws java.util.InputMismatchException {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                System.out.println("Enter number ");
                arr[i][j] = sc.nextInt();
                System.out.println("Value recorded");
            }
        }
    }
    private void printResults() {
        System.out.println("\n Results");
        StringBuilder buff = new StringBuilder();
        for (int j = 0; j < length; j++) {
            buff.append(" ").append(3 * arr[0][j]);
        }
        System.out.println(buff);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matrix mat = new Matrix();
        try {
            mat.enterDimension(sc);
        } catch (java.util.InputMismatchException err) {
            System.out.println("ERR: Dimension should be integer  " + err);
            sc.close();
            return;
        }
        try {
            mat.enterValues(sc);
        } catch (java.util.InputMismatchException e) {
        System.out.println("ERR: Value can't recorded: " + e);
        sc.close();
        return;
        }
        mat.printResults();
        sc.close();
    }
}
