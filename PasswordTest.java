class PasswordTest{
 
    public static void testPassword(String str)
      {
         Password pswd;
         if (str == null) {
             pswd = new Password();
             str = "default password";
         }
         else 
             pswd = new Password(str);
             
         if (pswd.isValid())
            System.out.println(str + " is valid");
         else 
            System.out.println( str + " is not valid, reason: " + pswd.getInvalidReason());
      }
      
      /* todo: write a test method that calls changePassword(String str) 
       */   
      
      public static void main(String[] args) throws Exception
      {
         testPassword(null);
         testPassword("heyThere1234!!");   
         testPassword("heyT");
         testPassword("heyThere1234ab&*^%");
         testPassword("heyThere Fred");
         testPassword("heyThere");
         testPassword("heythere1234");
         testPassword("heyThere1234"); 
         testPassword(".. .. ..");	
         
         
         //todo: test changePassword( String str )
         
      }//main method
   }