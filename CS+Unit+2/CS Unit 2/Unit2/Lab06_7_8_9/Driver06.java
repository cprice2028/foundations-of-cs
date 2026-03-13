//Name Price Date 10/31
import edu.fcps.Turtle;
import java.awt.Color;
import javax.swing.*;
public class Driver06
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Square Turtles");
      frame.setSize(400, 400);
      frame.setLocation(200, 100);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new TurtlePanel());
      frame.setVisible(true);
      
      Turtle.setCrawl(true);     //a class method
   
      SquareTurtle smidge = new SquareTurtle();
      smidge.setColor(Color.BLUE);
      smidge.setThickness(6);
      smidge.drawShape();
   
      /************************/
   	/*                      */
   	/* Your code goes here. */
   	/*                      */
   	/************************/
      SquareTurtle aiden = new SquareTurtle(250, 250, 180);
      aiden.setColor(Color.magenta);
      aiden.setThickness(54);
      aiden.drawShape();
   
      SquareTurtle a = new SquareTurtle(350, 450, 280);
      a.setColor(Color.RED);
      a.setThickness(88);
      a.drawShape();
   
      SquareTurtle oioi = new SquareTurtle(350, 150, 90);
      oioi.setColor(Color.pink);
      oioi.setThickness(2);
      oioi.drawShape();
   
   
   
   
   }
}