/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author shraddha
 */
public class question2 {
    public static void main(String[] args) {
        
        File f1 = new File("C:\\Users\\shraddha\\Desktop\\M.S\\1st sem\\Java lab\\assignments\\CS480_FALL2015_15992\\build\\classes\\week12\\t1.txt");
        try
        {
            Scanner f1scan = new Scanner(f1);
            System.out.print(f1scan.next());
            f1scan.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found" +e);
        }

    }
}
