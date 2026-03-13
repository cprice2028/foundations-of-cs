//Name  Date
  
import java.util.*;
import java.io.*; // Import for File and FileNotFoundException
import javax.swing.JOptionPane;

public class Driver10 {
    public static void main(String[] args)
     {

            Song[] songList = input();
            int totalTime = calcTime(songList);
            int longestSong = searchLongestSong(songList);
            display(songList, totalTime, longestSong);
            System.exit(0);
    }

    public static Song[] input()
     {
        Scanner infile = null;
        while(infile == null) 
        {
           try 
           {
              String filename = JOptionPane.showInputDialog("What song file would you like to open?");
              infile = new Scanner(new File(filename));
           } catch (FileNotFoundException e) 
           {
              JOptionPane.showMessageDialog(null, "File not found. Try again.");
              infile = null;
           } 
        }
        int numsongs = Integer.parseInt(infile.nextLine());
        Song[] lists = new Song[numsongs];
  
        for(int k = 0; k < numsongs; k++) 
        {
           String line = infile.nextLine();
           lists[k] = new Song(line);
        }
  
        infile.close();
        return lists;
    }

    public static int calcTime(Song[] songs)
    {
         int total = 0;
         for (int i = 0; i < songs.length; i++) 
         {
               total += songs[i].getTotal();
         }
         return total;
    }

    public static int searchLongestSong(Comparable[] songs) 
    {
         int longest = 0;
         for (int i = 1; i < songs.length; i++) 
         {
               if (songs[i].compareTo(songs[longest]) > 0)
                {
                  longest = i;
               }
         }
         return longest;
    }

    public static void display(Song[] array, int total, int longestSong) 
    {
      System.out.println("Total Time: " + total / 60 + "' " + total % 60 + "\"");
      System.out.println("Longest Song: " + array[longestSong].toString());
    }
}