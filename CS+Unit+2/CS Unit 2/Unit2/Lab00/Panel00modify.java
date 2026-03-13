//price, 10/10
import javax.swing.*;
import java.awt.*;
public class Panel00modify extends JPanel
{
   public void paintComponent (Graphics g)
   {
      g.setColor(Color.LIGHT_GRAY);
      g.fillRect(75, 50, 2000, 2000);
      g.setFont( new Font ("SansSerif", Font.ITALIC, 20));
      g.setColor(new Color(223, 47, 47));
      g.drawString("I have lots of homework", 100, 50);
      g.setFont( new Font ("Arial", Font.PLAIN, 30));
      g.setColor(new Color(47, 118, 223));
      g.drawString("I like videogames", 100, 500);
      g.setFont( new Font ("Monospaced", Font.BOLD, 40));
      g.setColor(new Color(47, 223, 65));
      g.drawString("I like soccer", 100, 300);
      g.setFont( new Font ("Serif", Font.BOLD, 50));
      g.setColor(new Color(176, 47, 223));
      g.drawString("I am 14 years old", 100, 200);
   
   }
}