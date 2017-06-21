/*
 * To ch        ange this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Bushra
 */
public class JavaApplication6 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           MyFrame f=new MyFrame();
           

    }    
}
class MyFrame extends Frame implements ActionListener 
{    
    Button hw;
    public MyFrame(){
	super("Test Button");
	setSize(200,200);
       setLocation(500,500);
	hw = new Button("Hello World!");
	add(hw);
	hw.addActionListener(this);
	show();
    }
    
    public void actionPerformed(ActionEvent o){
	System.exit(0);
   }
}
