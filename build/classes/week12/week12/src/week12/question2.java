/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week12;
import java.io.*;
import java.util.*;
/**
 *
 * @author 15992gs
 */
public class question2 {
    public static void main(String[] args) {
        
        File f1 = new File("C:\\Users\\15992gs\\Desktop\\week12\\build\\classes\\week12\\t1.txt");
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
