//Name:   Charles Price           Date: 11/19
import java.awt.*;
import javax.swing.*;
public class TJ extends Ball
{

   public void draw(Graphics myBuffer)
   {
   
      ImageIcon tj= new ImageIcon("tj.jpg");
      myBuffer.drawImage(tj.getImage(), (int)(getX() - getRadius()), (int)(getY()-getRadius()), (int)getDiameter(), (int)getDiameter(), null);
     
   } 
}