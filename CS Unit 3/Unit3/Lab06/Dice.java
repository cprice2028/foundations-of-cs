//Name______________________________ Date_____________
import javax.swing.*;
import java.awt.*;
public class Dice extends JPanel
{
   private JLabel label1, label2;
   int roll;
   
  
  
   
   public Dice()
   {
      setLayout(new GridLayout(1, 2, 5, 5));
   
      label1 = new JLabel();
      label1.setIcon(new ImageIcon("one.jpg"));
      add(label1);
   
      label2 = new JLabel();
      label2.setIcon(new ImageIcon("one.jpg"));
      add(label2);
   }
   public int roll()
   {
      int a = rollOne(label1);
      int b = rollOne(label2);
      return a + b;
   }
  
   private int rollOne(JLabel label)
   {
      int roll = (int)(Math.random()*6);
      switch(roll)
      {
         case 1: ImageIcon one = new ImageIcon ("one.jpg");
            label.setIcon(one);
            break;
         case 2: ImageIcon two = new ImageIcon ("two.jpg");
            label.setIcon(two);
            break;
         case 3: ImageIcon three = new ImageIcon ("three.jpg");
            label.setIcon(three);
            break;
         case 4: ImageIcon four = new ImageIcon ("four.jpg");
            label.setIcon(four);
            break;
         case 5: ImageIcon five = new ImageIcon ("five.jpg");
            label.setIcon(five);
            break;
         case 6: ImageIcon six = new ImageIcon ("six.jpg");
            label.setIcon(six);
            break;
      }
      
      return roll;
     
    
   }
}
