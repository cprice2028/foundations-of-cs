//name:  price  date:  2/25

import java.io.*;      //the File class
import java.util.*;    //the Scanner class
import javax.swing.JOptionPane;
import java.util.Scanner; 

public class Driver08
{
   public static void main(String[] args) throws Exception
   
   {
      Scanner infile = new Scanner(new File ("words.txt"));
      int n = infile.nextInt();
      String[] array = new String[n];
      
      for(int x = 0; x < array.length; x++)
      {
         array[x] = infile.next();
      }
      infile.close();
      while(true)
      {
         String myWord = JOptionPane.showInputDialog("Word? (Type -1 to quit.)");
         if (myWord.equals("-1"))
           
         {System.out.println("Good-bye.");
            System.exit(0);
         }
      
         boolean wrd = false;
      
         for(int x = 0; x < array.length; ++x) 
         {
            if (myWord.equalsIgnoreCase(array[x])) 
            {
               System.out.println("Yes, \"" + myWord + "\" is a word, #" + (x + 1) + ".");
               wrd = true;
               break;
            }
         }
      
         if (!wrd) 
         {
            System.out.println("Sorry, \"" + myWord + "\" is not a word.");
         
         }
      }
      
   }
}
