	//Name_price Date______2/25
import javax.swing.*;
import java.awt.*;
public class ScoreCard09 extends JPanel
{
   private JTextField[] input;
   public ScoreCard09()
   {
      setLayout(new GridLayout(2, 18));
      
      for(int x = 1; x <= 18; x++)
      {
         add(new JLabel("" + x, SwingConstants.CENTER));
      }
      
      input = new JTextField[18];
      for(int x = 0; x < input.length; x++)
      {
         input[x] = new JTextField();
         add(input[x]);
      }
   }
   public void randomize()
   {
      for(int x = 0; x < input.length; x++) 
      {
         input[x].setText("" + (int)(Math.random() * 4.0D + 1.0D));
      }
   }
   public int findTotal()
   {
      int x = 0;
            
      for(int y = 0; y< input.length; y++)
      {
         x+=Integer.parseInt(input[y].getText());
      }
      return x;
   }
   
   public int findAces()
   {
      int x = 0;
      for(int y = 0; y < input.length; y++) 
      {
         if (Integer.parseInt(input[y].getText()) == 1) 
         {
            x++;
         }
      }
      return x;
   }
   public int findHardestHole()
   {
      int x = 0;
      int y = Integer.parseInt(input[0].getText());
      for(int z= 1; z<input.length; z++)
      {
         if (Integer.parseInt(input[z].getText())>y)
         {
            x = z;
            y = Integer.parseInt(input[z].getText());
         }
      } 	
      return x+1;    
   }
}