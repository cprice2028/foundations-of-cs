//Charles Price 9/5
import edu.fcps.karel2.Robot; 
import edu.fcps.karel2.Display;

public class Lab05
{
   public static void main(String[] args)
   {
      Display.openWorld("maps/shuttle.map");
      Display.setSize (10,10);
      Display.setSpeed (10);
      
      Racer a = new Racer(1);
      Racer b = new Racer(4);
      Racer c = new Racer(7);
      
      Thread aa = new Thread( a );
      Thread bb = new Thread( b );
      Thread cc = new Thread( c );
   
      
      aa.start();
      bb.start();
      cc.start();
      
      
   }}
