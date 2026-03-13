//price 12/12
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Panel02 extends JPanel
{
   private JLabel label;
   public Panel02()
   {
      setLayout(new FlowLayout());
      
          
      label = new JLabel ("0.0");
      label.setFont(new Font ("Serif", Font.BOLD, 20));
      label.setForeground(Color.blue);
      add(label);
     
      JButton random = new JButton ("Random");
      random.addActionListener(new RandomListener());
      add(random);
      
      JButton cuberoot = new JButton ("Cube Root");
      cuberoot.addActionListener(new CuberootListener());
      add(cuberoot);
      
      JButton reciprocal = new JButton ("Reciprocal");
      reciprocal.addActionListener(new ReciprocalListener());
      add(reciprocal);
      
      JButton quit = new JButton ("Quit");
      quit.addActionListener(new QuitListener());
      add(quit);
   }
   private class RandomListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         double x = Math.random(); 
         label.setText("" + x);
      }
   }
   private class CuberootListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         double d = Double.parseDouble(label.getText());
         double x = Math.pow(d, 1.0/3.0);
         label.setText("" + x);
      }
   }
   private class ReciprocalListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         double d = Double.parseDouble(label.getText());
         double x = 1/d;
         label.setText("" + x);
      }
   }
   private class QuitListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         System.exit(0);
      }
   }
}