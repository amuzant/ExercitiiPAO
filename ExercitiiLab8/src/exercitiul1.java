import java.io.*;

public class exercitiul1 {
    public static void main(String[] args){

        try {
            FileInputStream fis = new FileInputStream("test.txt");
            int dimFisier = fis.available();
            byte[] buffer = new byte[dimFisier];
            fis.read(buffer);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
