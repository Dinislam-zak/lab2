package lab;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MainFileInputStream {
    public static void main(String[] args) throws IOException {

        InputStream is =null;
        try {
            is = new FileInputStream("C:\\Users\\Atlas\\IdeaProjects\\lab2\\src\\main\\java\\transport.json");
            byte[] buf = new byte[512];
            int r;
            int i = 0;
            while ((r = is.read(buf)) != -1) {
                i++;
                for (int k = 0; k < r; k++){
                    System.out.print(buf[k] & 0xFF);
                    System.out.print(',');
                }

            }
            System.out.println();
            System.out.println(i);
        }
        catch (IOException e){
            e.printStackTrace();
        } finally {
            try {
                if (is != null){
                    is.close();
                }
            } catch (IOException e){
                throw new RuntimeException();
            }
        }
    }
}
