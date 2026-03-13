//price, 10/17
import javax.swing.*;
import java.awt.*;
public class Panel02 extends JPanel
{
   public void paintComponent (Graphics g)
   {
   
      g.setColor(Color.RED);
      g.fillRect(0, 0, 400, 400);
      g.setFont( new Font ("SansSerif", Font.ITALIC, 20));
      g.setColor(new Color(255, 255, 255));
      g.drawString("Our Fearless Leader", 25, 350);
      g.setColor(new Color (165, 136, 21));
      g.fillRect( 110, 80, 170, 189); 
      for (int x = 105; x <= 273 ; x+=12)
      {
         g.setColor(new Color (165,136,21));
         g.fillOval (x, 70, 14, 14);
      } for (int x = 105; x <= 273 ; x+=12)
      {
         g.setColor(new Color (165,136,21));
         g.fillOval (x, 259, 14, 14);
      }
       for (int y = 80; y <= 260 ; y+=12)
      {
         g.setColor(new Color (165,136,21));
         g.fillOval (105, y, 14, 14);
      }
      for (int y = 80; y <= 260 ; y+=12)
      {
         g.setColor(new Color (165,136,21));
         g.fillOval (273, y, 14, 14);
      } 
      ImageIcon thomas = new ImageIcon ("tj.jpg");
      g.drawImage (thomas.getImage(), 130, 90, null);
      
   
   }
}