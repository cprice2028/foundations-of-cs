	//Name price Date 9/13
import javax.swing.*;
import java.awt.*;
public class Display05 extends JPanel
{
   private JLabel label1, label2,label3;
   private int value, total, highScore;
   public Display05()
   {
      setLayout(new GridLayout(3, 1));
      Font f = new Font("Serif", Font.BOLD, 30);
      total = value = highScore = 0;
   
      label1 = new JLabel("Value: " + value);
      label1.setFont(f);
      label1.setForeground(Color.blue);
      add(label1);
   
      label2 = new JLabel("Total: " + total);
      label2.setFont(f);
      label2.setForeground(Color.blue);
      add(label2);
       
      label3 = new JLabel("High Score: " + total);
      label3.setFont(f);
      label3.setForeground(Color.blue);
      add(label3);
   }
   
   public void update()
   {
      
      int value = (int) (Math.random() * 11);
      label1.setText("Value:" + value);
      if (value<=2)
      {
         total = 0;
      }
      else 
      {
         total = total + value;
      }
      
      
      label2.setText("Total:"+total);
      
      if (total > highScore)
      {
         highScore = total;
         label3.setText("High Score:" + highScore);
      }
         
         
         
               
   }
}