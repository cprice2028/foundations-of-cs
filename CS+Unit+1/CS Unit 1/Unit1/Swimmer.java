	//Name Charles Price Date 9/26
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
public class Swimmer extends Robot implements Runnable
{
   public Swimmer(int x)
   {
      super(x, 1, Display.NORTH, 0);
   }
   public void run() //not swim
   {
      for(int n=1; n<=10; n++)
      {
         for(int p=1; p<=2; p++)
         {
            for(int k=1; k<=8; k++)
            {
               move();
            }
            turnLeft();turnLeft();
         }      
      }
   }
}
   

