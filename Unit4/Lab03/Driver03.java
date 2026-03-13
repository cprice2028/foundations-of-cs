   //Name price Date 2/10
   import java.io.*;      //the File class
   import java.util.*; 
   import java.text.DecimalFormat;
   import java.util.Scanner; 
   import javax.swing.* ; //the Scanner class
   
    public class Driver03
   {
      public static final int NUMITEMS = 20;
       public static void main(String[] args) throws Exception
      {
       String filePath = JOptionPane.showInputDialog("Enter the full file path:");
       File file = new File(filePath);
       
          double[] fahrenheit = new double [NUMITEMS];
           DecimalFormat a = new DecimalFormat("0.00");
          double[] celsius = new double [NUMITEMS];
      	//read the text file into the array
      	Scanner infile = new Scanner(file);
         for(int x = 0; x < 20; x++)
      {
          fahrenheit[x] = infile.nextDouble();
      }
      infile.close();

      	
      	//process the array
      	 for (int x=0; x<20; x++)
      {     
         celsius[x] = 0.55555555555555555555*(fahrenheit[x]-32);      
      }  
      	
      	//output
      	 System.out.println("Fahrenheit    | Celsius");
          System.out.println("--------------|----------------");
      for(int x=0; x<NUMITEMS; x++)
      {
         System.out.println(""+ a.format (fahrenheit[x])+"        | "+ a.format (celsius[x])); 
      }    

      	
      	}
   }
	/************************************
	Fahrenheit      | Celsius
	----------------|-------------------
	5.0             | -15.0
	10.0            | -12.222222222222221
	15.0            | -9.444444444444445
	20.0            | -6.666666666666667
	25.0            | -3.888888888888889
	26.0            | -3.3333333333333335
	28.0            | -2.2222222222222223
	31.0            | -0.5555555555555556
	37.0            | 2.7777777777777777
	45.0            | 7.222222222222222
	48.0            | 8.88888888888889
	51.0            | 10.555555555555555
	75.0            | 23.88888888888889
	98.6            | 37.0
	212.0           | 100.0
	451.0           | 232.77777777777777
	32.0            | 0.0
	0.0             | -17.77777777777778
	9.29            | -12.616666666666667
	19.77           | -6.794444444444445

	END OF EXECUTION, press any key:
	*************************************/