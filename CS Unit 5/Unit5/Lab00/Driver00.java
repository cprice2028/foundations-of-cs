import java.io.*;        //the File class 
import java.util.*;      //the Scanner class 3 
public class Driver00 
{ 
     public static void main(String[] args) throws Exception   
     {  
        Scanner infile = new Scanner(new File("data.txt")); 
        int numitems = infile.nextInt();    
        double[] array = new double[numitems];
        for(int k = 0; k < numitems; k++)  
        array[k] = infile.nextDouble();
        infile.close();  
        int minPos, maxPos;                      
        minPos = findMin(array);
        maxPos = findMax(array);
        System.out.println("Minimum value: " + array[minPos]);
        System.out.println("Maximum value: " + array[maxPos]);  
     }
    private static int findMin(double[] apple)
     {      
        int minPos = 0;    
        for(int k = 0; k < apple.length; k++)    
        {      
            if(apple[k] < apple[minPos])      
            {         
                minPos = k;      
            }    
        }    
        return minPos;   
    }
    private static int findMax(double[] banana) 
     {   
        int maxPos = 0;    
        for(int k = 0; k < banana.length; k++)    
        {      
            if(banana[k] > banana[maxPos])      
            {             
                maxPos = k;      
            }    
        }    
        return maxPos;
    }
}