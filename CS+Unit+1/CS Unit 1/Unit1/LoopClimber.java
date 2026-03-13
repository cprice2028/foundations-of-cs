// Price, 10/7
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
 
public class CliffClimber extends Climber implements Runnable
{
   
   public  LoopClimber (int y)
   {
      super (y);
   }
      
   public void climbUpRight()
   {
      int steps = 0;
      while (frontIsClear())
      {
         while (frontIsClear())
         {
            move();
         }
         turnLeft();
         while (!rightIsClear())
         {
            move();
            steps++;
         }
         turnLeft();
         while (!rightIsClear())
         {
            move();
         }
         turnRight();
         move();
         turnRight();
         move();
         turnLeft();
         for(int k=1; k<=steps; k++)         {
            move();
         }
         turnLeft();}
         
   }
   public void run()
   {
      climbUpRight();
   }
}