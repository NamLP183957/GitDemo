/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingdemo;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javafx.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AddGUI {
   public static void main(String args[]){
       Addition add = new Addition();
   }
}

class Addition extends JFrame implements ActionListener{
        JTextField t1;
        JTextField t2;
        JButton button;
        JLabel label;
        
    public Addition() {
        
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        
        button = new JButton("OK");
        label = new JLabel("result");
        
        add(t1);
        add(t2);
        add(button);
        add(label);
        
        button.addActionListener(this);
        
        setLayout(new FlowLayout());
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    overide
    public void actionPerformed(ActionEvent ae){
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());
        
        int value = num1 + num2;
        label.setText("result " + value);
    }
}
