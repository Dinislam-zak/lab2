package lab;
import java.io.*;
public class MainFirst {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Использование: java MergeFiles file1 file2 fileResult");
            return;
        }

        String file1 = args[0];
        String file2 = args[1];
        String fileResult = args[2];

        try (FileInputStream fis1 = new FileInputStream(file1);
             FileInputStream fis2 = new FileInputStream(file2);
             FileOutputStream fos = new FileOutputStream(fileResult)) {

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = fis1.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            while ((bytesRead = fis2.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("Файлы успешно объединены в файл " + fileResult);

        } catch (IOException e) {
            System.err.println("Ошибка при объединении файлов: " + e.getMessage());
        }
    }
}
