	//Name______________________________ Date_____________
   public class EMail
   {
      private String myUserName;
      private String myHostName;
      private String myExtension;
      public EMail(String address)
      {
         int a = address.indexOf("@");
         int p = address.indexOf(".");
         myUserName = address.substring(0, a);
         myHostName = address.substring(a + 1, p);
         myExtension = address.substring(p + 1);
      }
      public String getUserName()
      {
         return myUserName;
      }
      public String getHostName()
      {
         return myHostName;
      }
      public String getExtension()
      {
         return myExtension;
      }
      public String toString()
      {
         return myUserName + "@" + myHostName + "." + myExtension;
      }
   }