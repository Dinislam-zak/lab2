package labJUnitTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileJoiner {
    public static File mergeFiles(File file1, File file2, File fileResult) {

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
        return fileResult;
    }
}
