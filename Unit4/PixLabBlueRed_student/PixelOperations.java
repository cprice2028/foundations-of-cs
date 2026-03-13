   //
   // Torbert, 24 July 2013
	//
import java.awt.Color;
import java.awt.image.BufferedImage;
	//
public class PixelOperations
{
   public Color[][] getArray(BufferedImage img)
   {
      Color[][] arr;
      	//
      int numcols = img.getWidth();
      int numrows = img.getHeight();
      	//
      arr = new Color[numrows][numcols];
      	//
      for(int j = 0; j < arr.length; j++)
      {
         for(int k = 0; k < arr[0].length; k++)
         {
            int rgb = img.getRGB(k,j);
            	//
            arr[j][k] = new Color(rgb);
         }
      }
      	//
      return arr;
   }
   public void setImage(BufferedImage img, Color[][] arr)
   {
      for(int j = 0; j < arr.length; j++)
      {
         for(int k = 0; k < arr[0].length; k++)
         {
            Color tmp = arr[j][k];
               //
            int rgb = tmp.getRGB();
               //
            img.setRGB(k,j,rgb);
         }
      }
   }
      //
   	/**********************************************************************/
   	//
   	// pixel operations
   	// 
   public void zeroBlue(Color[][] arr)
   {
      for(int j = 0; j < arr.length; j++)
      {
         for(int k = 0; k < arr[0].length; k++)
         {
            Color tmp = arr[j][k];
            arr[j][k] = new Color( tmp.getRed(), tmp.getGreen(), 0 );
         }
      } 
   }
   	//--------> your new methods go here   <--------------
   public void negate(Color[][] arr)
   {
      for(int j = 0; j < arr.length; j++)
      {
         for(int k = 0; k < arr[0].length; k++)
         {
            Color tmp = arr[j][k];
            arr[j][k] = new Color( 255 - tmp.getRed(), 255 - tmp.getGreen(), 255 - tmp.getBlue() );
         }
      }
   }
   public void gray(Color[][] arr)
   {
      for(int j = 0; j < arr.length; j++)
      {
         for(int k = 0; k < arr[0].length; k++)
         {
            Color tmp = arr[j][k];
            int g = (int)(tmp.getRed()+tmp.getGreen()+ tmp.getBlue())/3;
            arr[j][k] = new Color( g , g, g );
         }
      }
   }
   public void colorq(Color[][] arr)
   {
      for(int j = 0; j < arr.length; j++)
      {
         for(int k = 0; k < arr[0].length; k++)
         {
            Color tmp = arr[j][k];
            int midX = (int)(arr[0].length / 2);
            int midY = (int)(arr.length / 2);
            int r = tmp.getRed();
            int g = tmp.getGreen();
            int b = tmp.getBlue();
            if (k < midX && j < midY) 
            {
               arr[j][k] = new Color(0, g, b);
            }        
            else if (k >= midX && j < midY) 
            {
               arr[j][k] = new Color(r, 0, b);
            }    
            else if (k < midX && j >= midY)
            {
               arr[j][k] = new Color(r, g, 0);
            }    
            else
            {
               int gray = (r + g + b) / 3;
               arr[j][k] = new Color(gray, gray, gray);   
            }
         }
      }
   } 
   public void mlr(Color[][] arr)
   {
      for(int j = 0; j < arr.length; j++)
      {
         for(int k = 0; k < arr[0].length; k++)
         {
            int midX = (int)(arr[0].length / 2);
            int cols = arr[0].length;
            if (k< midX)
            {
               arr[j][k] = arr[j][k];
            }
            else
            {
               arr[j][k] = arr[j][cols - 1 - k];
            }
         }
      }
   } 
   public void mud(Color[][] arr)
   {
      for(int j = 0; j < arr.length; j++)
      {
         for(int k = 0; k < arr[0].length; k++)
         {
            int midY = (int)(arr.length/2);
            int rows = arr.length;
            if (j< midY)
            {
               arr[j][k] = arr[j][k];
            }
            else
            {
               arr[j][k] = arr[rows-1-j][k];
            }
         }
      }      
   } 
   public void flr(Color[][] arr)
   {
      for(int j = 0; j < arr.length; j++)
      {
         for(int k = 0; k < (arr[0].length+1)/2; k++)
         {
            int cols = arr[0].length;
            Color tmp = arr[j][k];
            arr[j][k] = arr[j][cols-1-k];
            arr[j][cols - 1 - k] = tmp;
         }   
      }
   }
   public void fud(Color[][] arr)
   {
      for(int j = 0; j < (arr.length+1)/2; j++)
      {
         for(int k = 0; k < arr[0].length; k++)
         {
            int rows = arr.length;
            Color tmp = arr[j][k];
            arr[j][k] = arr[rows-1-j][k];
            arr[rows-1-j][k] = tmp;
         } 
      }
   }
   public void hbar(Color[][] arr)
   { 
      for(int j = 0; j < arr.length; j+=50)
      {
         for (int i = 0; i < 10 && (j + i) < arr.length; i++)
         {
            for(int k = 0; k < arr[0].length; k++)
            {
               arr[j + i][k] = Color.BLACK;
            }
         }
      }
   }
   public void sep(Color[][] arr)
   {  
      for(int j = 0; j < arr.length; j++)
      {
         for(int k = 50; k < arr[0].length; k+=50)
         {    
            for (int i = 0; i < 15 && (k + i) < arr[0].length; i++)
            {
               Color tmp = arr[j][k + i];                     
               int red = tmp.getRed();
               int green = tmp.getGreen();
               int blue = tmp.getBlue(); 
               int newRed = (int) ((0.393 * red) + (0.769 * green) + (0.189 * blue));
               int newGreen = (int) ((0.349 * red) + (0.686 * green) + (0.168 * blue));
               int newBlue = (int) ((0.272 * red) + (0.534 * green) + (0.131 * blue));
               newRed = Math.min(255, newRed);
               newGreen = Math.min(255, newGreen);
               newBlue = Math.min(255, newBlue);
               arr[j][k+i] = new Color(newRed,newGreen,newBlue);
            }
         }
      }
   }
   public void grid(Color[][] arr)
   {
      for(int j = 0; j < arr.length; j++)
      {
         for(int k = 25; k < arr[0].length; k+=25)
         {   
            for (int i = 0; i < 2 && (k + i) < arr[0].length; i++)
            {              
               arr[j][k+i] = Color.RED;
            }
         }
      }   
      for(int x = 25; x < arr.length; x+=25)
      {
         for (int u = 0; u < 2 && (x + u) < arr.length; u++)
         {
            for(int y = 0; y < arr[0].length; y++)
            {
               arr[x + u][y] = Color.RED;
            }
         }  
      }
   }
   public void check(Color[][] arr)
   {
      for (int j = 0; j < arr.length; j++)  
      {
         for (int k = 0; k < arr[0].length; k++)      
         {
            if (((j / 25) + (k / 25)) % 2 == 0) 
            {
               arr[j][k] = Color.BLACK;
            }
         }
      }   
   }
   public void blur(Color[][] arr)
   {
      for (int j = 0; j < arr.length; j++)  
      {
         for (int k = 0; k < arr[0].length; k++)      
         {
            int count = 1;
         int red = arr[j][k].getRed();
         int green = arr[j][k].getGreen();
         int blue = arr[j][k].getBlue();

         if (j + 1 < arr.length) {
            red += arr[j+1][k].getRed();
            green += arr[j+1][k].getGreen();
            blue += arr[j+1][k].getBlue();
            count++;
         }
         if (j - 1 >= 0) {
            red += arr[j-1][k].getRed();
            green += arr[j-1][k].getGreen();
            blue += arr[j-1][k].getBlue();
            count++;
         }
         if (k + 1 < arr[0].length) {
            red += arr[j][k+1].getRed();
            green += arr[j][k+1].getGreen();
            blue += arr[j][k+1].getBlue();
            count++;
         }
         if (k - 1 >= 0) {
            red += arr[j][k-1].getRed();
            green += arr[j][k-1].getGreen();
            blue += arr[j][k-1].getBlue();
            count++;
         }
         arr[j][k] = new Color(red / count, green / count, blue / count);
         }
      }   
   }
   public void blur20(Color[][] arr)
   {
      for (int i = 0; i < 20; i++) 
      {
         blur(arr);
      }     
   }
   public void posterize(Color[][] arr)
   {
      for (int j = 0; j < arr.length; j++)  
      {
         for (int k = 0; k < arr[0].length; k++)      
         {
            int red = arr[j][k].getRed();
         int green = arr[j][k].getGreen();
         int blue = arr[j][k].getBlue();
          if (arr[j][k].getRed() < 85) 
          {
            red =43;
         }
         if (arr[j][k].getBlue() < 85) 
          {
            blue=43;
         }
         if (arr[j][k].getGreen() < 85) 
          {
            green =43;
         }
         if (arr[j][k].getRed() < 170 && arr[j][k].getRed() >= 85) 
          {
            red = 128;
         }
         if (arr[j][k].getBlue() < 170 && arr[j][k].getBlue() >= 85) 
          {
            blue =128;
         }
         if (arr[j][k].getGreen() < 170 && arr[j][k].getGreen() >= 85) 
          {
            green =128;
         }
         if (arr[j][k].getRed() >= 170) 
          {
            red =213;
         }
         if (arr[j][k].getBlue() >= 170) 
          {
            blue =213;
         }
         if (arr[j][k].getGreen()>= 170) 
          {
            green =213;
         }
         arr[j][k] = new Color(red, green, blue);
         }
      }
   }
   public void pixelate10(Color[][] arr)
   {
      for (int j = 0; j < arr.length; j+=10)  
      {
         for (int k = 0; k < arr[0].length; k+=10)      
         {
            int red = 0;
            int green = 0;
            int blue = 0;
            int count = 0;
            for (int x = 0; x < 10; x++)
            {
               for (int y = 0; y < 10; y++)
               {
                  if (j + x < arr.length && k + y < arr[0].length)
                  {
                     red += arr[j + x][k + y].getRed();
                     green += arr[j + x][k + y].getGreen();
                     blue += arr[j + x][k + y].getBlue();
                     count++;
                  }
               }
            }
            red /= count;
            green /= count;
            blue /= count;
            for (int x = 0; x < 10; x++)
            {
               for (int y = 0; y < 10; y++)
               {
                  if (j + x < arr.length && k + y < arr[0].length)
                  {
                     arr[j + x][k + y] = new Color(red, green, blue);
                  }
               }
            }
         }
      }
   }
   public void pixelateAny(Color[][] arr, int z)
   {
      for (int j = 0; j < arr.length; j+=z)  
      {
         for (int k = 0; k < arr[0].length; k+=z)      
         {
            int red = 0;
            int green = 0;
            int blue = 0;
            int count = 0;
            for (int x = 0; x < z; x++)
            {
               for (int y = 0; y < z; y++)
               {
                  if (j + x < arr.length && k + y < arr[0].length)
                  {
                     red += arr[j + x][k + y].getRed();
                     green += arr[j + x][k + y].getGreen();
                     blue += arr[j + x][k + y].getBlue();
                     count++;
                  }
               }
            }
            red /= count;
            green /= count;
            blue /= count;
            for (int x = 0; x < z; x++)
            {
               for (int y = 0; y < z; y++)
               {
                  if (j + x < arr.length && k + y < arr[0].length)
                  {
                     arr[j + x][k + y] = new Color(red, green, blue);
                  }
               }
            }
         }
      }
   }
   public double colorDistance(Color c1, Color c2)
   {
      return Math.sqrt(Math.pow( c2.getRed() - c1.getRed(),2 ) + Math.pow( c2.getGreen() - c1.getGreen(),2 ) + Math.pow( c2.getBlue() - c1.getBlue() ,2 ));
   }
   public void edgeDetector(Color[][]arr)
   {
       for (int j=0;j<arr.length;j++)
       {
          for (int k=0;k<arr[0].length;k++)
          {
             if (j + 1 < arr.length && colorDistance(arr[j][k], arr[j + 1][k]) > 20) 
             {
                 arr[j][k] = Color.BLACK;
             }
              else if (k + 1 < arr[0].length && colorDistance(arr[j][k], arr[j][k + 1]) > 20) 
             {
                 arr[j][k] = Color.BLACK;
             } 
             else 
             {
                 arr[j][k] = Color.WHITE;
             }
          }
       } 
   }
   public void mystery(Color[][]arr)
   {
     int m = (int)(Math.random()*18+1);
      if (m == 1)
      {
         zeroBlue(arr);
      }
      else if (m == 2)
      {
         negate(arr);
      }
      else if (m == 3)
      {
         gray(arr);
      }
      else if (m == 4)
      {
         colorq(arr);
      }
      else if (m == 5)
      {
         mlr(arr);
      }
      else if (m == 6)
      {
         mud(arr);
      }
      else if (m == 7)
      {
         flr(arr);
      }
      else if (m == 8)
      {
         fud(arr);
      }
      else if (m == 9)
      {
         hbar(arr);
      }
      else if (m == 10)
      {
         sep(arr);
      }
      else if (m == 11)
      {
         grid(arr);
      }
      else if (m == 12)
      {
         check(arr);
      }
      else if (m == 13)
      {
         blur(arr);
      }
      else if (m == 14)
      {
         blur20(arr);
      }
      else if (m == 15)
      {
         posterize(arr);
      }
      else if (m == 16)
      {
         pixelate10(arr);
      }
      else if (m == 17)
      {
         pixelateAny(arr, (int)(Math.random()*30+1));
      }
      else if (m == 18)
      {
         edgeDetector(arr);
      }
   }
}
   //
	// end of file
	//