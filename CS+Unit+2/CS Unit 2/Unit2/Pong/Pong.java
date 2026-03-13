//Name:  charlie & max  Date: 12/5

/********************************************************************
Extensions after Lab17
1)  Make Pong.  Copy all needed files from Lab14.  Modify BumperPanel so 
    that the keys move the bumper vertically. 

2)  Make a two-person Pong game.  Keep score.
************************************************************************/
import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;
import java.awt.image.*;

public class Pong
{
   public static void main(String[] args)
   { 
      JFrame frame = new JFrame("Unit2, Pong");
      frame.setSize(400, 400);
      frame.setLocation(100, 50);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new PongPanel());
      frame.setVisible(true);
   }


}