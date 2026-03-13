//Name Charles Price Date 11/12
import edu.fcps.Turtle;
import java.awt.Color;
import javax.swing.*;
public class Driver08
{
   public static void main(String[] args)
   {
      
      JFrame frame = new JFrame("Flower Turtles");
      frame.setSize(400, 400);
      frame.setLocation(200, 100);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new TurtlePanel());
      frame.setVisible(true);
      Turtle.clear(Color.WHITE);
      
      FlowerTurtle a = new FlowerTurtle (100.0, 50.0, Color.RED);
      a.setColor(Color.blue); 
      a.drawShape();
      
      FlowerTurtle b = new FlowerTurtle (220.0, 50.0, Color.PINK);
      b.setColor(Color.MAGENTA); 
      b.drawShape();
      
      FlowerTurtle c = new FlowerTurtle (340.0, 50.0, Color.GREEN);
      c.setColor(Color.ORANGE); 
      c.drawShape();
      
      FlowerTurtle d = new FlowerTurtle (460.0, 50.0, Color.YELLOW);
      d.setColor(Color.RED); 
      d.drawShape();
     
         
         
         
         
         /************************/
    	/*                      */
    	/* Your code goes here. */
    	/*                      */
    	/************************/
      
   }
}