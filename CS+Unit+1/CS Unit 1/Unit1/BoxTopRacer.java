//Charles Price 9/16
import edu.fcps.karel2.Robot; 
import edu.fcps.karel2.Display;

public class BoxTopRacer extends Racer
{ 
   public BoxTopRacer (int y)
   {
      super(y);
   }
   
   public void jumpRight()
   {
      while (!frontIsClear())
      {
         turnLeft();
      }
      while(!rightIsClear())       
      {
         if (nextToABeeper())
         {}
         else 
         {
            if (!frontIsClear())
            {
               turnLeft();
            }
            else { move();
               if (rightIsClear())
               {
                  turnRight();
                  move();
                  if(!rightIsClear())
                  {
                     if(!frontIsClear())
                     {
                        turnLeft();
                     }
                     move();
                  }
                  if(rightIsClear())
                  {
                     turnRight();
                     move();
                  }
                  if (!frontIsClear()) 
                  {
                     turnLeft();
                     if (!frontIsClear())
                     {
                        turnLeft();
                     }
                  }
               }   }
         
         }
      }
   }
   public void jumpLeft() 
   {
      while (!frontIsClear())
      {
         turnRight();
      }
      while(!leftIsClear())       
      {
         if (nextToABeeper())
         {}
         else 
         {
            if (!frontIsClear())
            {
               turnRight();
            }
            else { move();
               if (leftIsClear())
               {
                  turnLeft();
                  move();
                  if(!leftIsClear())
                  {
                     if(!frontIsClear())
                     {
                        turnRight();
                     }
                     move();
                  }
                  if(leftIsClear())
                  {
                     turnLeft();
                     move();
                  }
                  if (!frontIsClear()) 
                  {
                     turnRight();
                     if (!frontIsClear())
                     {
                        turnRight();
                     }
                  }
               }   }
         
         }
      }
   }
   public void sprint (int n)
   { 
      for(int k=1; k<=n;k++)
         move();}
   public void put (int n)
   {
      for(int k=1; k<=n; k++)
         putBeeper();
   }
   public void pick(int n) 
   { 
      for(int k=1; k<=n; k++)
         pickBeeper();
   }
   public void shuttle (int spaces, int beepers)
   {
      for(int k=1; k<=spaces; k++)
         move();
      for(int k=1; k<=beepers; k++)
         pickBeeper();
   }
   public void runTheRace()
   {
      move(); jumpRight(); shuttle(2,7);turnAround();sprint(2);jumpLeft(); move(); put(7);turnAround();
      move(); jumpRight(); shuttle(4,5);turnAround();sprint(4);jumpLeft(); move(); put(5);turnAround();
      move(); jumpRight(); shuttle(6,3);turnAround();sprint(6);jumpLeft(); move(); put(3);turnAround();move();

   }

}
