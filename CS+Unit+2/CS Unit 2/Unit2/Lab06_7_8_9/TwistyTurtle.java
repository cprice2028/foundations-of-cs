//Name Charles Price Date 11/14
import edu.fcps.Turtle;
import java.awt.Color;
public class TwistyTurtle extends Turtle
{
   public void drawShape()
   {
      for(int length = 5; length<400; length+=10) 
      {
         forward(length);
         turnRight(123);
      }
   }  
}