//Name: price   Date: 3/20
import java.io.*;
import java.util.*;
public class Driver01ext 
{
   public static void main(String[] args) throws Exception 
   {
      // double[] array = input("..\\Lab00\\data.txt"); //Windows computers
      Scanner infile = new Scanner(new File("../Lab00/data.txt"));
      double[] array = new double[infile.nextInt()];
      for (int x = 0; x < array.length; x++) 
      {
         array[x] = infile.nextDouble();
      }
      infile.close();
      // input
      for (int i = 0; i < array.length - 1; i++) 
      {
         int maxIndex = 0;
         for (int j = 1; j < array.length - i; j++) 
         {
            if (array[j] > array[maxIndex]) {
               maxIndex = j;
            }
         }
         double temp = array[maxIndex];
         array[maxIndex] = array[array.length - 1 - i];
         array[array.length - 1 - i] = temp;
      }
      // output
      PrintWriter toFile = new PrintWriter(new FileWriter("output.txt"));
      for (int k = 0; k < array.length; k++) 
      {
         toFile.println(array[k]);
      }
      toFile.close();
   }
}