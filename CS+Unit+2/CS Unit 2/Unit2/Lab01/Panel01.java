//price, 10/10
import javax.swing.*;
import java.awt.*;
public class Panel01 extends JPanel
{
   public void paintComponent (Graphics g)
   {
      g.setColor(Color.BLUE);
      g.fillRect(0, 0, 400, 400);
      g.setFont( new Font ("Serif", Font.ITALIC, 20));
      g.setColor(new Color(222, 212, 212));
      g.drawString("Welcome Home", 40, 40);
      for (int x = 0; x<=400; x+=10)
      { 
         g.setColor (new Color(174, 159, 160));
         g.drawLine(x, 300, x, 375);
         
      }
      
      g.setColor(new Color(209, 246, 23));
      g.fillOval(300, 75, 50, 50);
      g.setColor (new Color (117, 56, 26));
      int xPoints[] = {75,175,275};
      int yPoints[] = {200,100,200};
      g.fillPolygon (xPoints, yPoints, 3);
      g.setColor (new Color(145, 55, 10));
      g.fillRect (100,200,150,150);
      g.setColor (new Color(50,11,11));
      g.fillRect (150, 275, 50, 75);
      g.drawLine (0, 350, 400, 350);
      for (int x = 0; x <= 400; x+=40)
      {
         g.setColor(new Color (255,255,255));
         g.fillOval(x, 50, 25, 25);
      }
      for (int x = 3; x <= 400; x+=40)
      {
         g.setColor(new Color (255,255,255));
         g.fillOval(x, 60, 25, 25);
      }
      for (int x = 3; x <= 400; x+=40)
      {
         g.setColor(new Color (255,255,255));
         g.fillOval(x, 40, 25, 25);
      }
      g.setColor(new Color(168,238,240));
      g.fillRect(110, 212, 30, 50);
      g.setColor(new Color(168,238,240));
      g.fillRect(210, 212, 30, 50);
      g.setColor(new Color(193,168,4));
      g.fillRect(190, 312, 5, 1);
   }
}