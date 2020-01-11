import javax.swing.*;

/**
 *  Задача №7: Условие вывода данных
 *  Необходимо написать программу, где бы пользователю предлагалось ввести с клавиатуры число в переменную number.
 *  В программе должны присутствовать константы X, Y, Z.
 *  Программа должна сравнивать введенное значение с клавиатуры со значением констант и вывести на экран сообщение
 *  "Данное значение имеется в константах" если number=X или Y или Z.
 *  Если переменная отличается от констант, нужно вывести оповещение
 *  "Такой константы нет!"
 */
public class OutputCondition {
    private int number;
    private static final int X = 0;
    private static final int Y = 100;
    private static final int Z = 666;

    private void enterNumber () throws NumberFormatException {
        number = Integer.parseInt(JOptionPane.showInputDialog(null,"Введи number: ",
                "Ввод числа", JOptionPane.QUESTION_MESSAGE));
    }
    private void displayResult () {
        if ((number == X) | (number == Y) | (number == Z)) {
            JOptionPane.showMessageDialog(null,"Данное значение имеется в константах",
                    "Результаты", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,"Такой константы нет!",
                    "Результаты", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public static void main(String[] args) {
        OutputCondition condition = new OutputCondition();
        try {
            condition.enterNumber();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ERR: Введенено не число: \n" + e,
                    "Ошибка", JOptionPane.ERROR_MESSAGE);
            return;
        }
        condition.displayResult();
    }
}
