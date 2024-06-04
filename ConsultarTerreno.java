
package com.mycompany.consultarterreno;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class ConsultarTerreno {

    public static void main(String[] args) {
        JFrame frame = new JFrame ();
     frame.setLayout(new FlowLayout());
    frame.setTitle("title frame");
    frame.setSize(350, 180);
    frame.setLocationRelativeTo(null);
    frame.setResizable(false);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new FlowLayout ());
JTextField text1 = new JTextField (10);
text1.setText("cvcvxcv");
text1.setHorizontalAlignment(JTextField.LEFT);
Container c = frame.getContentPane();
c.add(text1);

frame.setVisible(true);


    
    
    
    
    
    
    
    
    }
    
}
