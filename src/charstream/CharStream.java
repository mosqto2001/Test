/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 *
 * @author windows
 */
public class CharStream {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String data = "Welcome to Java";
        OutputStreamWriter output = new OutputStreamWriter(new FileOutputStream("output.dat"));
        output.write(data);
        output.close();
    }
    
}
