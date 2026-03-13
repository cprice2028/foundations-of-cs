//Name Charles Price Date 11/15
import edu.fcps.Turtle;
import java.awt.Color;
public class TwistyTurtle3 extends Turtle
{
   public void drawSquare (int a)
   {
      for( int x=1; x<=4; x++)
      {
         forward(a);
         turnRight(90);
      }
   }
   public void drawShape()
   {
      for(int length = 25; length<150; length+=5) 
      {
         drawSquare(length);
         turnRight(45);
      }
   }  
}