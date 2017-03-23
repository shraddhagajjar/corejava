/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week14;

/**
 *
 * @author shraddha
 */
import java.awt.FlowLayout;
import java.awt.Label;
import javax.swing.*;
public class question4 extends JFrame{

    public question4() {
        setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
        add(new JLabel("First name"));
        add(new JTextField(8));
        System.out.println("");
        add(new Label("MI"));
        add(new JTextField(1));
        add(new JLabel("lastname"));
        add(new JTextField(8));
    }
  
    public static void main(String[] args) {
        question4 framee = new question4();
        framee.setTitle("MY frame");
        framee.setSize(200,200);
        framee.setLocationRelativeTo(null);
        framee.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        framee.setVisible(true);
    }
}
