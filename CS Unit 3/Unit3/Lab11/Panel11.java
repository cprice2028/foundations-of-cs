import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Panel11 extends JPanel
{
   private Display11 display;
   private JButton button;
   public Panel11()
   {
      setLayout(new BorderLayout());
      
             
      display = new Display11();
      add(display, BorderLayout.CENTER);
         
         
         
      JPanel bpanel = new JPanel();
      bpanel.setLayout(new GridLayout(1,3));
      add(bpanel,BorderLayout.SOUTH);   
      
      
      addButton(bpanel,"One",1);
        addButton(bpanel,"Two",2);  
      addButton(bpanel,"Three",3);
      
     
   
   }
   private void addButton(JPanel panel, String label, int stones)
   {
      button = new JButton(label);
      button.addActionListener(new Listener(stones));
      panel.add(button); 
            
   }
   private class Listener implements ActionListener
   {
      private int minusstones;
      
      public Listener(int stones)
      {
         minusstones = stones;
      }
   
      public void actionPerformed(ActionEvent e)
      {
         boolean gameOver = display.pickUp(minusstones);
         if(gameOver)
         {
            display.reset();
         
         
         }
      }
   }
}