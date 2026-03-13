// Phil Ero 15JUL08

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;


public class PongPanel extends JPanel
{
   private static final int FRAME = 400;
   private static final Color BACKGROUND = new Color(203, 203, 203);
   private static final Color BALL_COLOR = Color.BLACK;
   private static final Color BUMPER_COLOR = Color.BLUE;
   private static final double BALL_DIAM = 50;
   private static final int BUMPER_WIDTH = 75;
   private static final int BUMPER_HEIGHT = 125;

   private BufferedImage myImage;
   private Graphics myBuffer;
   private Ball ball;
   private int hits;
   private Bumper bumper;
   private Paddle player1;
   private Paddle player2;
   private Timer t;  
   private int player1Score;
   private int player2Score;
   
   public PongPanel()
   {
      myImage =  new BufferedImage(400, 400, BufferedImage.TYPE_INT_RGB);
      myBuffer = myImage.getGraphics();
      myBuffer.setColor(BACKGROUND);
      myBuffer.fillRect(0, 0, 400, 400);
      int xPos = (int)(Math.random()*(FRAME-100) + 50);
      int yPos = (int)(Math.random()*(FRAME-100)+ 50);
   
   
      ball = new Ball(200, 200, 50, Color.white);
      player1 = new Paddle(10, 162, 15, 75, Color.blue);
      player2 = new Paddle(375, 162, 15, 75, Color.red);
      t = new Timer(1, new Listener());
      t.start();
   
      addMouseListener(new Mouse());
      addKeyListener(new Key());
      setFocusable(true);
      t = new Timer(10, new Listener());
      t.start();
      
   }
   private class Key extends KeyAdapter
   {
      public void keyPressed(KeyEvent e)
      { 
         if ( e.getKeyCode() ==  KeyEvent.VK_UP)
         {   
            if (player1.getY() - 10> 0)
            {
               player1.setY( player1.getY()-10);
            }
         } 
         if ( e.getKeyCode() ==  KeyEvent.VK_DOWN)
         {
            if( player1.getY() +10 < FRAME)
            {
               player1.setY( player1.getY()+10);
            }
         }  
      }
   }
   private class Mouse extends MouseAdapter
   {
      public void mouseClicked ( MouseEvent e)
      {
         if (e.isMetaDown())
         {
            if (player2.getY() - 10> 0)
            {
               player2.setY( player2.getY()-10);
            }
         }
         else
         {
            if( player2.getY() +10 < FRAME)
            {
               player2.setY( player2.getY()+10);
            }
         }
      }
   }
   public void paintComponent(Graphics g)
   {
      g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
   }  
   

   
   
   private class Listener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         myBuffer.setColor(BACKGROUND);
         myBuffer.fillRect(0, 0, FRAME, FRAME);
           
         ball.move(FRAME, FRAME);
                       
         ball.draw(myBuffer);
         player1.draw(myBuffer);
         player2.draw(myBuffer);
         myBuffer.setColor(Color.BLACK);
         myBuffer.setFont(new Font("Monospaced", Font.BOLD, 24));
         myBuffer.drawString("2:", FRAME - 150, 24);
         repaint();
         myBuffer.setFont(new Font("Monospaced", Font.BOLD, 24));
         myBuffer.drawString("1:", 10, 24);
         repaint();
      
      }
   }   
   public void relocate()
   {
         // find distance between ball & paddle centers
       
      if (player1.nextToPaddle(ball))
      {
         ball.setdx(ball.getdx()*-1);
      }
      if (player2.nextToPaddle(ball))
      {
         ball.setdx(ball.getdx()*-1);
      }
   	// make the ball switch dx
   }  
}
