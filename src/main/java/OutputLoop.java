    /* Задача №8: Цикличный вывод данных на экран
     * Необходимо с помощью цикла вывести на экран числа от 1 до 50.
     */
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
