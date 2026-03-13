// Price, 9/29
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class SquareDancer extends Dancer implements Runnable
{
   public SquareDancer()
   {
      super (6, 3, Display.EAST, 0);
   }
   public SquareDancer (int x, int y, int dir, int beep)
   {
      super (x, y, dir, beep);
   }
   public void run()
   {
      while (frontIsClear())
      {
         move();
         turnLeft();
         move();
         turnLeft();
         move();
         turnLeft();
         move();
         turnLeft();
      }}
   public void danceStep()
   {
      move();
   }
}