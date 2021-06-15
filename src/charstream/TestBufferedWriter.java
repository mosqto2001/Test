/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charstream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author windows
 */
public class TestBufferedWriter {
    
    
    public static void main(String[] args) throws IOException {
        BufferedWriter output = new BufferedWriter(new FileWriter("output.txt"));
        output.write("Welcome");
        output.close();
    }
}
