/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week14;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author shraddha
 */
public class question3 extends JFrame{

    public question3() throws HeadlessException {
        setLayout(new FlowLayout());
        initComponents();
    setTitle("Hello World");
    setSize(400, 400);
  }
    
    void initComponents()
    {
    int score = 0;
    add(new JLabel("You Score = Unknown"));
    
    JButton buttonMessage = new JButton("Start Testing");
    //add(new JLabel("You Score = " +score));
    add(buttonMessage);
    buttonMessage.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
        addQuestion();
      }
    });

  }
    void addQuestion()
    {
            JFrame next = new question3();
            next.setTitle("Input");
            next.setVisible(true);
            add(new JLabel("What is the value of 1+1\n"));
    }

    public static void main(String[] args) {
    JFrame frame = new question3();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);

    }
}
