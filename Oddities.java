import java.util.*;

public class Oddities
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      for(int x = 0; x<n; x++)
      {
         int n1 = scan.nextInt();
         if(n1%2 == 1)
         {
            System.out.println(n1+" is odd");
         }
         else if(n1%2 == -1)
         {
            System.out.println(n1+" is odd");
         }
         else if(n1%2 == 0)
         {
            System.out.println(n1+" is even");
         }
      }
   }
}