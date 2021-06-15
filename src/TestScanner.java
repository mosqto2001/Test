
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author windows
 */
public class TestScanner {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new FileReader("data.txt"));
        String name=input.nextLine();
        System.out.println(name);
        int age = input.nextInt();
        System.out.println(age);
        double weight = input.nextDouble();
        System.out.println(weight);
        input.close();
    }
}
