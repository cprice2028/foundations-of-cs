import java.util.Scanner;
public class Driver01
{
   public static final int NUMITEMS = 10;
   public static void main(String[] args)
   {
      double[] array = new double[NUMITEMS];
      //fill
      Scanner keyboard = new Scanner(System.in);
      for(int x = 0; x < NUMITEMS; x++)
      {
         System.out.print("#"+ (x+1) +": ");
         array[x] = keyboard.nextDouble();
      }
      //process         
      double sum = 0.0;
      for(int x=0; x<NUMITEMS; x++)
      {
         sum+= array[x];
      }
      double avg = sum/array.length;
      double min = array[0];
      for(int x = 1; x<NUMITEMS; x++)
      {
        min = Math.min(min, array[x]);
      }
      double max = array[0];
      for(int x = 1; x<NUMITEMS; x++)
      {
         
            max = Math.max(max, array[x]);
           
      }
     
      //display
      System.out.print("Sum: " + sum); 
      System.out.print(" Avg: " + avg);
      System.out.print(" Min: " + min); 
      System.out.print(" Max: " + max);
   }
}