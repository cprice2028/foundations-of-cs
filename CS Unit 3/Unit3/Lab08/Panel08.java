   //Name______________________________ Date_____________
   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   public class Panel08 extends JPanel
   {
      private Display08 display;
      private JButton button1, button2;
      public Panel08()
      {
            setLayout(new FlowLayout());   
         display = new Display08();
         add(display, BorderLayout.CENTER);
    
         JPanel subpanel = new JPanel();
         subpanel.setLayout(new GridLayout(1,2));
         subpanel.add(button1 = new JButton ("Finite")); 
         button1.addActionListener(new Listener1());
         subpanel.add(button1);
         subpanel.add(button2 = new JButton("Infinite"));
         button2.addActionListener(new Listener2());
         subpanel.add(button2);
         add(subpanel, BorderLayout.SOUTH);
    
        

      
      }
      private class Listener1 implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
         display.sumFinite();
         	         
         }
      }
      private class Listener2 implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
         display.sumInfinite();
         	
         
         }
      }
   }