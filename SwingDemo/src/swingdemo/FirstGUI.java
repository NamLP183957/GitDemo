/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingdemo;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FirstGUI {
    
    public static void main(String[] args) {
        Abc abc = new Abc();
    }
 
}

class Abc extends JFrame {
       
    JLabel label[];
    public Abc() {
        label = new JLabel[3];
        
        for(int i = 0; i < 3; i++){
            label[i] = new JLabel("label " + (i+1));
            add(label[i]);
        }
        
        setLayout(new FlowLayout());
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               
    }
}

