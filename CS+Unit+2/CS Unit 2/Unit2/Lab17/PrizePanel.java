 //Name:   price Date: 12/3
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
public class PrizePanel extends JPanel
{
   
   private static final int FRAME = 400;
   private static final Color BACKGROUND = new Color(204, 204, 204);
   private BufferedImage myImage;
   private Graphics myBuffer;
   private Ball ball;
   private Polkadot pd;
   private Timer t; 
   private int hits; 
   public PrizePanel()//constructor   
   {
        
      myImage =  new BufferedImage(FRAME, FRAME, BufferedImage.TYPE_INT_RGB);
      myBuffer = myImage.getGraphics();
      myBuffer.setColor(BACKGROUND);
      myBuffer.fillRect(0, 0, FRAME,FRAME);
      int xPos = (int)(Math.random()*(FRAME-100) + 50);
      int yPos = (int)(Math.random()*(FRAME-100)+ 50);
      ball =  new Ball ();
      pd = new Polkadot ();
      t = new Timer(10, new Listener());
      t.start();    
               
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
            if (pd.getY() - 10> 0)
            {
               pd.setY( pd.getY()-10);
            }
         }
              
         if ( e.getKeyCode() ==  KeyEvent.VK_DOWN)
         {
            if( pd.getY() +10 < FRAME)
            {
               pd.setY( pd.getY()+10);
            }
         }
         if ( e.getKeyCode() ==  KeyEvent.VK_LEFT)
         {
            if(pd.getX() -10 >0)
            {
               pd.setX( pd.getX()-10);
            }
         }
         if ( e.getKeyCode() ==  KeyEvent.VK_RIGHT)
         {
            if(pd.getX() +10< FRAME)
            {
               pd.setX( pd.getX()+10);
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
         collide(ball, pd);
           
         ball.draw(myBuffer);
         pd.draw(myBuffer);
         myBuffer.setColor(Color.BLACK);
         myBuffer.setFont(new Font("Monospaced", Font.BOLD, 24));
         myBuffer.drawString("Count: " + hits, FRAME - 150, 24);
         repaint();
      }
   }   
   private void collide(Ball b, Polkadot pd)
   {
      double d = distance(ball.getX(), ball.getY(), pd.getX(), pd.getY());  
      if ( d <= ball.getRadius() + pd.getRadius())
      {
         hits++;
         pd.jump(FRAME, FRAME);
         
      }
   }
   private double distance(double x1, double y1, double x2, double y2)
   {
      return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2))  ;
   }
}
