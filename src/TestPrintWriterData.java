
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author windows
 */
public class TestPrintWriterData {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        PrintWriter p = new PrintWriter("data.txt");
        p.println("Dss");
        p.println(20);
        p.println(20.22);
        p.close();
        
        BufferedReader input = new BufferedReader(new FileReader("data.txt"));
        String s;
        while((s = input.readLine()) != null){
            System.out.println(s);
        }
    }
}
