//Name price Date 2/27
import javax.swing.*;
import java.awt.*;
public class Display10 extends JPanel
{
   private JLabel[] bits;
    private JLabel dl;
   public Display10()
   {
      setLayout(new GridLayout(1, 8));
      bits = new JLabel[8];
      for(int x = 0; x < bits.length; x++)
      {
         bits[x] = new JLabel("", SwingConstants.CENTER);
         bits[x].setFont(new Font("Serif", Font.BOLD, 50));
         add(bits[x]);
      }

      dl = new JLabel("", 0);
      add(dl);
     randomize();
   }
   public void randomize()
   {
      for(int x = 0; x < bits.length; x++) 
      {
         bits[x].setText("" + (int)(Math.random()*2));
      }
      binary();
   }
   public void reverse()
   {
      String[] temp = new String[bits.length];          
     
      int x;
      for(x = 0; x < bits.length; x++) 
      {
         temp[x] = bits[x].getText();
      }
   
      for(x = 0; x < bits.length; x++) 
      {
         bits[x].setText(temp[bits.length - x - 1]);
      } 
      binary();           
   }
   public void shift()
   {
        	
      String[] temp = new String[bits.length];
      for (int x = 0; x < bits.length-1; x++)
      {
         bits[x].setText(bits[x + 1].getText());
      }
   
      bits[bits.length - 1].setText("0");
      binary();
   }
         
   
   public void rotate()
   {
      String temp = bits[0].getText();
   
      for(int x = 0; x < bits.length - 1; x++) {
         bits[x].setText(bits[x + 1].getText());
      }
   
      bits[bits.length - 1].setText(temp);
      binary();
        
   }
   public void binary()
   {
   int[] binary = new int[8];

      int a;
      for(a = 0; a< bits.length; a++) {
         binary[a] = Integer.parseInt(bits[a].getText());
      }
      
      a = 0;
      double decima = 0.0;

      for(int i = binary.length - 1; i >= 0; --i) {
         if (binary[i] == 1) {
            decima += Math.pow(2.0, (double)a);
         }

         a++;
      }

      dl.setText("" + decima);
   }
}