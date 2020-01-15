import java.io.File;
import java.util.Scanner;
import java.io.*;

public class MyFileWriter {
    public static void main(String[] args) throws IOException {
        String RETURN_CONDITION = "stop";
        File file = new File("src/main/resources/task17.txt");
        Scanner sc = new Scanner(System.in);
        FileWriter writer = new FileWriter(file);
        System.out.println("INFO: Вводите вводите строки в файл, для завершения ведите stop");
        String buff;
        do {
            buff = sc.nextLine();
            if (buff.equals(RETURN_CONDITION) ) break;
            buff = buff + "\n";
            writer.write(buff);
        } while (true);
        writer.close();
        sc.close();
    }
}
