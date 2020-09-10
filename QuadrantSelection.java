/* Andy Luu
*  Updated September 6th, 2018
*  Problem B: Quadrant Selection 
*/
import java.util.*;

public class QuadrantSelection
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int x = scan.nextInt();
      int y = scan.nextInt();
      
      if(x > 0 && y > 0)
      {
         System.out.println("1");
      }
      else if(x < 0 && y > 0)
      {
         System.out.println("2");
      }
      else if(x < 0 && y < 0)
      {
         System.out.println("3");
      }
      else if(x > 0 && y < 0)
      {
         System.out.println("4");
      }
      
      
   }
}