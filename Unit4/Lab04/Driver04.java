 //name:  price  date:  2/11

import java.io.*;      //the File class
import java.util.*;    //the Scanner class
import javax.swing.JOptionPane;
import java.util.Scanner; 

public class Driver04
{
   public static void main(String[] args) 
   {
      Scanner infile = null;
      while(true)
      {
         try
         {
            String filename = JOptionPane.showInputDialog("Enter filename");
            infile = new Scanner (new File(filename));
            break;
         }
         catch (FileNotFoundException e)
         {
            JOptionPane.showMessageDialog(null, "Error: File not found.");  
         }
      }
      int n = infile.nextInt();
      double[] array = new double [n];
      	//read the text file into the array
      for(int x = 0; x < array.length; x++)
      {
         array[x] = infile.nextDouble();
      }
      infile.close();
      double sum = 0.0;
      for(int x=0; x<array.length; x++)
      {
         sum+= array[x];
      }
      double avg = sum/array.length;
      double min = array[0];
      for(int x = 1; x<array.length; x++)
      {
         min = Math.min(min, array[x]);
      }
      double max = array[0];
      for(int x = 0; x<array.length; x++)
      {
         max = Math.max(max, array[x]);
      }
               //display
      System.out.println("Sum: " + sum); 
      System.out.println(" Avg: " + avg);
      System.out.println(" Min: " + min); 
      System.out.println(" Max: " + max);
   }
}
/************************************
Sum: 3291074.1965423366
Avg: 504.3791872095535
Min: 0.027375512843708094
Max: 999.9780398236477
*************************************/