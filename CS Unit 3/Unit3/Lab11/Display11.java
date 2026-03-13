//Name price Date 1/23
import javax.swing.*;
public class Display11 extends JPanel
{
   private JLabel label;
   private int stonesLeft;
   
   public Display11()
   {
     stonesLeft = 12;
      
      label = new JLabel(new ImageIcon("stones12.jpg"));
      add(label);
   }
   public boolean pickUp(int stones)
   {
      stonesLeft-=stones;
      if (stonesLeft<=0)
      {
         stonesLeft = 0;
         updateImage();
         return true;
      }
      updateImage();
      return false;
   }
  
   private void updateImage()
   {
      label.setIcon(new ImageIcon("stones"+ stonesLeft + ".jpg"));
       
    
   }
   
   public void reset()
   {
      stonesLeft = 12;
      updateImage();
   }
}
   
  
