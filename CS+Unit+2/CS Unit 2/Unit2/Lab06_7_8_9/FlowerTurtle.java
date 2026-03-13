//Name Charles Price Date 11/12
import edu.fcps.Turtle;
import java.awt.Color;
public class FlowerTurtle extends Turtle
{
   private double mySize;
   private Color myColor;
   public FlowerTurtle()
   {
      mySize = 50.0;
      setColor(Color.RED);
     
   }
   public FlowerTurtle(double x, double n, Color c)
   {
      super(x, 300.0, 90.0);
      mySize = n;
      setColor(c);
   }
   public void setSize(double n)
   {
      mySize = n;
   }

   private void drawPetals() //starts and ends at center facing north
   {
   
      for (int x=1; x<=30; x++)
      {
         forward(mySize);
         back(mySize);
         turnRight(12);
      }
      
      
      
      
      /************************/
   	/*                      */
   	/* Your code goes here. */
   	/*                      */
   	/************************/
   
   }
   private void drawStem() //starts at top of stem facing south, ends at bottom
   {
   
      super.setColor(Color.GREEN);
      turnRight(360/2);
      forward(mySize*3);
      back(mySize);
      turnRight(135);
      forward(mySize);
      back(mySize);
      turnRight(225);
      turnLeft(135);
      forward(mySize/2);
      back(mySize/2);
      turnLeft(225);
      
      
      
      /************************/
   	/*                      */
   	/* Your code goes here. */
   	/*                      */
   	/************************/
   
   }
   public void drawShape()
   {
      drawPetals();
      drawStem();
   }
}