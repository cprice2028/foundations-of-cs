	//Name:   Date:
import java.io.*;      //the File class
import java.util.*;    //the Scanner class
public class Driver02
{
   public static void main(String[] args) throws Exception
   {
  //   double[] array = input("..\\Lab00\\data.txt");  //Windows computers
  double[] array = input("../Lab00/data.txt");    //Macintosh computers
      sort(array);
      output(array, "output.txt");
      
   }
   public static double[] input(String filename) throws Exception
   {
      Scanner infile = new Scanner(new File(filename));
         	double [] array = new double[infile.nextInt()];
            for (int x = 0; x<array.length; x++)
            {
            	array[x] = infile.nextDouble();
            }
            infile.close();
            return array;
   }
   public static void sort(double[] array)
   {
      int maxPos;
      for(int k = 0; k < array.length; k++)
      {
         maxPos = findMax(array, array.length - k - 1);
         swap(array, maxPos, array.length - k - 1);
      }
   }
   public static int findMax(double[] array, int upper) //what does "upper" do???
   {
         int maxPos = 0;
         for (int x=0; x<=upper; x++)
         {
            if (array[x]>array[maxPos])
         		{
         			maxPos = x;
         		}
         	}
            return maxPos;
   }
   public static void swap(double[] array, int a, int b)//what are "a" and "b" for???
   {
      double temp = array[a];
      array[a] = array[b];
      array[b] = temp;
   }
   public static void output(double[] array, String filename) throws Exception
   {
      PrintWriter toFile = new PrintWriter(new FileWriter("output.txt"));
      for (int k = 0; k < array.length; k++) 
      {
         toFile.println(array[k]);
      }
      toFile.close();
      
   }
}