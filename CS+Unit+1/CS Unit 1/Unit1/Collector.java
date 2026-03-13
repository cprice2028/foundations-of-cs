//Barry, 10/8
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
public class Collector extends Athlete implements Runnable
{
   public Collector()
   {
      super(1, 10, Display.EAST, 0);
   }
   public Collector(int x, int y, int dir, int beep)
   {
      super (x, y, dir, beep);
   }
   public void run()
   {
      while(frontIsClear())
      {
         
         while(!nextToABeeper())
         {
            move();
         }
         
         while(nextToABeeper())
         {
            pickBeeper();
            
         }
         move();
      }
      while(hasBeepers())
      {
         putBeeper();
      }
               
  
   
   }
















}
