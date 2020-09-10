import java.util.*;

public class NumberFun
{
   public static void main(String[] args)
   {
      int a,b,c;
      Scanner scan = new Scanner(System.in);
      int times = scan.nextInt();
      
      for(int x = 0; x<times; x++)
      {
         a = scan.nextInt();
         b = scan.nextInt();
         c = scan.nextInt();
      
         if(a+b == c)
         {
            System.out.println("Possible");
         }
         else if(a-b == c || b-a == c)
         {
            System.out.println("Possible");
         }
         else if(a*b == c)
         {
            System.out.println("Possible");
         }
         else if (((double)a/b) == c || ((double)b/a) == c)
         {
            System.out.println("Possible");
         }
         else
         {
            System.out.println("Impossible");
         }
      }
   }
}