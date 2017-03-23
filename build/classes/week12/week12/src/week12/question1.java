/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week12;
import java.io.*;
/**
 *
 * @author 15992gs
 */
public class question1 {
    public static void main(String[] args) {
       File f1 = new File("C:\\Users\\15992gs\\Desktop\\week12\\build\\classes\\week12\\t1.txt");
       if(f1.exists())
            System.out.println("t1.txt is exit");
       else
            System.out.println("File is not exit");
                
    }
}
