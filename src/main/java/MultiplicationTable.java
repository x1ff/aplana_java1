import javax.swing.*;
import java.awt.*;
    /* Задача №5: Таблица умножения
     * Необходимо вывести на экран таблицу умножения от 1 до 10 для введённого пользователем любого числа.
     * Использовать циклы запрещено.
     */

public class MultiplicationTable {
    private String number;
    //Так как термин любое число не определен, определим его сами как int
    private JTable table;
    private void setNumber(String str) {
        this.number = str;
    }

    private MultiplicationTable() {
    }
    private void initTable() throws NumberFormatException {
        setNumber(JOptionPane.showInputDialog("Enter any number: "));
        /*
         * Так как нельзя использовать циклы, то от 1 до 10 у нас будет с шагом 9,
         * если нужен шаг меньше, то дозаполним columnNames  и data
         */
        String[] columnNames = {
            number + "x1", number + "x10"
        };
         int parsedInt = Integer.parseInt(number);
         Object[][] data = {{parsedInt, parsedInt * 10}};
         this.table = new JTable(data, columnNames);
    }
    private void frameTable() {
        javax.swing.SwingUtilities.invokeLater(() -> {
            JFrame.setDefaultLookAndFeelDecorated(true);
            JFrame frame = new JFrame("Multiplication Table");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JScrollPane scrollPane = new JScrollPane(table);
            frame.getContentPane().add(scrollPane);
            frame.setPreferredSize(new Dimension(800, 74));
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
    public static void main(String[] args) {
        MultiplicationTable myTable = new MultiplicationTable();
        try {
            myTable.initTable();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ERR: Введенено не число:" + e, "NumberFormatException", JOptionPane.ERROR_MESSAGE);
            return;
        }
        myTable.frameTable();
    }
}
