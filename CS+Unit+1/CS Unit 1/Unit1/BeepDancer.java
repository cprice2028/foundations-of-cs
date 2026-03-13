// Price, 9/29
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class BeepDancer extends Dancer implements Runnable
{
   public BeepDancer()
   {
      super (5, 4, Display.EAST, Display.INFINITY);
   }
   public BeepDancer (int x, int y, int dir, int beep)
   {
      super (x, y, dir, beep);
   }
   public void run()
   {
      while (frontIsClear())
      {
         move();
         putBeeper();
         turnLeft();
         move();
         putBeeper();
         turnLeft();
         move();
         putBeeper();
         turnLeft();
         move();
         turnLeft();
         putBeeper();
         move();
         turnLeft();
         pickBeeper();
         move(); 
         turnLeft();
         pickBeeper();
         move();
         turnLeft();
         pickBeeper();
         move();
         turnLeft();
         pickBeeper();
      }}
   public void danceStep()
   {
      move();
   }
}