/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
import java.awt.*;

/**
 *
 * @author natal
 */
public class Calculadora 
{
    private Frame f;
    private TextField tf;
    private Panel p;
    private Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21;
    
    public Calculadora()
    {
        f=new Frame("Calculadora");
        b1=new Button("%");
        b2=new Button("CE");
        b3=new Button("C");
        b4=new Button("<x");
        b5=new Button("/");
        b6=new Button("7");
        b7=new Button ("8");
        b8=new Button ("9");
        b9=new Button("x");
        b10=new Button("4");
        b11=new Button("5");
        b12=new Button("6");
        b13=new Button("-");
        b14=new Button("1");
        b15=new Button("2");
        b16=new Button("3");
        b17=new Button("+");
        b18=new Button("+/-");
        b19=new Button("0");
        b20=new Button(".");
        b21=new Button("=");
        
        tf=new TextField("0");
        p=new Panel();
    }
    public void launchFrame()
    {
     p.setLayout(new GridLayout(4,5));
        f.add(tf,BorderLayout.NORTH);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(b10);
        p.add(b11);
        p.add(b12);
        p.add(b13);
        p.add(b14);
        p.add(b15);
        p.add(b16);
        p.add(b17);
        p.add(b18);
        p.add(b19);
        p.add(b20);
        p.add(b21);
        f.add(p,BorderLayout.CENTER);
        
        f.setBackground(Color.darkGray);
        f.setSize(500,500);
        p.setSize(450, 450);
        f.pack();
      
        
        f.setVisible(true);
    }

  
    public static void main(String[] args) 
    {
        Calculadora c=new Calculadora();
        c.launchFrame();
    }
    
}
