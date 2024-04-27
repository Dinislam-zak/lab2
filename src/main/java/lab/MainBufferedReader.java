package lab;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MainBufferedReader {
    public static void main(String[] args) throws IOException {
        byte [] data = {17,21,0,11,0,12,1,112,101,56,78,-12,11,-34,0,12,22};
        InputStream is =null;
        try {
            is = new ByteArrayInputStream(data);
            byte[] buf = new byte[4];
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
