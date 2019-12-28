import java.util.Scanner;

public class BinaryNumber {
    private String binValue;
    private int intValue;
    private void setBinValue(String value) { binValue = value; }
    private void setIntValue(int value) { intValue = value; }
    private String getBinValue() { return this.binValue; }

    private BinaryNumber(){ }


    public BinaryNumber(String binValue){
        this.setBinValue(binValue);
    }

    public boolean isValidBinary() {
        if (this.binValue.length() > 32) {
            System.out.println("ERROR: Too big number for int type");
            return false;
        }
        for (char c : binValue.toCharArray()) {
            if (Character.isDigit(c)){
                int digit = Character.getNumericValue(c);
                if (digit > 1) {
                    System.out.println("ERROR: It's not binary number");
                    return false;
                }
            } else {
                System.out.println("ERROR: It's not binary number");
                return false;
            }
        }
        return true;
    }

    public int extractDemFromBin() {
            return Integer.parseInt(this.binValue, 2);
    }

    public static void main(String[] args) {
        BinaryNumber num = new BinaryNumber();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter binary number: ");
        num.setBinValue(sc.nextLine());
        if (num.isValidBinary()) {
         num.setIntValue(num.extractDemFromBin());
         System.out.println("RESULT: " + num.intValue);
        }
    }
}
