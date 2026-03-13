import java.io.*;      
import java.util.*; 
public class Driver03 
    {   
    public static void main(String[] args) 
    {       
    int[] array = {100, 101, 102, 103, 104, 105, 106, 107, 108, 109};   
    print(array);       
    scramble(array); 
    print(array);    
    sort(array);    
    print(array);  
    }
    public static void print(int[] array) 
    {
    for (int i = 0; i < array.length; i++) 
    {
    System.out.print(array[i] + " "); 
    }
    System.out.println();
    }
    public static void scramble(int[] array) 
    {
    for (int i = 0; i < array.length; i++) 
    {
    int j = (int)(Math.random() * array.length);
    swap(array, i, j);
    }
   }
    public static void sort(int[] array) 
    {   
        int maxPos;
      for(int k = 0; k < array.length; k++)
      {
         maxPos = findMax(array, array.length - k - 1);
         swap(array, maxPos, array.length - k - 1);
      }
}
public static int findMax(int[] array, int upper) //what does "upper" do???
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
   public static void swap(int[] array, int a, int b)//what are "a" and "b" for???
   {
      int temp = array[a];
      array[a] = array[b];
      array[b] = temp;
   }
}
