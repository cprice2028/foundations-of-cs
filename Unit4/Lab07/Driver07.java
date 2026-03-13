 //Name price Date 2/18
import java.io.*;
import java.text.*;
import java.util.*;    
import javax.swing.*;

public class Driver07
{
   public static void main(String[] args) throws Exception
   {
      int y;
      String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
      String filename = "output_" + timestamp + ".txt";
      Shape[] array = new Shape[(int)(Math.random()*50+12)]; 
      PrintWriter toFile = new PrintWriter(new FileWriter(filename));
      //create the objects
     
      //test the instance methods
      for (y=0;y<array.length; y++)
      {
         double z = Math.random()*90.0;
         double u = Math.random()*90.0;
         switch((int)(Math.random()*4.0))
         {
            case 0 :
               array[y] = new Circle(z);
               break;
            case 1:
               array[y] = new Rectangle(z, u); 
               break ;
            case 2:
               array[y] = new Square(z);	
               break;
            case 3:
               array[y]= new Triangle(z); 
               break;
            default:
               array[y] = null;
               break;
         }
      }
      toFile.println("Shapes");
      toFile.println("------");
   
      for(y=0;y<array.length;y++) 
      {
         toFile.println("area = " + array[y].findArea() + "\t\t" + array[y]);
      }    
      toFile.close();  //necessary!
   }
}