//Name Charles Price Date 11/15
import edu.fcps.Turtle;
import java.awt.Color;
public class TwistyTurtle2 extends Turtle
{
   public void drawShape()
   {
      for(int length = 0; length<150; length+=2) 
      {
         forward(length);
         turnRight(30);
      }
   }  
}