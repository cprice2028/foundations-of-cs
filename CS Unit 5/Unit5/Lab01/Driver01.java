//Name: price   Date: 3/20
/*Repeat N – 1 times, where N is the size of the data set:
	1.  Find the position of the max in the unsorted part of the array.
   2.  Swap the max in the unsorted part with the last item in the unsorted part.*/
public class Driver01 
{
   public static void main(String[] args) throws Exception 
   {
      double[] array = { 2.0, 3.7, 9.9, 8.1, 8.5, 7.4, 1.0, 6.2 };
      // input
      for (int i = 0; i < array.length - 1; i++)
       {
         int maxIndex = 0;
         for (int j = 1; j < array.length - i; j++) 
         {
            if (array[j] > array[maxIndex]) 
            {
               maxIndex = j;
            }
         }
         double temp = array[maxIndex];
         array[maxIndex] = array[array.length - 1 -i];
         array[array.length - 1 - i ] = temp;
      }
      /*for( int i = 0; i <array.length-1;i++)
      {
         int minimumIndex = i;
         for (int j= i+1; j < array.length; j++)
         {
            if (array[j] < array[minimumIndex])
            {
               minimumIndex = j;
            }
         }
         double temp = array[i];
         array[i] = array[minimumIndex];
         array[minimumIndex] = temp;
      }
         */
      // output
      for (int i = 0; i < array.length; i++)
      {
         System.out.println(array[i]);
      }
   }
}