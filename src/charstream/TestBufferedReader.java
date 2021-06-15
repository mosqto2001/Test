/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author windows
 */
public class TestBufferedReader {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader input = new BufferedReader(new FileReader("output.txt"));
        String s;
        while((s=input.readLine()) != null){
            System.out.println(s);
        }
    }
}
