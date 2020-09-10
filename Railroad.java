import java.util.*;

public class Railroad
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int x = scan.nextInt();
      int y = scan.nextInt();
      
      if((x%2 == 1)&&(y%2 == 0))
      {
      System.out.println("possible");
      }
      else if((x%2 == 0)&&(y%2 == 0))
      {
      System.out.println("possible");
      }
      else if ((x%2 == 0)&&(y%2 == 1))
      {
      System.out.println("impossible");
      }
      else if ((x%2 == 1)&&(y%2 == 1))
      {
      System.out.println("impossible");
      }
   }
}