// Price, 9/29
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
public class Lab15
{
   public static void main(String[] args)
   {
      Display.setSpeed(6);
      Display.setSize(10, 10);
      Display.openWorld("maps/.map");
   
   
      BreakDancer a = new BreakDancer();
      BeepDancer b = new BeepDancer();
      SquareDancer c = new SquareDancer();
      Thread aa = new Thread( a );
      Thread bb = new Thread( b );
      Thread cc = new Thread( c );
      aa.start();
      bb.start();
      cc.start();
     
   }
}