//
// Torbert, 24 July 2013
//
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.swing.*;
//
public class DisplayPix extends JPanel
{
   private PixelOperations pix = new PixelOperations();

   public  ImageIcon i = new ImageIcon("images/beach.jpg");
   private ImageIcon message = new ImageIcon("images/msg.jpg");  //for encoder/decoder
   private ImageIcon moon = new ImageIcon("images/moon-surface.jpg"); //for chromakey

   private BufferedImage img= new BufferedImage(1600,1200,BufferedImage.TYPE_INT_RGB);

   private Graphics buf = img.getGraphics();

   private boolean clicked = false;
   
   private int x , y;

   public DisplayPix()
   {
      int w = img.getWidth();
      int h = img.getHeight();
   //
      buf.drawImage( i.getImage() , 0 , 0 , w , h , null );
   }
   public int getXval() // not getX !
   {
      return x;
   } 
   public int getYval() // not getY !
   {
      return y;
   } 
   public int getRow()
   {
      return y * img.getHeight() / getHeight();
   }
   public int getCol()
   {
      return x * img.getWidth() / getWidth();
   } 
   public int getRGB(int x, int y)
   {
      int xpos = x * img.getWidth( ) / getWidth() ;
      int ypos = y * img.getHeight() / getHeight();
   //
      return img.getRGB(xpos,ypos);
   }      
   public void update(int xval, int yval)
   {
      clicked = true;
   //
      x       = xval;
      y       = yval;
   }  
//
/**********************************************************************/
//
// pixel operations
// 
   public void zeroBlue()
   {
      Color[][] tmp = pix.getArray( img );
      pix.zeroBlue( tmp );
      pix.setImage( img , tmp );
   }
//
//    ------>  enter your methods below  <-----------
   public void negate()
   {
    Color[][] tmp = pix.getArray( img );
      pix.negate( tmp );
      pix.setImage( img , tmp );
      
   }
   public void gray()
   {
   Color[][] tmp = pix.getArray( img );
      pix.gray( tmp );
      pix.setImage( img , tmp );
   }
   public void colorq()
   {
   Color[][] tmp = pix.getArray( img );
      pix.colorq( tmp );
      pix.setImage( img , tmp );
   }
   public void mlr()
   {
   Color[][] tmp = pix.getArray( img );
      pix.mlr( tmp );
      pix.setImage( img , tmp );
   }
   public void mud()
   {
   Color[][] tmp = pix.getArray( img );
      pix.mud( tmp );
      pix.setImage( img , tmp );
   }
   public void flr()
   {
   Color[][] tmp = pix.getArray( img );
      pix.flr( tmp );
      pix.setImage( img , tmp );
   }
 public void fud()
   {
   Color[][] tmp = pix.getArray( img );
      pix.fud( tmp );
      pix.setImage( img , tmp );
   }
 public void hbar()
   {
   Color[][] tmp = pix.getArray( img );
      pix.hbar( tmp );
      pix.setImage( img , tmp );
   }
public void sep()
   {
   Color[][] tmp = pix.getArray( img );
      pix.sep( tmp );
      pix.setImage( img , tmp );
   }
public void grid()
   {
   Color[][] tmp = pix.getArray( img );
      pix.grid( tmp );
      pix.setImage( img , tmp );
   }
public void check()
   {
   Color[][] tmp = pix.getArray( img );
      pix.check( tmp );
      pix.setImage( img , tmp );
   }
   public void blur()
   {
   Color[][] tmp = pix.getArray( img );
      pix.blur( tmp );
      pix.setImage( img , tmp );
   }
   public void blur20()
   {
   Color[][] tmp = pix.getArray( img );
      pix.blur20( tmp );
      pix.setImage( img , tmp );
   }
   public void posterize()
   {
   Color[][] tmp = pix.getArray( img );
      pix.posterize( tmp );
      pix.setImage( img , tmp );
   }
   public void pixelate10()
   {
   Color[][] tmp = pix.getArray( img );
      pix.pixelate10( tmp );
      pix.setImage( img , tmp );
   }
   public void pixelateAny(int n)
   {
      Color[][] tmp = pix.getArray( img );
      pix.pixelateAny( tmp, n );
      pix.setImage( img , tmp );
   }
   public void edgeDetector()
   {
      Color[][] tmp = pix.getArray( img );
      pix.edgeDetector( tmp);
      pix.setImage( img , tmp );
   }
   public void mystery()
   {
      Color[][] tmp = pix.getArray( img );
      pix.mystery( tmp);
      pix.setImage( img , tmp );
   }



/**********************************************************************/
//  
   public void resetImage()
   {
      int w = img.getWidth();
      int h = img.getHeight();
   //
      buf.drawImage( i.getImage() , 0 , 0 , w , h , null );
   }  
   public boolean openImage()
   {
      int w = img.getWidth();
      int h = img.getHeight();
   //
      JFileChooser fc = new JFileChooser("images");
      fc.showOpenDialog( null );
      File f = fc.getSelectedFile();
   //
      try {
         i = new ImageIcon("images/" + f.getName());
      }
      catch(Exception e)
      {
         return false;
      }
      buf.drawImage( i.getImage() , 0 , 0 , w , h , null );
   //
      return true;
   }  
   public void up()
   {
      y = Math.max( 0 , y-1 );
   }
   public void down()
   {
      y = Math.min( getHeight()-1 , y+1 );
   }
   public void left()
   {
      x = Math.max( 0 , x-1 );
   }
   public void right()
   {
      x = Math.min( getWidth()-1 , x+1 );
   }   
   public void paintComponent(Graphics g)
   {
      g.drawImage( img , 0 , 0 , getWidth() , getHeight() , null );
   //
      if(clicked)
      {
         g.setColor(Color.black);
         g.drawLine(x-5,y-1,x+5,y-1);
         g.drawLine(x-5,y+1,x+5,y+1);
         g.drawLine(x-1,y-5,x-1,y+5);
         g.drawLine(x+1,y-5,x+1,y+5);
      //
         g.setColor(Color.yellow);
         g.drawLine(x-5,y,x-1,y);
         g.drawLine(x+1,y,x+5,y);
         g.drawLine(x,y-5,x,y-1);
         g.drawLine(x,y+1,x,y+5);
      }
   
   }
}
//
// end of file
//