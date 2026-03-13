    //Torbert, e-mail: smtorbert@fcps.edu	
	 //version 6.17.2003

   import edu.fcps.Bucket;
   import javax.swing.*;
   
    public class Driver04
   {
       public static void main(String args[])
      {
         JFrame frame = new JFrame("Buckets");
         frame.setSize(600, 400);
         frame.setLocation(100, 100);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new BucketPanel());
         frame.setVisible(true);
      
         Bucket.setSpeed(1);
         Bucket.useTotal(true);  //uses the instance variables
      
         Bucket five = new Bucket(5);	
         Bucket three = new Bucket(3);
         Bucket four = new Bucket(4);
      	                        // five   three
         five.fill();				//   5      0
         five.pourInto(three);	//   2      3
         three.spill();				//   2		0
         five.pourInto(three);	//   0      2
         five.fill();				//   5      2
         five.pourInto(three);	//   4 success! 3
         four.fill();           
 
      }
   }