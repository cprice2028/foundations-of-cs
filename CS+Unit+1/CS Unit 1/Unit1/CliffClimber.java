// Price, 10/7
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
 
public class CliffClimber extends Climber implements Runnable
{
   
   public  CliffClimber ()
   {
      super (2);
   }
   
   public void climbUpRight()
   {
      while (!nextToABeeper())
      {
         if (rightIsClear())
         {
            turnRight();
            move();
         } 
         else if (frontIsClear())
         {
            move();
         }
         else 
            turnLeft();
      }            
   }
   public void run()
   {
      climbUpRight();
   }
}