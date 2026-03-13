//Name______________________________ Date_____________

    public class Song implements Comparable<Song>
   {
   	//data fields
      private String myTitle;
      private int myMinutes, mySeconds;
   
   	//constructors
       public Song(String toBeParsed)
      {
         int colon = toBeParsed.indexOf(":");
         myMinutes = Integer.parseInt(toBeParsed.substring(0, colon));
         mySeconds = Integer.parseInt(toBeParsed.substring(colon + 1, colon + 3));
         myTitle = toBeParsed.substring(colon + 4, toBeParsed.length());
      }
      public Song()
      {
         myTitle = "";
         myMinutes = 0;
         mySeconds = 0;
      }
      public Song(Song arg) {
         myTitle = arg.getTitle();
         myMinutes = arg.getMinutes();
         mySeconds = arg.getSeconds();
      }
     
   	//accessors and modifiers
      
      public String getTitle()
      {
         return myTitle;
      }
   
       public int getMinutes()
      {
         return myMinutes;
      }
   
       public int getSeconds()
      {
         return mySeconds;
      }

      public int getTotal() {
         return myMinutes * 60 + mySeconds;
      }
      //other methods:  compareTo(), equals(), toString()
   	public int compareTo(Song s)
      {
         if (getTotal() < s.getTotal()) {

            return -1;
         } 
         if (getTotal() == s.getTotal())
          {
            return 0;
          }
         else 
         {
            return 1;
         }
         
      }
       public boolean equals(Song obj)
      {
         return compareTo(obj) == 0;
      }
       public String toString()
      {
         return myTitle + " (" + myMinutes + "' " + mySeconds + "\")";
      }
   }