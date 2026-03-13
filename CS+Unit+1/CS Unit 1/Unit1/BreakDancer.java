// Price, 9/29
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class BreakDancer extends Dancer implements Runnable
{
   public BreakDancer()
   {
      super (3, 6, Display.EAST, 0);
   }
   public BreakDancer (int x, int y, int dir, int beep)
   {
      super (x, y, dir, beep);
   }
   public void run()
   {
      while (frontIsClear())
      {
      move();
      turnLeft();
      move(); move();
      turnAround();
      move();
      turnLeft();
      move();move();
      turnAround();
   }}
   public void danceStep()
   {
   move();
   }
}