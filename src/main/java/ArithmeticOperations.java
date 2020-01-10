import javax.swing.*;

public class ArithmeticOperations {
    private double average;
    private int quotient; //average divided by 2

    private void setValue() throws NumberFormatException {
        double x = Double.parseDouble(JOptionPane.showInputDialog(null,"Введи X: ", "1. Ввод трех чисел с клавиатуры x, y, z", JOptionPane.QUESTION_MESSAGE));
        double y = Double.parseDouble(JOptionPane.showInputDialog(null,"Введи Y: ", "1. Ввод трех чисел с клавиатуры x, y, z", JOptionPane.QUESTION_MESSAGE));
        double z = Double.parseDouble(JOptionPane.showInputDialog(null,"Введи Z: ", "1. Ввод трех чисел с клавиатуры x, y, z", JOptionPane.QUESTION_MESSAGE));
        average = (x + y + z)/3;
        quotient = ((int) average) / 2;
    }
    private void displayResults() {
        JOptionPane.showMessageDialog(null,
            "2. INFO: Среднее арифметическое X, Y и Z: " + average + "\n" +
            "3. INFO: Деление среднего арифметического на 2 без остатка: " + quotient + "\n" +
            isQuotientGreater3(),
            "Результаты", JOptionPane.INFORMATION_MESSAGE);
    }
    private String isQuotientGreater3() {
        if (quotient > 3) {
            return "4. INFO: Программа выполнена корректно";
        } else return "4. INFO: Факт что среднее аревметическое меньше или равно 3, не влияет на корректность программы";
    }
    public static void main(String[] args) {
        ArithmeticOperations operations = new ArithmeticOperations();
        try {
            operations.setValue();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ERR: Введенено не число: \n" + e, "Ошибка", JOptionPane.ERROR_MESSAGE);
            return;
        }
        operations.displayResults();
    }
}
