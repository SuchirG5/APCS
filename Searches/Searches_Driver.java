//name:    date:
import java.io.*;      //the File 
import java.util.*;    //the Scanner 
public class Searches_Driver
{
   private static int amount=1325;
   public static void main(String[] args) throws Exception
   {
      String[] apple = input("declaration.txt");
    //  ********   SORT YOUR ARRAY - you can use Arrays.sort(apple);  
    Arrays.sort(apple);
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a word: ");
      String target = sc.next();   //Liberty  
      int found = Searches.linear(apple, target);
      if(found == -1)
         System.out.println(target + " was not found by the linear search.");
      else
         System.out.println("Linear Search found it at location "+found+" in " + Searches.getLinearCount()+" comparisons.");
      int found2 = Searches.binary(apple, target);
      if(found2 == -1)
         System.out.println(target + " was not found by the binary search.");
      else
         System.out.println("Binary Search found it at location "+found2+" in " + Searches.getBinaryCount()+" comparisons.");
   }
   public static String[] input(String filename) throws Exception
   {
      Scanner infile = new Scanner( new File(filename) );
      String[] array = new String[amount];
      for (int k =0; k<amount; k++)    
         array[k] = infile.next();
      infile.close();
      return array;
   }
}
/////////////////////////////////////////////////////////
class Searches
{
   private static int linearCount = 0;
   private static int binaryCount = 0;      
   public static int getLinearCount()
   {
      return linearCount;
   }
   public static int getBinaryCount()
   {
      return binaryCount;
   }
   @SuppressWarnings("unchecked")//this removes the warning for Comparable
   public static int linear(Comparable[] array, Comparable target)
   { 
      for(int i = 0; i < array.length; i++)
      {
         linearCount++;
         if(array[i].equals(target))
         {
            
            return i;
         }
      }
      return -1;
   }
   
   @SuppressWarnings("unchecked")//this removes the warning for Comparable
   public static int binary(Comparable[] array, Comparable target)
   {
      return binaryhelper(array, target, 0, array.length);
   }
   
   @SuppressWarnings("unchecked")//this removes the warning for Comparable
   private static int binaryhelper(Comparable[] array, Comparable target, int start, int end)
   {
      int mid = (start+end)/2;
      if(mid==start && !array[mid].equals(target)) return -1;
      if(array[mid].compareTo(target) == 0)
      {
         return mid;
      }
      else if(array[mid].compareTo(target)>0)
      {
         binaryCount++;
         return binaryhelper(array, target, start, mid-1);
      }
      else
      {
         binaryCount++;
         return binaryhelper(array, target, mid+1, end);
      }
   }
}