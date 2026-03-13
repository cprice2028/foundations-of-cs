//Name Charles Price Date 11/7
import edu.fcps.Turtle;
import java.awt.Color;
import javax.swing.*;
public class Driver07
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Polygon Turtles");
      frame.setSize(400, 400);
      frame.setLocation(200, 100);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new TurtlePanel());
      frame.setVisible(true);
   
      PolygonTurtle e = new PolygonTurtle(100.0, 3);
      e.setColor(Color.BLUE);
      e.setThickness(6);
      e.drawShape(3);
      e.drawShape(4);
      e.drawShape(5);  
      e.drawShape(6);  
      e.drawShape(8);  
      e.drawShape(10);      
     
 
         
   }
}