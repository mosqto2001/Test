/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author windows
 */
public class TestFileReader {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader input = new FileReader("output.txt");
        int ch;
        while((ch=input.read()) != -1){
            System.out.print((char)ch);
        }
    }
}
