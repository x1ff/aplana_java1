import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Задача №16: Выгрузка данных из файла на экран
 * Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt
 */
public class MyFileReader {
    public static void main(String[] args) throws IOException {
        File file = new File("src/main/resources/task16.txt");
        System.out.println(Files.readAllLines(Paths.get(file.getAbsolutePath())));
    }
}
