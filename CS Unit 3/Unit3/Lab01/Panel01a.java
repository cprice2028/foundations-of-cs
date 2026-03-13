//price 12/12
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Panel01a extends JPanel
{
   private JLabel label;
   private JTextField box;
   public Panel01a()
   {
      setLayout(new FlowLayout());
      
      box = new JTextField("0.0", 10);
      box.setHorizontalAlignment(SwingConstants.RIGHT);
      add(box);
      
      JButton button = new JButton ("SQRT");
      button.addActionListener(new Listener());
      add(button);
      
      label = new JLabel ("0.0");
      label.setFont(new Font ("Serif", Font.BOLD, 20));
      label.setForeground(Color.blue);
      add(label);
      
   }
   private class Listener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         
         
         double d = Double.parseDouble ( box.getText());
         if ( d < 0) 
         {
            label.setText("" + Math.sqrt(d*-1) + "i");
         }
         
         else 
            label.setText("" + Math.sqrt(d));
      
      }
   }
}