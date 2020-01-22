import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/** Задача №18: Выгрузка данных из файла, проверка и перезапись
 * Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt,
 * а потом в этот же файл перезаписывать текстовые данные, введенные вручную.
 * Количество строк после перезаписи должно быть столько же, сколько и в изначальном варианте.
 */
public class MyFileReWriter {
    public static void main(String[] args) throws IOException {
        File task18 = new File("src/main/resources/task18.txt");
        Scanner sc = new Scanner(task18);
        int k = 0;
        while (sc.hasNext()) {
           System.out.println(sc.nextLine());
           k++;
        }
        sc.close();
        FileWriter writer = new FileWriter(task18);
        System.out.println("INFO: Вам нужно ввести " + k +" строк");
        String buff;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < k; i ++) {
            System.out.println("INFO: Введите " + (i + 1) + " строку в файл\n");
            buff = scan.nextLine();
            buff = buff + "\n";
            writer.write(buff);
        }
        writer.close();
        sc.close();
    }
}
