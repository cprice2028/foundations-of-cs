//price 10/9

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class XCRacer extends Racer implements Runnable

{


   public XCRacer ()
   {
      super ();
   }
   public XCRacer (int x)
   {
      super (x, 1, Display.NORTH, 0);  
   }

   public void run()
   {
      move();
   }
}