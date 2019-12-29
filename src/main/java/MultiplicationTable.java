import java.util.Scanner;

public class MultiplicationTable {
    private String number;

    /**
     * 1 - long: n - Integer, n < |+- 9 223 372 036 854 775 807|;
     * 2 - double: a/b =
     * 3 - bigger then |long|  n > |+- 9 223 372 036 854 775 807|
     * 4 - complex number: n = z = x + iy
     * 5 - Fraction: a/b
     * 6 - with e
     */
    private byte typeOfNumber;

    private void setNumber(String nextLine) {
        this.number = nextLine;
    }


    public static void main(String[] args) {
        MultiplicationTable myTable = new MultiplicationTable();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number, what ever you want!!!: ");
        myTable.setNumber(sc.nextLine());
    }
}
