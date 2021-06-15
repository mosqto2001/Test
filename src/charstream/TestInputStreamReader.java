
package charstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestInputStreamReader {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        InputStreamReader input = new InputStreamReader(new FileInputStream("output.dat"));
        int ch;
        while((ch=input.read()) != -1){
            System.out.print((char)ch);
        }
    }
}
