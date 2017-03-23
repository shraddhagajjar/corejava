/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week14;
import javax.swing.*;
import java.awt.*;
import javax.swing.JOptionPane;
import java.awt.event.*;

/**
 *
 * @author shraddha
 */
public class question2  extends JFrame{

    public static int score =0;
    public question2() throws HeadlessException {
        setLayout(new FlowLayout());
        setTitle("Welcome To This site");
        initComponents();
        setSize(200,200);
    }
    void initComponents(){
            
            JLabel n = new JLabel("Your score is:" +score);
            add(n);
            JButton buttonMessage = new JButton("Test your Knowelge" );
            add(buttonMessage);
            buttonMessage.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent ae) {
                    try
                    {
                    Object name = JOptionPane.showInputDialog(null, "what is 2+2 ", "Input",JOptionPane.YES_OPTION);
                    System.out.print(name);
                    String s = "4";
                    score++;
                        if(name != s)
                        {
                            System.out.println("No");
                        } else {
                            score++;
                            System.out.println("yes");
                            //n = new JLabel("Your score is:"+score);
                        }
                    }
                    catch(Exception e)
                    {
                        System.out.println(e);
                    }
                           
                }
            });
    }
    
    public static void setLabel()
    {
        
     
        System.out.println("Your Score "+score);
    }
    public static void main(String[] args) {
        JFrame frame = new question2();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
