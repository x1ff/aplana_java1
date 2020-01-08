public class OutputLoop {
    private void displayNumbers() {
        System.out.println("####### LOOP ########");
        for (int i = 1; i <= 50; i++) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        OutputLoop loop = new OutputLoop();
        loop.displayNumbers();
    }
}
