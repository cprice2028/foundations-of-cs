   //Name: price                Date: 2/6
import java.util.Scanner;
import java.text.DecimalFormat;

public class Driver02
{
   public static final int NUMITEMS = 15;
   public static void main(String[] args)
   {
         //prompt the user and read the data
      double[] fahrenheit = new double [NUMITEMS];
      double[] celsius = new double [NUMITEMS];
      DecimalFormat a = new DecimalFormat("0.0");
      Scanner keyboard = new Scanner(System.in);
      for(int x = 0; x < 10; x++)
      {
         System.out.print("#"+ (x+1) +": ");
         fahrenheit[x] = keyboard.nextDouble();
      }
      for(int x=10; x<15; x++)
      {     
         fahrenheit[x] = Math.random()*1000;
      }
         //process the data
         
      for (int x=0; x<15; x++)
      {     
         celsius[x] = 0.55555555555555555555*(fahrenheit[x]-32);      
      }   
         //display the results
      System.out.println("Fahrenheit    | Celsius");
      System.out.println("--------------|----------------");
      for(int x=0; x<15; x++)
      {
         System.out.println(""+ a.format (fahrenheit[x])+"        | "+ a.format (celsius[x])); 
      }    
   }
}