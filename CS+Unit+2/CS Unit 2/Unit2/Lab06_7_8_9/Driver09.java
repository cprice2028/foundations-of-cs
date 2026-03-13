//Name Charles Price Date 11/14
import edu.fcps.Turtle;
import java.awt.Color;
import javax.swing.*;
public class Driver09
{
   public static void twisties(Turtle arg)
   {
      arg.setPenDown(false);
      arg.turnRight ((int)(Math.random() * 360));
      arg.forward((int)(Math.random()*200));
      arg.setPenDown(true);
      arg.drawShape();
   }

   public static void main(String[] args)
   {
            
      JFrame frame = new JFrame("Twisty Turtles");
      frame.setSize(400, 400);
      frame.setLocation(200, 100);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new TurtlePanel());
      frame.setVisible(true);
      Turtle.clear(Color.WHITE);
      Turtle.setCrawl(false);
      
      Turtle a = new TwistyTurtle();
      a.setColor (new Color((int)(Math.random() * 255),(int)(Math.random() * 255),(int)(Math.random() * 255)));
      a.setThickness((int)(Math.random() * 25));
      twisties(a);
      
      Turtle b = new TwistyTurtle2();
      b.setColor (new Color((int)(Math.random() * 255),(int)(Math.random() * 255),(int)(Math.random() * 255))); 
      b.setThickness((int)(Math.random() * 25));
      twisties(b);
      
      Turtle c = new TwistyTurtle3();
      c.setColor (new Color((int)(Math.random() * 255),(int)(Math.random() * 255),(int)(Math.random() * 255))); 
      c.setThickness((int)(Math.random() * 25));
      twisties(c);
   
   }
}
