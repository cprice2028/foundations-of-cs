  //Name price Date 1/21
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
public class Panel09 extends JPanel
{
   private JLabel label;
   private JButton button;
   private double total;
   public Panel09()
   {
      setLayout(new BorderLayout());
      total = 0.00;
           
      JPanel panel = new JPanel();
      panel.setLayout(new GridLayout(2,3,10,0));
      add(panel,BorderLayout.CENTER);
    
      addButton(panel,"+1.00",1.0);
      addButton(panel,"+0.10",0.1);
      addButton(panel,"+0.01",0.01);
      addButton(panel,"-1.00",-1.0);
      addButton(panel,"-0.10",-0.1);
      addButton(panel,"-0.01",-0.01);
      
       label = new JLabel ("$0.00");
      label.setFont(new Font("Serif", Font.BOLD, 20));
      label.setHorizontalAlignment(0);
      add(label, BorderLayout.NORTH);
   }
   private void addButton(JPanel panel, String s, double x)
   {
      button = new JButton(s);
      button.addActionListener(new Listener(x));
      panel.add(button); 
            
   }
   private class Listener implements ActionListener
   {
      private double myX;
      public Listener(double x)
      {
         myX = x;
      }
      public void actionPerformed(ActionEvent e)
      {
         total = total + myX;
         
         DecimalFormat d = new DecimalFormat("$0.00");
         
         
         label.setText(d.format(total));              
             
      }
   }
}