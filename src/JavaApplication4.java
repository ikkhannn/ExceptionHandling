/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Bushra
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("Test Frame");
        frame.setSize(new Dimension(400,200));
        frame.setLocation(500,500);
        
//color
       Container contentPane = frame.getContentPane();
               contentPane.setLayout(new FlowLayout());

      contentPane.setBackground(Color.pink);
//Content panes 
       JLabel label = new JLabel("HERE IS A LABEL");
      
       contentPane.add(label);
       JButton button = new JButton("BUTTON");
       contentPane.add(button);
//List of options
        String[] options = {"Option 1", "Option 2", 
                          "Option 3"};
       JList list = new JList(options);
        contentPane.add(list);
//Checkbox
        JCheckBox cbox = new JCheckBox("Check");
        contentPane.add(cbox);

        JSlider slider = new JSlider();
        contentPane.add(slider);




        frame.setVisible(true);

    }
    
}
