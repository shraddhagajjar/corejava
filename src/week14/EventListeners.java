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
import java.applet.*;
import java.awt.event.*;
import java.awt.*;

public class EventListeners extends Applet 
implements ActionListener{
   TextArea txtArea;
   String Add, Subtract;
   int i = 10, j = 20, sum =0,Sub=0;
   public void init(){
      txtArea = new TextArea(10,20);
      txtArea.setEditable(false);
      add(txtArea,"center");
      Button b = new Button("Add");
      Button c = new Button("Subtract");
      b.addActionListener(this);
      c.addActionListener(this);
      add(b);
      add(c);
   }
   public void actionPerformed(ActionEvent e){
      sum = i + j;
      txtArea.setText("");
      txtArea.append("i = "+ i + "\t" + "j = " + j + "\n");
      Button source = (Button)e.getSource();
      if(source.getLabel() == "Add"){
         txtArea.append("Sum : " + sum + "\n");
      }
      if(i >j){
         Sub = i - j;
      }
      else{
         Sub = j - i;
      }
      if(source.getLabel() == "Subtract"){
         txtArea.append("Sub : " + Sub + "\n");
      }
   }
}